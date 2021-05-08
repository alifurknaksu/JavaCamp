package dataAccess.concretes;

import java.util.List;

import core.entities.concretes.User;
import dataAccess.abstracts.UserDao;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi : " + user.getFirstName());

	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile silindi : " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile güncellendi : " + user.getFirstName());
		
	}

	@Override
	public User get(int id) {
		System.out.println("Kullanýcý Hibernate ile getirildi. ");
		return null;
	}

	@Override
	public List<User> getAll() {
		System.out.println("Kullancýlar Hibernate ile listelendi.");
		return null;
	}

}
