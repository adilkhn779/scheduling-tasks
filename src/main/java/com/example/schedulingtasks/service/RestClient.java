package com.example.schedulingtasks.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.schedulingtasks.entity.User;
import com.example.schedulingtasks.entity.UserList;
import com.example.schedulingtasks.repository.UserRepository;

@Service
public class RestClient {
	
	@Autowired
	UserRepository UserRepository;
	

	private static final String resourceUrl = "https://gorest.co.in/public/v2/users";

	public void saveUserDetails() {

		RestTemplate restTemplate = new RestTemplate();
		User[] response = restTemplate.getForEntity(resourceUrl, User[].class).getBody();
		System.out.println(Arrays.toString(response));
		List<User> ls = new ArrayList<>();
		for (User user : response) {
			ls.add(user);
		}
		System.out.println(ls);
		UserRepository.saveAll(ls);
	}

}
