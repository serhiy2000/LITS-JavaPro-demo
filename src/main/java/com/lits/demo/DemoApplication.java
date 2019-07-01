package com.lits.demo;

import com.lits.demo.model.UserEntity;
import com.lits.demo.repository.UserDataRepository;
import io.swagger.jaxrs.config.BeanConfig;
import javax.ws.rs.core.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class DemoApplication extends Application implements ApplicationRunner {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	UserDataRepository userDataRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public DemoApplication() {
		BeanConfig beanConfig = new BeanConfig();
		beanConfig.setVersion("1.0.0");
		beanConfig.setBasePath("/api");
		beanConfig.setResourcePackage("org.jazzteam");
		beanConfig.setScan(true);
	}
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet();
		resources.add(io.swagger.jaxrs.listing.ApiListingResource.class);
		resources.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);
		return resources;
	}
	@Override
	public void run(ApplicationArguments args) throws Exception {
		UserEntity user = new UserEntity();
		user.setUsername("loco");
//		user.setPassword("$2a$10$xIqXZRbKo96Y/h1uZa1eAuo53cNHIJffo5lqLsnLdhzfSpVB/XPoq");
		user.setPassword(passwordEncoder.encode("123"));
		userDataRepository.save(user);
	}
}
