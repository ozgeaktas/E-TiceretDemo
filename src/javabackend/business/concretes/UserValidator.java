package javabackend.business.concretes;

import java.util.regex.Pattern;

public class UserValidator {
	public static boolean isValidEmail(String email) {
		final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
	    return EMAIL_REGEX.matcher(email).matches();
	}
	public static boolean isValidPassword(String password) {
		if(password.length()>=6) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean isValidName(String firstname,String lastname) {
		if(firstname.length()>=2 && lastname.length()>=2) {
			return true;
		}else {
			return false;
		}
	}

}
