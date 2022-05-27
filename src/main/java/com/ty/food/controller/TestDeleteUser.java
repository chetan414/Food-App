package com.ty.food.controller;

import com.ty.food.dto.User;
import com.ty.food.service.UserService;

public class TestDeleteUser {
	public static void main(String[] args) {
		
		UserService userServices = new UserService();
		User user = userServices.deleteUser(3);
		if (user == null) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not Deleted");
		}
	}
}
