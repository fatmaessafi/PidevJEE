package tn.esprit.bean;

import java.text.ParseException;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.esprit.entities.Treatment;
import tn.esprit.service.ServiceStepLocal;

@ManagedBean

public class AddStepBean {
private String stepDescription;
private String stepSpeciality;
private String timeStep;
private Treatment treat;
@EJB
ServiceStepLocal serviceStepLocal;
public String getStepDescription() {
	return stepDescription;
}
public void setStepDescription(String stepDescription) {
	this.stepDescription = stepDescription;
}
public String getStepSpeciality() {
	return stepSpeciality;
}
public void setStepSpeciality(String stepSpeciality) {
	this.stepSpeciality = stepSpeciality;
}
public String getTimeStep() {
	return timeStep;
}
public void setTimeStep(String timeStep) {
	this.timeStep = timeStep;
}
public Treatment getTreat() {
	return treat;
}
public void setTreat(Treatment treat) {
	this.treat = treat;
}
public void addStep(int idTreatment) throws ParseException
{
	System.out.println("ADD STEP");
}
}
