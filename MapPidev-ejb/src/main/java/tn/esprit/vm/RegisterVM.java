package tn.esprit.vm;

import java.util.Date;

public class RegisterVM {
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

	private Boolean Enabled;
	private Date RegistrationDate;

	private Boolean TermsAndConditions;

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

	public Boolean getEnabled() {
		return Enabled;
	}

	public void setEnabled(Boolean enabled) {
		Enabled = enabled;
	}

	public Date getRegistrationDate() {
		return RegistrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		RegistrationDate = registrationDate;
	}

	public Boolean getTermsAndConditions() {
		return TermsAndConditions;
	}

	public void setTermsAndConditions(Boolean termsAndConditions) {
		TermsAndConditions = termsAndConditions;
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

	public RegisterVM(String firstName, String lastName, String email, String password, String confirmPassword,
			String phoneNumber, String gender, Date birthDate, String city, String homeAddress, String civilStatus,
			Boolean enabled, Date registrationDate, Boolean termsAndConditions, String role, String allergies,
			String profession, String specialReq, String speciality, String location, String surgeon) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Password = password;
		ConfirmPassword = confirmPassword;
		PhoneNumber = phoneNumber;
		Gender = gender;
		BirthDate = birthDate;
		City = city;
		HomeAddress = homeAddress;
		CivilStatus = civilStatus;
		Enabled = enabled;
		RegistrationDate = registrationDate;
		TermsAndConditions = termsAndConditions;
		Role = role;
		Allergies = allergies;
		Profession = profession;
		SpecialReq = specialReq;
		Speciality = speciality;
		Location = location;
		Surgeon = surgeon;
	}
	
	public RegisterVM()
	{
		
	}
}
