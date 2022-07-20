package javabackend.business.abstracts;

import javabackend.entities.concretes.User;

public interface UserService {
	void add(User user);
	void login(User user);

}
