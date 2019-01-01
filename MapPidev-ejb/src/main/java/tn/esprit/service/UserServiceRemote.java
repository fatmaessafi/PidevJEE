package tn.esprit.service;

import javax.ejb.Remote;

import tn.esprit.entities.User;
import tn.esprit.vm.RegisterVM;

@Remote
public interface UserServiceRemote {
	
	public User Login(String email,String mdp,Boolean RememberMe);
	public void Register(RegisterVM u);
	public User GetUserById(int id);
public void Logout();
}
