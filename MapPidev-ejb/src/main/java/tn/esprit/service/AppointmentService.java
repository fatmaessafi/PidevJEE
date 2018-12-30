package tn.esprit.service;

import java.util.ArrayList;
import java.util.List;

//import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import tn.esprit.entities.Appointment;;

/**
 * Session Bean implementation class MandateService
 */
@Stateless

public class AppointmentService implements AppointmetServiceRemote, AppointmentServiceLocal {

    /**
     * Default constructor. 
     */
    public AppointmentService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void getAllAppointments() {
		// TODO Auto-generated method stub
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("http://localhost:21514/api/GetAllAppointments");
		Response response=target.request().get();
		String result=response.readEntity(String.class);
		System.out.println(result);
		response.close();
	}

	@Override
	public String getAllAppointment() {
		// TODO Auto-generated method stub
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("http://localhost:21514/api/GetAllAppointments");
		Response response=target.request().get();
		String result=response.readEntity(String.class);
		//Mandate r=response.readEntity(Mandate.class);
	
		System.out.println(result);
		response.close();
		return result;
		
	}

	@Override
	public List<Appointment> ConsommerAppointment() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:21514/api/GetAllAppointments");

		Response reponse = target.request(MediaType.APPLICATION_JSON).get();

		String result = reponse.readEntity(String.class);

		System.out.println(result);

		Gson j = new Gson();
		List<Appointment> doctors = new ArrayList<Appointment>();

		doctors = j.fromJson(result, new TypeToken<List<Appointment>>() {
		}.getType());

		//System.out.println(Appointment.get(0).);

		reponse.close();
	    return doctors;
	}


	

}
