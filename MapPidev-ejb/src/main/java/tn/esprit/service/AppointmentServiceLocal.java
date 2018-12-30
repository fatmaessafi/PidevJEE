package tn.esprit.service;
import java.util.List;

import javax.ejb.Local;

import tn.esprit.entities.Appointment;

@Local
public interface AppointmentServiceLocal {
	public void getAllAppointments();
	public String getAllAppointment();
	public List<Appointment> ConsommerAppointment();


}
