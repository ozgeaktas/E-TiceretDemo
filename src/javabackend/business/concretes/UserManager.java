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
			System.out.println(user.getEmail()+ " "+"adresine do�rulama epostas� g�nerildi");
			System.out.println(user.getEmail()+"  "+"�ye giri�i ba�ar�yla tamamland�.");
		}else {
			System.out.println("yanl�� bilgi girildi, �ye giri�i yap�lamad�.");
		}
		
		this.userDao.add(user);
		this.googleService.googleToSystem("Kullan�c� google hesab�yla oturum a�t�."+user.getEmail());


		
		
	}
	
	

	


	@Override
	public void login(User user) {
		System.out.println("L�tfen email ve parolan�z� girin.");
		System.out.println(user.getEmail()+" "+user.getPassword()+" "+" girdiniz.");
		
	}

	
	
}
