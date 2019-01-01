package tn.esprit.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import tn.esprit.entities.Step;
import tn.esprit.entities.Treatment;

/**
 * Session Bean implementation class ServiceStep
 */
@Stateless
@LocalBean
public class ServiceStep implements ServiceStepRemote, ServiceStepLocal {

    /**
     * Default constructor. 
     */
    public ServiceStep() {
        // TODO Auto-generated constructor stub
    }

    public List<Step> getStepsByIdTreatment(int idTreatment) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:21514/api/WSFatma/GetStepsByIdTreatment/"+idTreatment);
		Response reponse = target.request().get();
		String result = reponse.readEntity(String.class);
		Gson j = new Gson();
		List<Step>  steps=j.fromJson(result, new TypeToken<List<Step>>(){}.getType());
		System.out.println("result="+result);
		 reponse.close();      
       return steps;
    }
}
