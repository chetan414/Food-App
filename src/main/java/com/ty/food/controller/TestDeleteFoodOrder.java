package com.ty.food.controller;

import com.ty.food.service.FoodService;

public class TestDeleteFoodOrder {
	public static void main(String[] args) {
		
		FoodService foodorderServices = new FoodService();
		foodorderServices.deleteOrderItem(1);
	}
}
