package com.learning.jpa.Jpalearning.commandlinerunner;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.jpa.Jpalearning.entity.User;
import com.learning.jpa.Jpalearning.service.UserDaoService;


@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

	private static final Logger log = org.slf4j.LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

	@Autowired
	private UserDaoService userDaoService;

	@Override
	public void run(String... args) throws Exception {
		User user = new User("jack", "Admin");
		userDaoService.insert(user);
		log.info("User is been created " + user);
	}

}
