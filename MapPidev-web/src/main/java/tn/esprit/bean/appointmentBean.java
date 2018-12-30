package tn.esprit.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import tn.esprit.entities.Appointment;
import tn.esprit.service.AppointmentServiceLocal;

@ManagedBean(name = "appointmentBean")
@ViewScoped
public class appointmentBean {
	
	@EJB
	AppointmentServiceLocal AppointmentServiceLocal;
	

	private List<Appointment> listM=new ArrayList<>();
	@PostConstruct
	public void init(){
		
		
		listM=AppointmentServiceLocal.ConsommerAppointment();
		
	}
	
	
	
	
	
	
	public List<Appointment> getListM() {
		return listM;
	}
	
	public void setListM(List<Appointment> listM) {
		this.listM = listM;
	}

}
