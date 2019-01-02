package tn.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.entities.Step;

@Remote
public interface ServiceStepRemote {
    public List<Step> getStepsByIdTreatment(int idTreatment) ;

}
