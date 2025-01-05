package com.activiti.practice.config;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActivitiConfig {

    @Bean
    public ProcessEngine getProcessEngine() {
        return ProcessEngines.getDefaultProcessEngine();
    }
}
