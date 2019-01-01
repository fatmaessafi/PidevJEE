package tn.esprit.bean;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;

import tn.esprit.entities.Step;
import tn.esprit.entities.Treatment;
import tn.esprit.service.ServiceStepLocal;
import tn.esprit.service.UserServiceLocal;

@ManagedBean
@SessionScoped
public class StepBean {
	private int StepId;

	private String LastModificationBy;

	private String LastModificationDate;

	private String ModificationReason;

	private int NbModifications;

	private String StepDate;

	private String StepDescription;

	private String StepSpeciality;
	private String Appointment;

	private String Validation;
	private List<Step> listSteps= new ArrayList<>();
	@EJB
	ServiceStepLocal serviceStepLocal;
	@EJB
	UserServiceLocal serviceUserLocal;

	public int getStepId() {
		return StepId;
	}
	public void setStepId(int stepId) {
		StepId = stepId;
	}
	public String getLastModificationBy() {
		return LastModificationBy;
	}
	public void setLastModificationBy(String lastModificationBy) {
		LastModificationBy = lastModificationBy;
	}
	public String getLastModificationDate() {
		return LastModificationDate;
	}
	public void setLastModificationDate(String lastModificationDate) {
		LastModificationDate = lastModificationDate;
	}
	public String getModificationReason() {
		return ModificationReason;
	}
	public void setModificationReason(String modificationReason) {
		ModificationReason = modificationReason;
	}
	public int getNbModifications() {
		return NbModifications;
	}
	public void setNbModifications(int nbModifications) {
		NbModifications = nbModifications;
	}
	public String getStepDate() {
		return StepDate;
	}
	public void setStepDate(String stepDate) {
		StepDate = stepDate;
	}
	public String getStepDescription() {
		return StepDescription;
	}
	public void setStepDescription(String stepDescription) {
		StepDescription = stepDescription;
	}
	public String getStepSpeciality() {
		return StepSpeciality;
	}
	public void setStepSpeciality(String stepSpeciality) {
		StepSpeciality = stepSpeciality;
	}
	public String getValidation() {
		return Validation;
	}
	public void setValidation(String validation) {
		Validation = validation;
	}
	public StepBean() {
		// TODO Auto-generated constructor stub
	}
	
	public String getAppointment() {
		return Appointment;
	}
	public void setAppointment(String appointment) {
		Appointment = appointment;
	}
	public List<StepBean>  GetStepsByTreatment(int idTreatment) throws ParseException
	{		System.out.println("IdTreatment="+idTreatment);	
		listSteps = serviceStepLocal.getStepsByIdTreatment(idTreatment) ;
		List<StepBean> listStepsBean= new ArrayList<>();
		for( Step t :  listSteps)
		{		StepBean sb= new StepBean();
			sb.LastModificationBy=serviceUserLocal.GetUserById(t.getLastModificationBy()).getFirstName()+" "+serviceUserLocal.GetUserById(t.getLastModificationBy()).getLastName();
			sb.LastModificationDate=t.getLastModificationDate().substring(0, 10);
			sb.ModificationReason=t.getModificationReason();
			sb.NbModifications=t.getNbModifications();
			sb.StepDate=t.getStepDate();
			sb.StepDescription=t.getStepDescription();
			sb.StepSpeciality=t.getStepSpeciality();
			sb.StepDate=t.getStepDate().substring(0,10);
			if(t.isValidation()==true)
			sb.Validation="Valid";
			if(t.getAppointment()==null)
			sb.setAppointment("Taken");
				else  sb.Appointment="Not taken";
				sb.Validation="Not valid";
			listStepsBean.add(sb);
			
		}
		return listStepsBean;
	}
}
