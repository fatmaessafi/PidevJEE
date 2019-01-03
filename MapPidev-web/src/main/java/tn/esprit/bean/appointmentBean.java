package tn.esprit.bean;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import tn.esprit.entities.Appointment;
import tn.esprit.entities.User;
import tn.esprit.service.AppointmentServiceLocal;
import tn.esprit.service.UserServiceLocal;


@ManagedBean
@SessionScoped
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
	private int DoctorId;
	private String visitReason;
	
	public int getDoctorId() {
		return DoctorId;
	}

	public void setDoctorId(int DoctorId) {
		this.DoctorId = DoctorId;
	}
	
	
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
	
	User u = new User();
	
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
	
	public void AddRdv(){
		System.out.println("he test");
		appointmentServiceLocal.addrdv(new Appointment( appDate, appRate, patientId, visitReason));

	}
	// private User u=new User();
	 
	 
	Appointment a = new Appointment();
	public String addrdvv() throws IOException 
	{
	
		        	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		    		Date date = new Date();
		    		String appdate = dateFormat.format(date);
		    		a.setAppDate("2019/06/06");
		    		a.setAppRate(4);
		    		a.setPatientId(1);
		    		a.setVisitReason("back");
	                 //u.setId(1);
	             //   a.setUser(u);
		    		appointmentServiceLocal.addrdv(a);
		    		
		    	
		    
		    		
		
		 return"/xhtml/test?faces-redirect=true";
		        
		
	
	}


	
	
}
	