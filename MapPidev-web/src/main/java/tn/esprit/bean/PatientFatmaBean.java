package tn.esprit.bean;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import tn.esprit.entities.User;
import tn.esprit.service.ServiceFatmaPatientLocal;

@ManagedBean
@javax.faces.bean.SessionScoped
public class PatientFatmaBean {
	
	@EJB
	ServiceFatmaPatientLocal serviceFatmaPatientLocal ;

	List<User> listPatients = new ArrayList<>();

	private String firstName;

	private String lastName;

	private String email;

	private String password;

	private String confirmPassword;

	private String phoneNumber;

	private String gender;


	private String city;

	private String homeAddress;

	private String civilStatus;
	private Boolean termsAndConditions;

	private String role;
	// Patient attributes

	private String allergies;

	private String profession;

	private String specialReq;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getCivilStatus() {
		return civilStatus;
	}

	public void setCivilStatus(String civilStatus) {
		this.civilStatus = civilStatus;
	}

	public Boolean getTermsAndConditions() {
		return termsAndConditions;
	}

	public void setTermsAndConditions(Boolean termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getSpecialReq() {
		return specialReq;
	}

	public void setSpecialReq(String specialReq) {
		this.specialReq = specialReq;
	}
	
	
	public List<User> getListPatients() {
		return listPatients;
	}

	public void setListPatients(List<User> listPatients) {
		this.listPatients = listPatients;
	}

	public List<User>  GetAllPatients() throws ParseException
	{
		listPatients = serviceFatmaPatientLocal.getAllPatients() ;
		for( User u :  listPatients)
		{
			
			//System.out.println(u.getFirstName());
		}
		return listPatients;
	}
	public String getTreatment(int idPatient)
	{ 
		System.out.println("selected="+idPatient);
	return "treatmentByPatient?faces-redirect=true&idPatient="+idPatient;
	}
}
	