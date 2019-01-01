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


/**
 * Session Bean implementation class ServiceFatmaPatient
 */
@Stateless
@LocalBean
public class ServiceFatmaPatient implements ServiceFatmaPatientRemote, ServiceFatmaPatientLocal {

    /**
     * Default constructor. 
     */
    public ServiceFatmaPatient() {
     
    	// TODO Auto-generated constructor stub
    	
    	
    	}
    @Override
	public List<User> getAllPatients() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:21514/api/WSFatma/GetAllPatients");
		Response reponse = target.request().get();
		String result = reponse.readEntity(String.class);
		Gson j = new Gson();
		List<User>  patients=j.fromJson(result, new TypeToken<List<User>>(){}.getType());
		//System.out.println("result="+result);
		 reponse.close();      
       return patients;
    }

}
