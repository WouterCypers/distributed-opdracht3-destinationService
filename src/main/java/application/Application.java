package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import configuration.JacksonConfiguration;
import destination.DestinationRepository;

@Import(JacksonConfiguration.class)
@SpringBootApplication
@EnableDiscoveryClient
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public DestinationRepository destinationRepository() {
		return new DestinationRepository();
	}
	
}
