package com.example.schedulingtasks.entity;

import java.util.ArrayList;
import java.util.List;



public class UserList {
	
	private ArrayList<User> userResponse;

	public UserList() {
	userResponse = new ArrayList<>();
     }
   
	
	public List<User> getUserResponse() {
		return userResponse;
	}

	public void setUserResponse(ArrayList<User> userResponse) {
		this.userResponse = userResponse;
	}
	
	
	
	
	
}
