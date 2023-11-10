package com.javaguide.UserDTO;

import com.javaguide.UserDTO.model.Location;
import com.javaguide.UserDTO.model.User;
import com.javaguide.UserDTO.repository.LocationRepository;
import com.javaguide.UserDTO.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserDtoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;


	public static void main(String[] args) {
		SpringApplication.run(UserDtoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Location location = new Location();
		location.setPlace("Gurugram");
		location.setDescription("Good Place");
		location.setLatitude(28.4595);
		location.setLongitude(77.0266);
		locationRepository.save(location);

		User user1 = new User();
		user1.setEmail("mohitsingh30031996@gmail.com");
		user1.setFirstname("Mohit");
		user1.setLastname("Singh");
		user1.setPassword("hbdkjjcbdskcdb");
        user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setEmail("rajputsingh30031996@gmail.com");
		user2.setFirstname("Rajput");
		user2.setLastname("Singh");
		user2.setPassword("hbdkjjcbd243434skcdb");
		user2.setLocation(location);
		userRepository.save(user2);

	}
}
