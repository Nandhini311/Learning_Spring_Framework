package nandhini.learning.restful_web_services.jpa;

import jakarta.validation.Valid;
import nandhini.learning.restful_web_services.user.User;
import nandhini.learning.restful_web_services.user.UserDaoService;
import nandhini.learning.restful_web_services.user.UserNotFoundException;
import nandhini.learning.restful_web_services.user.UserResource;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

public class UserJpaResource {

        private UserRepository repository;

        //consturctor injection
        public void UserRepository(UserRepository repository){
            this.repository = repository;
        }

        @GetMapping("/jpa/users")
        public List<User> retrieveAllUsers(){
            return repository.findAll(); //built in
        }

        @GetMapping("/jpa/users/{id}")
        public EntityModel<User> retreiveSpecificUser(@PathVariable Integer id){
            User user = repository.findById(id).get();
            if(re()){
                throw new UserNotFoundException("id: " + id);
                //UserNotFoundException is a custom class that we created which extends the RuntimeException.
            }
            EntityModel<User> entityModel = EntityModel.of(user);
            WebMvcLinkBuilder link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).retrieveAllUsers());
            entityModel.add(link.withRel("all-users"));
            return entityModel;
        }


        //now to insert user values
        @PostMapping("/jpa/users")
        public ResponseEntity createUser(@Valid @RequestBody User user) {
//            URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
//            return ResponseEntity.created(location).build();
//
        }

        @DeleteMapping("/jpa/users/delete/{id}")
        public void deleteUser( @PathVariable int id){
            repository.removeUserById(id);
        }

}
