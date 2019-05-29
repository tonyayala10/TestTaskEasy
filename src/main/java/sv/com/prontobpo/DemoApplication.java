package sv.com.prontobpo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = {
//		"sv.com.prontobpo.controller",
//		"sv.com.prontobpo.demo",
//		"sv.com.prontobpo.entity",
//		"sv.com.prontobpo.repository",
//		"sv.com.prontobpo.services",
//		"sv.com.prontobpo.utils"})
public class DemoApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
