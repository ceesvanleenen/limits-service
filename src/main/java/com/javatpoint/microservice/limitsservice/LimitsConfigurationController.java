package com.javatpoint.microservice.limitsservice;

import com.javatpoint.microservice.limitsservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javatpoint.microservice.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retriveLimitsFromConfigurations()
    {
        return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum(), configuration.getName());
    }

}
