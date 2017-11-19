package dev.coderaja.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldServiceApplication {
	
	private static final Log LOG = LogFactory.getLog(HelloWorldServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldServiceApplication.class, args);
	}
	
	@RequestMapping(value = "/helloworld")
	public String greet() {
		LOG.debug("Hello World");
		LOG.info("Hello World");
		return "Hello World";
	}
}
