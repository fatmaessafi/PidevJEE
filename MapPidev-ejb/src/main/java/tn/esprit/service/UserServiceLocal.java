package tn.esprit.service;

import javax.ejb.Local;

import tn.esprit.entities.User;

@Local
public interface UserServiceLocal {
	
	public User Login(String email,String mdp,Boolean RememberMe);
	public void Register(User u);


}
