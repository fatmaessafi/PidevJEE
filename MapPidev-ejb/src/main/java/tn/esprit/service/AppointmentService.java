
package tn.esprit.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
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
	
	


	

}
