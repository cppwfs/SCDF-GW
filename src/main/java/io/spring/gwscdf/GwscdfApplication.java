package io.spring.gwscdf;

import reactor.core.publisher.Mono;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class GwscdfApplication {

	public static void main(String[] args) {
		SpringApplication.run(GwscdfApplication.class, args);
	}

}
