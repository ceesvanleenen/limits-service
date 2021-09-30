package com.javatpoint.microservice.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties("limits-service")
public class Configuration {
    private int minimum;
    private int maximum;
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setMaximum(int maximum)
    {
        this.maximum = maximum;
    }
    public void setMinimum(int minimum)
    {
        this.minimum = minimum;
    }
    public int getMaximum()
    {
        return maximum;
    }
    public int getMinimum()
    {
        return minimum;
    }
}
