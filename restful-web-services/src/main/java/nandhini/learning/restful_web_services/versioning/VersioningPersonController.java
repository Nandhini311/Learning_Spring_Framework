package nandhini.learning.restful_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

    //URI Versioning.
    @GetMapping("/v1/person")
    public PersonV1 getFirstVersionOfPerson(){
        return new PersonV1("Bob Charlie");
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondVersionOfPerson(){
        return new PersonV2(new Name("Bob", "Charlie"));
    }

    //RequestParam Versioning.
    @GetMapping(value = "/person", params = "version=1")
    public PersonV1 getFirstVersionOfPersonParam(){
        return new PersonV1("Nandhini Jeyanthi");
    }

    @GetMapping(value = "/person", params = "version=2")
    public PersonV2 getSecondVersionOfPersonParam(){
        return new PersonV2(new Name("Nandhini", "Jeyanthi"));
    }

    //header Versioning
    @GetMapping(value = "/person/header", headers = "X-API-VERSION=1")
    public PersonV1 getFirstVersionOfPersonHeaders(){
        return new PersonV1("Nandhini Jeyanthi");
    }

    @GetMapping(value = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 getSecondVersionOfPersonHeaders(){
        return new PersonV2(new Name("Nandhini", "Jeyanthi"));
    }

    //media type versioning
    @GetMapping(value = "/person/header", produces = "application/vnd.company.app-v1+json")
    public PersonV1 getFirstVersionOfPersonMediaType(){
        return new PersonV1("Nandhini Jeyanthi");
    }

}
