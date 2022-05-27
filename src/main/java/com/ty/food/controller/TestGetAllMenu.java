package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.Menu;
import com.ty.food.service.MenuService;

public class TestGetAllMenu {
	public static void main(String[] args) {

		MenuService menuServices = new MenuService();
		List<Menu> menus = menuServices.getAllMenu();
		if (menus.size() > 0) {
			for (Menu menu : menus) {
				System.out.println(" ");
				System.out.println("Dish Name: " + menu.getName());
				System.out.println("Description: " + menu.getDescription());
				System.out.println("Cost: " + menu.getCost());
				System.out.println("Offer: " + menu.getOffer());
				System.out.println("Type: " + menu.getType());
				System.out.println("_______________________________________________");
			}
		} else {
			System.out.println("Menu is empty");
		}
	}
}
