package com.example;

import com.google.common.base.Predicate;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Created by Ravi on 5/10/2017.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(paths())
                .build().apiInfo(metadata());
    }

    private Predicate<String> paths(){
        Predicate<String> or = (Predicate<String>) regex("/say-hello.*");
        return or;
    }

    private ApiInfo metadata() {
        Contact contact = new Contact("Ravi", "https://github.com/ravithota/", "ravit2709@gmail.com");
        return new ApiInfoBuilder().title("say / hello GET Services")
                .description("say hello GET Service").version("1.0").contact(contact).build();
    }

   /* @Bean
    UiConfiguration uiConfig() {
        return new UiConfiguration("validatorUrl");
    }*/
}
