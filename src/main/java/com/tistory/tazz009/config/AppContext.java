package com.tistory.tazz009.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(basePackages="com.tistory.tazz009", 
	excludeFilters=@ComponentScan.Filter(type=FilterType.ANNOTATION, value=Controller.class) )
public class AppContext {

}
