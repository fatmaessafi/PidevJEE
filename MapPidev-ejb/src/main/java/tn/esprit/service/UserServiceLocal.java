package tn.esprit.service;

import javax.ejb.Local;

import tn.esprit.entities.User;
import tn.esprit.vm.RegisterVM;

@Local
public interface UserServiceLocal {
	
	public User Login(String email,String mdp,Boolean RememberMe);
	public void Register(RegisterVM u);
	public User GetUserById(int id);
public void Logout();

}
