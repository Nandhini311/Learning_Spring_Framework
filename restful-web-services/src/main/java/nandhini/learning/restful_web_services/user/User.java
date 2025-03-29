package nandhini.learning.restful_web_services.user;

import java.time.LocalDate;

//model or entity representing a user
public class User {

    private Integer id;
    private String name;
    private LocalDate birthDate;

    public User(Integer id, String name,  LocalDate birthDate) {
        this.birthDate = birthDate;
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }



}
