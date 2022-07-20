package javabackend.dataAccess.concretes;

import java.util.List;

import javabackend.dataAccess.abstracts.UserDao;
import javabackend.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("hibernate ile kullac� eklendi"+user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("hibernate ile kullac� g�ncellendi"+user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("hibernate ile kullac� silindi"+user.getFirstName());
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
