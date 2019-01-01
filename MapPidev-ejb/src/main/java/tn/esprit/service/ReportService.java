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

import tn.esprit.entities.Report;
import tn.esprit.entities.User;

@Stateless
@LocalBean
public class ReportService implements ReportServiceLocal,ReportServiceRemote {
	public ReportService(){
		
	}
	 @Override
		public List<Report> getAllReports() {
			Client client = ClientBuilder.newClient();
			WebTarget target = client.target("http://localhost:21514/api/GetAllReports");
			Response reponse = target.request().get();
			String result = reponse.readEntity(String.class);
			Gson j = new Gson();
			List<Report>  reports=j.fromJson(result, new TypeToken<List<Report>>(){}.getType());
			System.out.println("result="+result);
			 reponse.close();      
	       return reports;
	    }

}
