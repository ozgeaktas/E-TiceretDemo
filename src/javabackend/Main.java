package javabackend;

import javabackend.business.abstracts.UserService;
import javabackend.business.concretes.UserManager;
import javabackend.core.JGoogleManagerAdapter;
import javabackend.dataAccess.concretes.HibernateUserDao;
import javabackend.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService=new UserManager(new HibernateUserDao(), new JGoogleManagerAdapter());
		User user=new User("özge","aktaþ","ozgeaktas@gmail.com","1234856");
		userService.add(user);

	}

}
