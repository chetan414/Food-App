package com.ty.food.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;

public class FoodDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void saveOrder(FoodOrder foodorder) {
		entityTransaction.begin();
		entityManager.persist(foodorder);
		entityTransaction.commit();

	}

	public FoodOrder getOrderItem(String name, long phone) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql = "select f from Foodorder f where name=?1 and phone=?2";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, name);
		query.setParameter(2, phone);
		List<FoodOrder> foodOrders = query.getResultList();
		if (foodOrders.size() > 0) {
			for (FoodOrder foodorder : foodOrders) {
				return foodorder;
			}
		}
		return null;

	}

	public List<FoodOrder> getAllOrderItem() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql = "select f from Foodorder f";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();

	}

	public void updateOrderItem(List<Item> items, int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		FoodOrder foodorder1 = entityManager.find(FoodOrder.class, id);
		List<Item> items2 = new ArrayList<Item>();
		for (Item item : items) {
			item.setFoodorder(foodorder1);
			items2.add(item);
		}

		foodorder1.setItem(items2);
		entityTransaction.begin();
		entityManager.merge(foodorder1);
		entityTransaction.commit();

	}

	public void deleteOrderItem(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		FoodOrder foodorder = entityManager.find(FoodOrder.class, 1);

		entityTransaction.begin();
		for (Item item : foodorder.getItem()) {
			entityManager.remove(item);
		}
		entityManager.remove(foodorder);
		entityTransaction.commit();
	}

}
