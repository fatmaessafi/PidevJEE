package tn.esprit.service;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.entities.User;

@Local
public interface ServiceFatmaPatientLocal {
	public List<User> getAllPatients() ;
}
