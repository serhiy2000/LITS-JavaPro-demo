package com.lits.demo;

import com.lits.demo.entity.Person;
import com.lits.demo.model.User;
import com.lits.demo.repository.PersonDataRepository;
import com.lits.demo.repository.UserDataRepository;

import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@Builder
public class DemoApplication implements ApplicationRunner { //extends Application

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	UserDataRepository userDataRepository;

	@Autowired
	PersonDataRepository personDataRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	public DemoApplication() { // this is for swagger. I'll try springfox instead.
//		BeanConfig beanConfig = new BeanConfig();
//		beanConfig.setVersion("1.0.0");
//		beanConfig.setBasePath("/api");
//		beanConfig.setResourcePackage("org.jazzteam");
//		beanConfig.setScan(true);
//	}
//	@Override
//	public Set<Class<?>> getClasses() {
//		Set<Class<?>> resources = new HashSet();
//		resources.add(io.swagger.jaxrs.listing.ApiListingResource.class);
//		resources.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);
//		return resources;
//	}
	@Override
	public void run(ApplicationArguments args) throws Exception {
		User user = new User();
		user.setUsername("loco");
//		user.setPassword("$2a$10$xIqXZRbKo96Y/h1uZa1eAuo53cNHIJffo5lqLsnLdhzfSpVB/XPoq");
		user.setPassword(passwordEncoder.encode("123"));
		user.setRole("ADMIN");
		userDataRepository.save(user);


//		Person.builder().age(12).personName("serfgf").dead(false); // тут білдер не хотів ніяк працювати. вилазять конфлікти із конструкторами у personmapper!

	}
}
