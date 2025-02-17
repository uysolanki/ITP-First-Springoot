package com.itp.ITPFirstSpringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

@Bean
public OpenAPI customOpenAPI() {
return new OpenAPI()
.info(new Info()
.title("College Management API")
.description("College API reference for developers")
.version("1.0")
.termsOfService("http://abc.com/terms")
.license(new io.swagger.v3.oas.models.info.License()
.name("Library License")
.url("http://abc.com/license")));
}
}
