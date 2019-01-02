package tn.esprit.service;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.entities.Treatment;

@Local
public interface TreatmentSessionBeanLocal {
	public List<Treatment> getTreatments() ;
}
