package tn.esprit.bean;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import tn.esprit.entities.Appointment;
import tn.esprit.entities.Treatment;
import tn.esprit.service.AppointmentServiceLocal;
import tn.esprit.service.UserServiceLocal;


@ManagedBean
@javax.faces.bean.SessionScoped
public class appointmentBean {
	int  idPatient =1 ;
	@EJB
	AppointmentServiceLocal appointmentServiceLocal ;
	@EJB
	UserServiceLocal serviceUserLocal;
	List<Appointment> listapp = new ArrayList<>();

	
	private int appointmentId;
	
	private String appDate;
	
	private int appRate;
	private int patientId;
	
	private String visitReason;
	
	
	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getAppDate() {
		return appDate;
	}

	public void setAppDate(String appDate) {
		this.appDate = appDate;
	}

	public int getAppRate() {
		return appRate;
	}

	public void setAppRate(int appRate) {
		this.appRate = appRate;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getVisitReason() {
		return visitReason;
	}

	public void setVisitReason(String visitReason) {
		this.visitReason = visitReason;
	}


	public List<Appointment> getListapp() {
		return listapp;
	}

	public void setListapp(List<Appointment> listapp) {
		this.listapp = listapp;
	}

	
	
	public List<Appointment>  GetAllappointments() 
	{
		//listapp = appointmentServiceLocal.getAllAppointments() ;
		String result = appointmentServiceLocal.getApp();
		Gson j = new Gson();
		
		List<Appointment>  patients=j.fromJson(result, new TypeToken<List<Appointment>>(){}.getType());
		System.out.println(patients.toString());
		
		return patients;
	}
	
	
	
	public List<Appointment>  GetAppointmentByPatient() 
	{		System.out.println("IdPatient="+idPatient);
	String result = appointmentServiceLocal.getAppointmentByIdPatient1(idPatient);
	Gson g = new Gson();
	List<Appointment>  patients=g.fromJson(result, new TypeToken<List<Appointment>>(){}.getType());
	System.out.println(patients.toString());
	
	return patients;
	}
	
	

	public List<Appointment> Getapp(int idPatient)
	{ 
	return	appointmentServiceLocal.getAllApp(idPatient);
		
	}
	

	
}
	