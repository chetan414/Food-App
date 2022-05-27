package com.ty.food.controller;

import java.util.ArrayList;

import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.service.FoodService;

public class TestSaveFoodOrder {

	public static void main(String[] args) {

		FoodService foodorderServices = new FoodService();

		FoodOrder foodorder = new FoodOrder();
		foodorder.setName("Bunny");
		foodorder.setPhone(987654);

		Item item1 = new Item();
		item1.setName("Pizza");
		item1.setQuantity(1);
		item1.setCost(180);
		item1.setFoodorder(foodorder);

		Item item2 = new Item();
		item2.setName("Choco lava cake");
		item2.setQuantity(2);
		item2.setCost(289);
		item2.setFoodorder(foodorder);

		/*Item item3 = new Item();
		item3.setName("Coke");
		item3.setQuantity(2);
		item3.setCost(200);
		item3.setFoodorder(foodorder);*/

		List<Item> items = new ArrayList<Item>();
		items.add(item1);
		items.add(item2);
		//items.add(item3);
		foodorder.setItem(items);

		foodorderServices.saveOrder(foodorder);

	}

}

