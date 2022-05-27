package com.ty.food.controller;

import com.ty.food.dto.User;
import com.ty.food.service.UserService;

public class TestUpdateUser {
	public static void main(String[] args) {
		
		UserService userServices = new UserService();
		User user = new User();
		user.setName("Peter A");
		User user1 = userServices.updateUser(user, 2);
		if (user1 != null) {
			System.out.println("Updated");
		} else {
			System.out.println("Not Updatesd");
		}
	}
}
