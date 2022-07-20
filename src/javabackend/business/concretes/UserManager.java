package javabackend.business.concretes;

import javabackend.business.abstracts.UserService;
import javabackend.core.GoogleService;
import javabackend.dataAccess.abstracts.UserDao;
import javabackend.entities.concretes.User;

public class UserManager implements UserService {
	
	
	private UserDao userDao;
	private GoogleService googleService;
	
	public UserManager(UserDao userDao,GoogleService googleService) {
		super();
		this.userDao = userDao;
		this.googleService=googleService;
	}


	@Override
	public void add(User user) {
		if(UserValidator.isValidEmail(user.getEmail()) && 
				UserValidator.isValidName(user.getFirstName(), user.getLastName()) && UserValidator.isValidPassword(user.getPassword())
				) {
			System.out.println(user.getEmail()+ " "+"adresine doðrulama epostasý gönerildi");
			System.out.println(user.getEmail()+"  "+"üye giriþi baþarýyla tamamlandý.");
		}else {
			System.out.println("yanlýþ bilgi girildi, üye giriþi yapýlamadý.");
		}
		
		this.userDao.add(user);
		this.googleService.googleToSystem("Kullanýcý google hesabýyla oturum açtý."+user.getEmail());


		
		
	}
	
	

	


	@Override
	public void login(User user) {
		System.out.println("Lütfen email ve parolanýzý girin.");
		System.out.println(user.getEmail()+" "+user.getPassword()+" "+" girdiniz.");
		
	}

	
	
}
