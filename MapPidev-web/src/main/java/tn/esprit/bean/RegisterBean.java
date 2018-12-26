package tn.esprit.bean;

import java.util.Date;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
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

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getConfirmPassword() {
		return ConfirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public Date getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getHomeAddress() {
		return HomeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		HomeAddress = homeAddress;
	}

	public String getCivilStatus() {
		return CivilStatus;
	}

	public void setCivilStatus(String civilStatus) {
		CivilStatus = civilStatus;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public String getAllergies() {
		return Allergies;
	}

	public void setAllergies(String allergies) {
		Allergies = allergies;
	}

	public String getProfession() {
		return Profession;
	}

	public void setProfession(String profession) {
		Profession = profession;
	}

	public String getSpecialReq() {
		return SpecialReq;
	}

	public void setSpecialReq(String specialReq) {
		SpecialReq = specialReq;
	}

	public String getSpeciality() {
		return Speciality;
	}

	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getSurgeon() {
		return Surgeon;
	}

	public void setSurgeon(String surgeon) {
		Surgeon = surgeon;
	}

	public String doRegister() {
		String navigateTo = "";
		RegisterVM user = new RegisterVM();
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
		navigateTo = "/xhtml/index?faces-redirect=true";

		return navigateTo;
	}
}