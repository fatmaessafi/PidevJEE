
package tn.esprit.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.client.ClientBuilder;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import tn.esprit.entities.User;
import tn.esprit.vm.RegisterVM;

import tn.esprit.entities.Appointment;
import tn.esprit.entities.Treatment;


/**
 * Session Bean implementation class MandateService
 */
@Stateless
@LocalBean


public class AppointmentService implements AppointmetServiceRemote, AppointmentServiceLocal {

    
	 public AppointmentService()
	 {
		 
	 }
	   
    
	public List<Appointment> getAllAppointments() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:21514/api/GetAllAppointments");
		Response reponse = target.request().get();
		String result = reponse.readEntity(String.class);
		Gson j = new Gson();
		List<Appointment>  patients=j.fromJson(result, new TypeToken<List<Appointment>>(){}.getType());
		System.out.println("result="+result);
		System.out.println(patients.toString());
		System.out.println("lalalalalalalall");
	
		 reponse.close();      
       return patients;
    }
    
	public String getApp() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:21514/api/GetAllAppointments");
		Response reponse = target.request().get();
		String result = reponse.readEntity(String.class);
		
	
		 reponse.close();      
       return result;
    }
	
	

	   @Override
		public List<Appointment> getAppointmentByIdPatient(int idPatient) {
			Client client = ClientBuilder.newClient();
			WebTarget target = client.target("http://localhost:21514/api/Appointmentbyid/"+idPatient);
			Response reponse = target.request().get();
			String result = reponse.readEntity(String.class);
			Gson j = new Gson();
			List<Appointment>  treatments=j.fromJson(result, new TypeToken<List<Appointment>>(){}.getType());
			System.out.println("result="+result);
			 reponse.close();      
	       return treatments;
	    }
	   
	   
	   int idPatient=1;

	   @Override
		public String getAppointmentByIdPatient1(int idPatient) {
		   Client client = ClientBuilder.newClient();
			WebTarget target = client.target("http://localhost:21514/api/Appointmentbyid/"+1);
			Response reponse = target.request().get();
			String result = reponse.readEntity(String.class);
			
		
			 reponse.close();      
	       return result;
	    }
	   @PersistenceContext
	   EntityManager em  ;
	   
	 //  int idpatient=1;
		public List<Appointment> getAllApp( int idpatient)
		{	
			
		    TypedQuery<Appointment> query = em.createQuery("Select e from Appointment e  where e.PatientId="+idpatient , Appointment.class);
		 //  query.setParameter("valide",0);
	 
			List<Appointment> appointments=query.getResultList();
			
			return appointments;
		}
		
		   @Override
		   public void addrdv(Appointment a)
		   {
			
			  em.persist(a);
		
			   
		   }
	
		
		
		

}
