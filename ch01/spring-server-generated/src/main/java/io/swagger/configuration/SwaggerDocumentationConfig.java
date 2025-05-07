package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-04-16T13:14:05.797687427Z[GMT]")
@Configuration
public class SwaggerDocumentationConfig {

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
            .info(new Info()
                .title("Finance API")
                .description("The API aims to provide an easy reference to some of the most important formulas in the financial markets.  **Simple interest** is interest calculated on the assumption that there is no opportunity to re-invest the interest payments during the life of an investment and thereby earn extra income.  **Compound interest** is interest calculated on the assumption that interest amounts will be received periodically and can be re-invested (usually assumed to be at the same rate).    ")
                .termsOfService("")
                .version("v1")
                .license(new License()
                    .name("")
                    .url("http://unlicense.org"))
                .contact(new io.swagger.v3.oas.models.info.Contact()
                    .email("")));
    }

}
