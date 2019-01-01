package tn.esprit.bean;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import tn.esprit.entities.Treatment;
import tn.esprit.entities.User;
import tn.esprit.service.ServiceTreatmentLocal;

@ManagedBean
@javax.faces.bean.SessionScoped
public class TreatmentBean {
	
	private int treatmentId;

	private String illness;

	private int patientId;

	private String validation;
	
	private String doctor;
	@EJB
	ServiceTreatmentLocal serviceTreatmentLocal ;
	
	List<Treatment> listTreatments = new ArrayList<>();
	
	public int getTreatmentId() {
		return treatmentId;
	}
	public void setTreatmentId(int treatmentId) {
		this.treatmentId = treatmentId;
	}
	public String getIllness() {
		return illness;
	}
	public void setIllness(String illness) {
		this.illness = illness;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getValidation() {
		return validation;
	}
	public void setValidation(String validation) {
		this.validation = validation;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	
	
	public List<Treatment>  GetTreatmentsByPatient(int idPatient) throws ParseException
	{
		System.out.println("IdPatient="+idPatient);
		listTreatments = serviceTreatmentLocal.getTreatmentByIdPatient(idPatient) ;
		for( Treatment t :  listTreatments)
		{
			
			System.out.println(t.getIllness());
		}
		return listTreatments;
	}
}
