package tn.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.entities.User;

@Remote
public interface ServiceFatmaPatientRemote {
	public List<User> getAllPatients() ;
}
