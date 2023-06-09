package com.pickpack.flightservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;

@Configuration
@EnableWebMvc
//@EnableSwagger2
public class SwaggerConfig {
	//http://localhost:8080/swagger-ui/index.html

	private ApiInfo info() {
		return new ApiInfoBuilder().title("Pickpack Flightservice Server API").build();
	}

	@Bean
	public Docket swaggerApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(info())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.pickpack.flightservice"))
				.paths(PathSelectors.any())
//				.paths(PathSelectors.ant("/**"))
				.build();
	}

	// swagger ui 설정.
	@Bean
	public UiConfiguration uiConfig() {
		return UiConfigurationBuilder.builder().displayRequestDuration(true).validatorUrl("").build();
	}
}