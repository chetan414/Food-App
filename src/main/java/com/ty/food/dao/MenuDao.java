package com.ty.food.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food.dto.Menu;

public class MenuDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Menu saveMenu(Menu menu) {
		entityTransaction.begin();
		entityManager.persist(menu);
		entityTransaction.commit();
		return menu;
	}

	public Menu getMenu(int id) {
		return entityManager.find(Menu.class, id);
	}

	public List<Menu> getAllMenu() {
		String sql = "select m from Menu m";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();

	}

	public Menu updateMenu(Menu menu, int id) {
		Menu menu2 = entityManager.find(Menu.class, id);
		menu2.setName(menu.getName());
		menu2.setCost(menu.getCost());
		entityTransaction.begin();
		entityManager.merge(menu2);
		entityTransaction.commit();
		return menu2;
	}

	public boolean deleteMenu(int id) {
		Menu menu = entityManager.find(Menu.class, id);
		if (menu != null) {
			entityTransaction.begin();
			entityManager.remove(menu);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

}
