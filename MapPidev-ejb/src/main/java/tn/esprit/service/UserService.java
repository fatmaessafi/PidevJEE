package tn.esprit.service;

import java.text.SimpleDateFormat;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import tn.esprit.entities.User;
import tn.esprit.vm.LoginVM;
import tn.esprit.vm.RegisterVM;


/**
 * Session Bean implementation class UserService
 */
@Stateless
@LocalBean
public class UserService implements UserServiceRemote, UserServiceLocal {

	public static User CurrentUser= new User();
    /**
     * Default constructor. 
     */
    public UserService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public User Login(String email, String mdp, Boolean RememberMe) {
		// TODO Auto-generated method stub
		LoginVM u=new LoginVM();
		 u.setEmail(email);
		 u.setPassword(mdp);
		 u.setRememberMe(true);
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("http://localhost:21514/api/Login");
		Gson j=new Gson();		
		ObjectMapper mapper = new ObjectMapper();
		Response response=target.request().post(Entity.json(u));
		System.out.println("LoginVM="+u.toString());
		String result=response.readEntity(String.class);
		System.out.println("result="+result);
		User us = j.fromJson(result, new TypeToken<User>(){}.getType());
		CurrentUser=us;
		System.out.println(us.getEmail());
		response.close();
		return us;
	}

	@Override
	public void Register(RegisterVM u) {
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("http://localhost:21514/api/Register");
		Gson j=new Gson();
		ObjectMapper mapper = new ObjectMapper();
		Response response=target.request().post(Entity.json(u));
		String result=response.readEntity(String.class);
		//u = j.fromJson(result, new TypeToken<RegisterVM>(){}.getType());
		//System.out.println("result="+result);
		response.close();
		
		System.out.println("REGISTER");
	}

	public void Logout ()
	{
		CurrentUser=null;
	}
	
}
