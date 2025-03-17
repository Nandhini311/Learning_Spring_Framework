package com.fairissac.spring_in_5_steps.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

    @Value("${external.service.url}")
    private String url;

    public String returnServiceURL(){
        return url;
    }
}
