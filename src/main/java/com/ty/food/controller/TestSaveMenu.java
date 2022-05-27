package com.ty.food.controller;

import com.ty.food.dto.Menu;
import com.ty.food.service.MenuService;

public class TestSaveMenu {
	public static void main(String[] args) {
		
		MenuService menuServices = new MenuService();
		Menu menu = new Menu();
		menu.setName("Chicken Maharaja Mac");
		menu.setDescription("Made up with Chicken and Bun with some spicy Ingredients along with Cool drinks");
		menu.setCost(154);
		menu.setType("Non-veg");
		menu.setOffer("12%");
		menu.setImage("https://www.pexels.com/photo/brown-and-black-maple-leaf-12203460/");

		Menu menu2 = menuServices.saveMenu(menu);
		if (menu2 != null) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}
	}
}
