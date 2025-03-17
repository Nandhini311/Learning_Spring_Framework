package com.fairissac.spring_in_5_steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDAO {
    @Autowired //we are letting know spring that this is a dependency that must be injected
   JdbcConnection jdbcConnection;

    //JdbcConnection is marked as a component, so spring must have already created a bean for it.
   public JdbcConnection getJdbcConnection(){
       return jdbcConnection;
   }
    public void setJdbcConnection(JdbcConnection jdbcConnection){
        this.jdbcConnection = jdbcConnection;  //automatically assigns an instance of the JdbcConnection to this - since we have mentioned this as an autowire in the start
    }
}
