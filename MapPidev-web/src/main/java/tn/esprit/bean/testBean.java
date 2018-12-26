package tn.esprit.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ejb.EJB;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;

import javax.faces.context.FacesContext;

import tn.esprit.entities.User;
import tn.esprit.service.UserServiceLocal;
import tn.esprit.vm.RegisterVM;

@ManagedBean
@javax.faces.bean.SessionScoped
public class testBean {
	@EJB
	UserServiceLocal userServiceLocal;
	private String firstName;

	private String lastName;

	private String email;

	private String password;

	private String confirmPassword;

	private String phoneNumber;

	private String gender;

	private String birthDate;

	private String city;

	private String homeAddress;

	private String civilStatus;
	private Boolean termsAndConditions;

	private String role;
	// Patient attributes

	private String allergies;

	private String profession;

	private String specialReq;
	// Doctor attributes

	private String speciality;

	private String location;

	private String surgeon;

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

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
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

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSurgeon() {
		return surgeon;
	}

	public void setSurgeon(String surgeon) {
		this.surgeon = surgeon;
	}

	public Boolean getTermsAndConditions() {
		return termsAndConditions;
	}

	public void setTermsAndConditions(Boolean termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}

	public String doRegister() throws ParseException {
		String navigateTo = "";
		RegisterVM user = new RegisterVM();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPassword(password);
		user.setPassword(confirmPassword);
		user.setPhoneNumber(phoneNumber);
		user.setGender(gender);
		SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
		user.setBirthDate(simpleFormat.parse(birthDate));
		user.setCity(city);
		user.setHomeAddress(homeAddress);
		user.setCivilStatus(civilStatus);
		user.setTermsAndConditions(termsAndConditions);
		user.setRole(role);
		user.setProfession(profession);
		user.setAllergies(allergies);
		user.setSpecialReq(specialReq);
		user.setSpeciality(speciality);
		user.setLocation(location);
		user.setSurgeon(surgeon);
		userServiceLocal.Register(user);
		System.out.println(user);
		System.out.println("ok register");
		navigateTo = "/xhtml/login?faces-redirect=true";

		return navigateTo;
	}
}
