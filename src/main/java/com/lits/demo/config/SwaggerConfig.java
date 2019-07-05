package com.lits.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
//@Import(springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration.class)
@Slf4j
public class SwaggerConfig {  // in this class you can configure SWAGGER page at localhost:8080/swagger-ui.html
//    public static final String AUTHORIZATION_HEADER = "Authorization";
//    public static final String DEFAULT_INCLUDE_PATTERN = "/api/.*";

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo(){
        ApiInfo apiInfo = new ApiInfo("My REST API (by loco. described in SwaggerConfig.class.","Some description of API", "API TOS", "Terms of service", "myaddress@maycomp.com", "Licence of API", "Api licence URL");

        return apiInfo;
    }













//        Here is by Ilnitsky Serhiy - he wes trying to keep tokens and make swagger work.
//        StopWatch watch = new StopWatch();
//        watch.start();
//
//        log.debug("Starting Swagger");
//
//        Contact contact = new Contact(
//                "Serhii Ilnytskyi",
//                "http://mysite.com",
//                "serhiiilnytskyi@gmail.com");
////
//        List<VendorExtension> vext = new ArrayList<😠);
//        ApiInfo apiInfo = new ApiInfo(
//                "Backend API",
//                "This is the best stuff",
//                "7.7.7",
//                "http://mysite.com",
//                contact,
//                "MIT",
//                "http://mysite.com",
//                vext);
//
//



//        Docket docket = new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo)
//                .pathMapping("/")
//                .apiInfo(ApiInfo.DEFAULT)
//                .forCodeGeneration(true)
//                .genericModelSubstitutes(ResponseEntity.class)
//                .ignoredParameterTypes(Pageable.class)
//                .ignoredParameterTypes(java.sql.Date.class)
//                .directModelSubstitute(java.time.LocalDate.class, java.sql.Date.class)
//                .directModelSubstitute(java.time.ZonedDateTime.class, Date.class)
//                .directModelSubstitute(java.time.LocalDateTime.class, Date.class)
//                .securityContexts(Lists.newArrayList(securityContext()))
//                .securitySchemes(Lists.newArrayList(apiKey()))
//                .useDefaultResponseMessages(false);
//
//        docket = docket.select()
//                .paths(regex(DEFAULT_INCLUDE_PATTERN))
//                .build();
//        watch.stop();
//        log.debug("Started Swagger in {} ms", watch.getTotalTimeMillis());
//        return docket;
//    }

//    private ApiKey apiKey() {
//        return new ApiKey("JWT", AUTHORIZATION_HEADER, "header");
//        schemeList.add(new ApiKey(HttpHeaders.AUTHORIZATION, "JWT", "header"));
//    }
//
//    private SecurityContext securityContext() {
//        return SecurityContext.builder()
//                .securityReferences(defaultAuth())
//                .forPaths(regex(DEFAULT_INCLUDE_PATTERN))
//                .build();
//    }

//    List<SecurityReference> defaultAuth() {
//        AuthorizationScope authorizationScope
//                = new AuthorizationScope("global", "accessEverything");
//        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
//        authorizationScopes[0] = authorizationScope;
//        return Lists.newArrayList(
//                new SecurityReference("JWT", authorizationScopes));
//    }

}