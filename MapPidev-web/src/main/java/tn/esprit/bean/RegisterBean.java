package tn.esprit.bean;

import java.util.Date;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import tn.esprit.entities.User;
import tn.esprit.service.UserServiceLocal;
import tn.esprit.vm.RegisterVM;

@ManagedBean
@SessionScoped
public class RegisterBean {
	@EJB
	UserServiceLocal userServiceLocal;
	private String FirstName;

	private String LastName;

	private String Email;

	private String Password;

	private String ConfirmPassword;

	private String PhoneNumber;

	private String Gender;

	private Date BirthDate;

	private String City;

	private String HomeAddress;

	private String CivilStatus;

	private String Role;
	// Patient attributes

	private String Allergies;

	private String Profession;

	private String SpecialReq;
	// Doctor attributes

	private String Speciality;

	private String Location;

	private String Surgeon;
	
	 public String doRegister(){
    	 String navigateTo="";
    	 RegisterVM user=new RegisterVM();
         user.setFirstName(FirstName);
         user.setLastName(LastName);
         user.setEmail(Email);
         user.setPassword(Password);
         user.setPassword(ConfirmPassword);
         user.setPhoneNumber(PhoneNumber);
         user.setGender(Gender);
         user.setBirthDate(BirthDate);
         user.setCity(City);
         user.setHomeAddress(HomeAddress);
         user.setCivilStatus(CivilStatus);
       user.setRole(Role);
       user.setProfession(Profession);
       user.setAllergies(Allergies);
       user.setSpecialReq(SpecialReq);
       user.setSpeciality(Speciality);
       user.setLocation(Location);
       user.setSurgeon(Surgeon);
         userServiceLocal.Register(user);
    	 System.out.println("ok register");
    	 navigateTo="/xhtml/login?faces-redirect=true";
    	 
    	 return navigateTo;
     }
}