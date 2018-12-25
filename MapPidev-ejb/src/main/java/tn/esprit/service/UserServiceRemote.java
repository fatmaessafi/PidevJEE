package tn.esprit.service;

import javax.ejb.Remote;

import tn.esprit.entities.User;

@Remote
public interface UserServiceRemote {
	
	public User Login(String email,String mdp,Boolean RememberMe);
	public void Register(User u);
	
}
