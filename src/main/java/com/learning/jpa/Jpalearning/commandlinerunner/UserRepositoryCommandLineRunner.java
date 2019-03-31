package com.learning.jpa.Jpalearning.commandlinerunner;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.jpa.Jpalearning.entity.User;
import com.learning.jpa.Jpalearning.service.UserRepository;


@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger log = org.slf4j.LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jill", "Admin");
		userRepository.save(user);
		log.info("User is been created " + user);
		
		Optional<User> userFoundById = userRepository.findById(1L);
		log.info("User by Id Found" + userFoundById);
		
		List<User> allUsers = userRepository.findAll();
		log.info("User list " + allUsers);
		
	}

}
