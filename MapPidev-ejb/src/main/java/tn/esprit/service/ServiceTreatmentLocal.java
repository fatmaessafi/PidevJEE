package tn.esprit.service;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.entities.Treatment;
import tn.esprit.entities.User;

@Local
public interface ServiceTreatmentLocal {

	List<Treatment> getTreatmentByIdPatient(int idPatient);

}
