package nandhini.learning.restful_web_services.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

//model or entity representing a user
@Entity(name = "user_details")
public class User {


    @Id
    @GeneratedValue
    private Integer id;

    @Size(min = 2, message = "Name should atleast be of 2 characters")
    @JsonProperty("user_name")
    private String name;

    //@Past(message = "Birthdate should be from the past")
    @Column(name = "birthdate")
    //@JsonProperty("birth_date") //for customising your field name
    private LocalDate birthDate;

    public User(Integer id, String name,  LocalDate birthDate) {
        this.birthDate = birthDate;
        this.id = id;
        this.name = name;
    }

    public User() {

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
