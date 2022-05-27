package com.ty.food.service;

import static com.ty.food.util.Tax.*;

import java.util.List;

import com.ty.food.dao.FoodDao;
import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;

public class FoodService {
	public void saveOrder(FoodOrder foodorder) {
		double total = totalWithTax(foodorder.getItem());
		foodorder.setTotal(total);
		FoodDao foodorderDao = new FoodDao();
		foodorderDao.saveOrder(foodorder);

	}

	public FoodOrder getOrderItem(String name, long phone) {
		FoodDao foodorderDao = new FoodDao();
		return foodorderDao.getOrderItem(name, phone);

	}

	public List<FoodOrder> getAllOrderItem() {
		FoodDao foodorderDao = new FoodDao();
		return foodorderDao.getAllOrderItem();

	}

	public void updateOrderItem(List<Item> items, int id) {
		FoodDao foodorderDao = new FoodDao();
		foodorderDao.updateOrderItem(items, id);

	}

	public void deleteOrderItem(int id) {
		FoodDao foodorderDao = new FoodDao();
		foodorderDao.deleteOrderItem(id);
	}

	public double totalWithTax(List<Item> list) {
		double total = 0;
		for (Item item : list) {
			item.setCost(item.getCost() * .88);
			total += (item.getCost() * item.getQuantity());
		}
		total = (total * tax);
		return total;
	}

}
