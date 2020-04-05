package com.SpringBootJWT.jwtexample;

import com.SpringBootJWT.jwtexample.model.Roles;
import com.SpringBootJWT.jwtexample.model.User;
import com.SpringBootJWT.jwtexample.service.ServicesUser;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class JwtExampleApplication implements CommandLineRunner {

	@Autowired
	ServicesUser servicesUser;

	public static void main(String[] args) {
		SpringApplication.run(JwtExampleApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Override
	public void run(String... params) throws Exception {
		User admin = new User();
		admin.setUsername("admin");
		admin.setPassword("admin");
		admin.setEmail("admin@email.com");
		admin.setRoles(new ArrayList<Roles>(Arrays.asList(Roles.ROLE_ADMIN)));

		servicesUser.signup(admin);

		User client = new User();
		client.setUsername("client");
		client.setPassword("client");
		client.setEmail("client@email.com");
		client.setRoles(new ArrayList<Roles>(Arrays.asList(Roles.ROLE_CLIENT)));

		servicesUser.signup(client);
	}

}
