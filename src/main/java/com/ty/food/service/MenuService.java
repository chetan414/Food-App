package com.ty.food.service;

import java.util.List;

import com.ty.food.dao.MenuDao;
import com.ty.food.dto.Menu;

public class MenuService {
	public Menu saveMenu(Menu menu) {
		MenuDao menuDao = new MenuDao();
		return menuDao.saveMenu(menu);
	}

	public Menu getMenu(int id) {
		MenuDao menuDao = new MenuDao();
		return menuDao.getMenu(id);

	}

	public List<Menu> getAllMenu() {
		MenuDao menuDao = new MenuDao();
		return menuDao.getAllMenu();

	}

	public Menu updateMenu(Menu menu, int id) {
		MenuDao menuDao = new MenuDao();
		return menuDao.updateMenu(menu, id);

	}

	public boolean deleteMenu(int id) {
		MenuDao menuDao = new MenuDao();
		return menuDao.deleteMenu(id);

	}
	
	public double offer() {
		Menu menu = new Menu();
		String offer = menu.getOffer().replace("%", "");
		double offerValue = (int)(Integer.parseInt(offer));
		return offerValue;
	}

}
