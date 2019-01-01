package tn.esprit.bean;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import tn.esprit.entities.Treatment;
import tn.esprit.service.ServiceTreatmentLocal;
import tn.esprit.service.UserServiceLocal;

@ManagedBean
@javax.faces.bean.SessionScoped
public class TreatmentBean {
	
	private int treatmentId;

	private String illness;

	private int patientId;

	private String validation;
	
	private String doctor;
	private int nbTreat;
	@EJB
	ServiceTreatmentLocal serviceTreatmentLocal ;
	@EJB
	UserServiceLocal serviceUserLocal;
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
	
	
	public int getNbTreat() {
		return nbTreat;
	}
	public void setNbTreat(int nbTreat) {
		this.nbTreat = nbTreat;
	}
	public List<TreatmentBean>  GetTreatmentsByPatient(int idPatient) throws ParseException
	{		System.out.println("IdPatient="+idPatient);
		listTreatments = serviceTreatmentLocal.getTreatmentByIdPatient(idPatient) ;
		List<TreatmentBean> listTreatmentBean= new ArrayList<>();
		for( Treatment t :  listTreatments)
		{		TreatmentBean tb= new TreatmentBean();
			
		tb.doctor=serviceUserLocal.GetUserById(t.getDoctorId()).getFirstName()+" "+serviceUserLocal.GetUserById(t.getDoctorId()).getLastName();
			tb.illness=t.getIllness();
			tb.patientId=t.getPatientId();
			tb.treatmentId=t.getTreatmentId();
			if(t.isValidation()==true)
			tb.validation="Valid";
			else 
				tb.validation="Not valid";
			listTreatmentBean.add(tb);
			
		}
		return listTreatmentBean;
	}
	public int nbTreatments(int idPatient)
	{
		System.out.println("IdPatient="+idPatient);
		listTreatments = serviceTreatmentLocal.getTreatmentByIdPatient(idPatient) ;
		List<TreatmentBean> listTreatmentBean= new ArrayList<>();
		for( Treatment t :  listTreatments)
		{		TreatmentBean tb= new TreatmentBean();
			tb.doctor=serviceUserLocal.GetUserById(t.getDoctorId()).getFirstName()+" "+serviceUserLocal.GetUserById(t.getDoctorId()).getLastName();
			tb.illness=t.getIllness();
			tb.patientId=t.getPatientId();
			tb.treatmentId=t.getTreatmentId();
			if(t.isValidation()==true)
			tb.validation="Valid";
			else 
				tb.validation="Not valid";
			listTreatmentBean.add(tb);
			
		}
		return listTreatmentBean.size();
	}
	
}
