package com.shu.sfoan.swagger;

import com.google.common.base.Predicates;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by dongyang.wang on 2018/11/7 0007.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket swaggerSpringMvcPlugin() {

        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .groupName("test")
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(true)
                // base，最终调用接口后会和paths拼接在一起
                .pathMapping("/")
                .select()
                //过滤的接口
                .paths(Predicates.or(PathSelectors.regex("/api/.*")))
                .build()
                .apiInfo(apiInfo());

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //.pathMapping("/lab")
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Lab")
                .termsOfServiceUrl("SCIE")
                .version("1.0")
                .build();
    }
}
