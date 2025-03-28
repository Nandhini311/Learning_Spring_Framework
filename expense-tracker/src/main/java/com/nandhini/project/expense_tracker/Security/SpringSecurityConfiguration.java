package com.nandhini.project.expense_tracker.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.util.function.Function;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SpringSecurityConfiguration {

    @Bean //Bean - object gets created only once and will be called whenever needed.
    public InMemoryUserDetailsManager storeUserDetails(){
        UserDetails user1 = createUserDetails("Nandhini", "dummy");
        UserDetails user2 = createUserDetails("Roopleen", "dummydummy");

        //accepts multiple users args..
        return new InMemoryUserDetailsManager(user1, user2);
    }

    //method to generate the userDetails
    public UserDetails createUserDetails(String username, String password){
        Function<String, String> passwordEncoder = input -> createPasswordEncoder().encode(input);
        //lambda function that performs the encryption.

        UserDetails userDetails = User.builder()
                        .passwordEncoder(passwordEncoder)
                //telling spring how the encryption needs to be done
                //why can't we directly mention the encryption method here - BCryptPasswordEncoder()
                //cuz passwordEncoder expects Function<String, String> passwordEcoder as parameter.
                        .username(username) //to set the user name
                        .password(password) //to set the password
                        .roles("USER", "ADMIN")
                        .build();

        return userDetails;
    }

    @Bean
    //method that sends the encryption method.
    public PasswordEncoder createPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(
                auth -> auth.anyRequest().authenticated()); //to authenticate every requrest
        http.formLogin(withDefaults()); //to enable the default login page
        //above two are by default in place.
        //we are disabling csrf - cross site request forgery and enabling filters to be able to access h2 console.
        http.csrf(csrf -> csrf.disable());
        http.headers(headers -> headers.frameOptions(frame -> frame.sameOrigin()));
        return http.build();
        //if we are customizing the securityFilterChain, we must re-build it.
        }
    }