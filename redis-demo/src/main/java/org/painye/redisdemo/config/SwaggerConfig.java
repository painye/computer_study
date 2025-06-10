package org.painye.redisdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

/**
 * @author painye
 * @Description swagger配置类
 * @create 2025-05-06 23:08
 */
@Component
@Data
@ConfigurationProperties("swagger") //读取配置文件信息
@EnableOpenApi //开启文档规范
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())

                .build()
                .securitySchemes(Collections.singletonList(apiKey()))
                .securityContexts(Collections.singletonList(securityContext()));
    }

    private static ApiKey apiKey() {
        return new ApiKey("token", "token", "header");
    }

    private SecurityContext securityContext() {
        return SecurityContext.builder()
                .securityReferences(Collections.singletonList(new SecurityReference("token", new AuthorizationScope[0])))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .description("**项目管理平台")
                .title("**项目管理平台接口api").build();
    }

}
