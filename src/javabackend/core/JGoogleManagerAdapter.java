package javabackend.core;

import javabackend.Jgoogle.JGoogleManager;

public class JGoogleManagerAdapter implements GoogleService {

	@Override
	public void googleToSystem(String message) {
		JGoogleManager manager=new JGoogleManager();
		manager.google(message);
		
	}

}
