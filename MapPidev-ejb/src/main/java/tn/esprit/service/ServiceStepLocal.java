package tn.esprit.service;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.entities.Step;

@Local
public interface ServiceStepLocal {
    public List<Step> getStepsByIdTreatment(int idTreatment) ;

	void AddStep(Step e);

	void DeleteStep(Step e);
}
