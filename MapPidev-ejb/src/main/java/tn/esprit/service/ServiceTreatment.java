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

import tn.esprit.entities.Treatment;
import tn.esprit.entities.User;

/**
 * Session Bean implementation class ServiceTreatment
 */
@Stateless
@LocalBean
public class ServiceTreatment implements ServiceTreatmentRemote, ServiceTreatmentLocal {

    /**
     * Default constructor. 
     */
    public ServiceTreatment() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
	public List<Treatment> getTreatmentByIdPatient(int idPatient) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:21514/api/WSFatma/GetTreatmentByIdPatient/"+idPatient);
		Response reponse = target.request().get();
		String result = reponse.readEntity(String.class);
		Gson j = new Gson();
		List<Treatment>  treatments=j.fromJson(result, new TypeToken<List<Treatment>>(){}.getType());
		System.out.println("result="+result);
		 reponse.close();      
       return treatments;
    }

}
