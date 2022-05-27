package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.service.FoodService;

public class TestGetAllFoodOrderedItem {
	public static void main(String[] args) {

		FoodService foodorderServices = new FoodService();
		List<FoodOrder> foodorders = foodorderServices.getAllOrderItem();
		if (foodorders.size() > 0) {
			for (FoodOrder foodorder : foodorders) {
				System.out.println("___________________________________");
				System.out.println("Order Id: " + foodorder.getId());
				System.out.println("Order Name: " + foodorder.getName());
				System.out.println("Order Phone Num: " + foodorder.getPhone());
				System.out.println("--------------------------------------------");
				List<Item> items = foodorder.getItem();
				for (Item item : items) {
					System.out.println("Item Name: " + item.getName());
					System.out.println("Item Quantity: " + item.getQuantity());
					System.out.println("Item Cost: " + item.getCost());
					System.out.println("--------------------------------------------");
				}

			}
		}

	}
}
