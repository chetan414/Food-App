package com.ty.food.controller;

import com.ty.food.dto.Menu;
import com.ty.food.service.MenuService;

public class TestUpdateMenu {
	public static void main(String[] args) {
		
		MenuService menuServices = new MenuService();
		Menu menu = new Menu();
		menu.setName("Chees Burger");
		menu.setCost(60);

		Menu menu2 = menuServices.updateMenu(menu, 1);
		if (menu2 != null) {
			System.out.println("Updated");
		} else {
			System.out.println("Not Updated");
		}
	}
}
