package com.fairissac.ComponentScan;

import com.fairissac.spring_in_5_steps.scope.JdbcConnection;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.fairissac.spring_in_5_steps.scope")
public class ComponentDAO {
    @Autowired //we are letting know spring that this is a dependency that must be injected
    JdbcConnection jdbcConnection ;

    //JdbcConnection is marked as a component, so spring must have already created a bean for it.
   public JdbcConnection getJdbcConnection(){
       return jdbcConnection;
   }
    public void setJdbcConnection(JdbcConnection jdbcConnection){
        this.jdbcConnection = jdbcConnection;  //automatically assigns an instance of the JdbcConnection to this - since we have mentioned this as an autowire in the start
    }


}
