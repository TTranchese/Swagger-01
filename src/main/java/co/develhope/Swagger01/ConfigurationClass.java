package co.develhope.Swagger01;


import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
	@Bean
	public OpenAPI config() {
		return new OpenAPI()
				.info(new Info().title("return name API")
						.description("A short API that returns the given name")
						.version("v0.0.1")
						.license(new License().name("Random Name 1.0").url("https://www.youtube.com/watch?v=m4gnMWua4xo&ab_channel=MichiganUni")))
				.externalDocs(new ExternalDocumentation()
						.description("ReturnName Wiki Documentation")
						.url("https://www.youtube.com/watch?v=m4gnMWua4xo&ab_channel=MichiganUni"))
				.addTagsItem(new Tag());
	}
}
