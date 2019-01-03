package tn.esprit.service;
import java.util.List;

import javax.ejb.Local;

import tn.esprit.entities.Appointment;
import tn.esprit.entities.User;

@Local
public interface AppointmentServiceLocal {
	public List<Appointment> getAllAppointments() ;
	public String getApp();
	public List<Appointment> getAppointmentByIdPatient(int idPatient);
	public String getAppointmentByIdPatient1(int idPatient) ;
	public List<Appointment> getAllApp(int idpatient);
	public void  addrdv(Appointment a);

}
