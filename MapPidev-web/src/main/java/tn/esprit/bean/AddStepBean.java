package tn.esprit.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import tn.esprit.entities.Step;
import tn.esprit.entities.Treatment;
import tn.esprit.service.ServiceStepLocal;
import tn.esprit.service.UserService;

@ManagedBean

public class AddStepBean {
	private String stepDescription;
	private String stepSpeciality;
	private String timeStep;
	private Treatment treat= new Treatment();
	private Step step= new Step();

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
	

	public Step getStep() {
		return step;
	}

	public void setStep(Step step) {
		this.step = step;
	}

	public void addStep(int idTreatment) throws ParseException {
		System.out.println("ADD STEP");
		System.out.println("idTreatment addstep="+idTreatment);
		step.setStepDescription(stepDescription);
		step.setStepSpeciality(stepSpeciality);
		SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd");
		simpleFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		step.setStepDate(simpleFormat.parse(timeStep).toString());
		Date d=new Date();
		step.setLastModificationDate(d.toString());
		step.setLastModificationBy(2);
		step.setNbModifications(0);
		treat.setTreatmentId(idTreatment);
		step.setTreatment(treat);
		System.out.println("step="+step.toString());
		serviceStepLocal.AddStep(step);
	
	}
	public void removeStep(Step step) throws ParseException {
		
		serviceStepLocal.DeleteStep(step);
		
	}
	
}
