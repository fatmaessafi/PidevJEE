package tn.esprit.service;


import java.util.List;

import javax.ejb.Remote;

import tn.esprit.entities.Appointment;

@Remote
public interface AppointmetServiceRemote {
	
	public void getAllAppointments();
	public String getAllAppointment();
	public List<Appointment> ConsommerAppointment();
	
	

}
