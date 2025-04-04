package nandhini.learning.restful_web_services.user;

import jakarta.validation.Valid;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;
import java.time.LocalDate;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserResource {

    private final UserDaoService service;

    //constructor injection
    public UserResource(UserDaoService userDaoService) {
        this.service = userDaoService;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }

    //getting details of a specific user
    //along with returning the user details, we also want to return the link to users //localhost:8080/users

    //EntityModel - wrap the user in this
    //WebMvcLinkBuilder

    @GetMapping("/users/{id}")
    public EntityModel<User> retreiveSpecificUser(@PathVariable Integer id){
        User user = service.findOne(id);
        if(user == null){
            throw new UserNotFoundException("id: " + id);
            //UserNotFoundException is a custom class that we created which extends the RuntimeException.
        }
        EntityModel<User> entityModel = EntityModel.of(user);
        WebMvcLinkBuilder link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).retrieveAllUsers());
        entityModel.add(link.withRel("all-users"));
        return entityModel;
    }


    //now to insert user values
    @PostMapping("/users")
    //@Request Body - means to bind the method parameter to the server.
    public ResponseEntity createUser( @Valid @RequestBody User user){
        //what is reponseEntity - whole of the response, including message body, response header, status code
        //data we get from the server will be added to the list.
        User savedUser = service.save(user); //we have defined a method save in the UserDaoService Component
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
        //here we are creating a URI dynamically for when a new resource is created in RestApi.
        //ServletUriComponentsBuilder.fromCurrentReqeust() - get's the current request URL.
        //.path("/{id}") - appends /{id} to the current URL
        //.buildAndExpand - replaces {id} with the actual id
        //.toURI - conversts the final URL to URI object.

        //return ResponseEntity.created(null).build(); //- creating a HTTP response using ResponseEntity for 201 created , no location header, if there is
        //location header, user will be re-directed to that once the resource is created.
        //URI - for location header, URI - uniform resource identifier a string that uniquely identifies a resource in the internet
        return ResponseEntity.created(location).build();
    }

    //deleting a user.
    @DeleteMapping("/users/delete/{id}")
    public void deleteUser( @PathVariable int id){
        service.DeleteById(id);
    }

}
