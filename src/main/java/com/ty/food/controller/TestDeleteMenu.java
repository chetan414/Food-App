package com.ty.food.controller;

import com.ty.food.service.MenuService;

public class TestDeleteMenu {
	public static void main(String[] args) {
		
		MenuService menuServices = new MenuService();
		boolean res = menuServices.deleteMenu(3);
		if(res == true) {
			System.out.println("Deleted");
		} else {
			System.out.println("No deleted");
		}
	}
}
