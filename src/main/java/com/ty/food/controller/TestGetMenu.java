package com.ty.food.controller;

import com.ty.food.dto.Menu;
import com.ty.food.service.MenuService;

public class TestGetMenu {
	public static void main(String[] args) {
		
		MenuService menuServices = new MenuService();
		Menu menu = menuServices.getMenu(1);
		if (menu != null) {
			System.out.println(" ");
			System.out.println("Dish Name: " + menu.getName());
			System.out.println("Description: " + menu.getDescription());
			System.out.println("Cost: " + menu.getCost());
			System.out.println("Offer: " + menu.getOffer());
			System.out.println("Type: " + menu.getType());
		}
		else {
			System.out.println("No data is found");
		}
	}
}
