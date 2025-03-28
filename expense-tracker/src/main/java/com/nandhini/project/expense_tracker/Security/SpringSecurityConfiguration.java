package com.nandhini.project.expense_tracker.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.function.Function;

@Configuration
public class SpringSecurityConfiguration {

    @Bean
    public InMemoryUserDetailsManager storeUserDetails(){
        UserDetails user1 = createUserDetails("nandhini", "dummy");
        UserDetails user2 = createUserDetails("roopleen", "dummydummy");

        return new InMemoryUserDetailsManager(user1, user2);
    }

    public UserDetails createUserDetails(String username, String password){
        Function<String, String> passwordEncoder = input -> createPasswordEncoder().encode(input);

        UserDetails userDetails = User.builder()
                        .passwordEncoder(passwordEncoder)
                        .username(username)
                        .password(password)
                        .roles("USER", "ADMIN")
                        .build();

        return userDetails;
    }

    @Bean
    public PasswordEncoder createPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
}