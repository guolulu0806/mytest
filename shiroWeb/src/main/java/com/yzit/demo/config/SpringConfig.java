package com.yzit.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.yzit.demo.controller","com.yzit.demo.service"})
public class SpringConfig {

}
