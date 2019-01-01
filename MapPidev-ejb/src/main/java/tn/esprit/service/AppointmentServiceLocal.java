package tn.esprit.service;
import java.util.List;

import javax.ejb.Local;

import tn.esprit.entities.Appointment;
import tn.esprit.entities.User;

@Local
public interface AppointmentServiceLocal {
	public List<Appointment> getAllAppointments() ;
	public String getApp();

}
