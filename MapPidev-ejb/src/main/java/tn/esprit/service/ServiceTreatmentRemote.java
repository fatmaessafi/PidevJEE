package tn.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.entities.Treatment;

@Remote
public interface ServiceTreatmentRemote {
	List<Treatment> getTreatmentByIdPatient(int idPatient);

}
