package tn.esprit.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;
import java.util.List;
import tn.esprit.vm.*;

/**
 * The persistent class for the Users database table.
 * 
 */
@Entity
@Table(name = "Users")
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int Id;

	@Column(name = "AccessFailedCount")
	private int AccessFailedCount;

	@Column(name = "Allergies")
	private String Allergies;

	

	@Column(name = "City")
	private String City;

	@Column(name = "CivilStatus")
	private String CivilStatus;

	@Column(name = "Discriminator")
	private String Discriminator;

	@Column(name = "Email")
	private String Email;

	@Column(name = "EmailConfirmed")
	private boolean EmailConfirmed;

	@Column(name = "Enabled")
	private boolean Enabled;

	@Column(name = "FirstName")
	private String FirstName;

	@Column(name = "Gender")
	private String Gender;

	@Column(name = "HomeAddress")
	private String HomeAddress;

	@Column(name = "LastName")
	private String LastName;

	@Column(name = "Location")
	private String Location;

	@Column(name = "LockoutEnabled")
	private boolean LockoutEnabled;

	@Column(name = "LockoutEndDateUtc")
	private Date LockoutEndDateUtc;

	@Column(name = "Password")
	private String Password;

	@Column(name = "PasswordHash")
	private String PasswordHash;

	@Column(name = "PhoneNumber")
	private String PhoneNumber;

	@Column(name = "PhoneNumberConfirmed")
	private boolean PhoneNumberConfirmed;

	@Column(name = "Profession")
	private String Profession;


	@Column(name = "SecurityStamp")
	private String SecurityStamp;

	@Column(name = "Speciality")
	private String Speciality;

	@Column(name = "SpecialReq")
	private String SpecialReq;

	@Column(name = "Surgeon")
	private boolean Surgeon;

	@Column(name = "TwoFactorEnabled")
	private boolean TwoFactorEnabled;

	@Column(name = "UserName")
	private String UserName;

	// bi-directional many-to-one association to Analytic
	@OneToMany(mappedBy = "user")
	private List<Analytic> analytics;

	// bi-directional many-to-one association to Appointment
	@OneToMany(mappedBy = "user")
	private List<Appointment> appointments;

	// bi-directional many-to-one association to CustomUserClaim
	@OneToMany(mappedBy = "user")
	private List<CustomUserClaim> customUserClaims;

	// bi-directional many-to-one association to CustomUserLogin
	@OneToMany(mappedBy = "user")
	private List<CustomUserLogin> customUserLogins;

	// bi-directional many-to-one association to CustomUserRole
	@OneToMany(mappedBy = "user")
	private List<CustomUserRole> customUserRoles;

	// bi-directional many-to-one association to DayOff
	@OneToMany(mappedBy = "user")
	private List<DayOff> dayOffs;

	// bi-directional many-to-one association to Event
	@OneToMany(mappedBy = "user")
	private List<Event> events;

	// bi-directional many-to-one association to Message
	@OneToMany(mappedBy = "user")
	private List<Message> messages;

	// bi-directional many-to-one association to Treatment
	@OneToMany(mappedBy = "user")
	private List<Treatment> treatments;

	// bi-directional many-to-one association to VisitReason
	@OneToMany(mappedBy = "user")
	private List<VisitReason> visitReasons;

	public User() {
	}

	public int getId() {
		return Id;
	}

	public int getAccessFailedCount() {
		return AccessFailedCount;
	}

	public void setAccessFailedCount(int accessFailedCount) {
		AccessFailedCount = accessFailedCount;
	}

	public String getAllergies() {
		return Allergies;
	}

	public void setAllergies(String allergies) {
		Allergies = allergies;
	}
	

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCivilStatus() {
		return CivilStatus;
	}

	public void setCivilStatus(String civilStatus) {
		CivilStatus = civilStatus;
	}

	public String getDiscriminator() {
		return Discriminator;
	}

	public void setDiscriminator(String discriminator) {
		Discriminator = discriminator;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public boolean isEmailConfirmed() {
		return EmailConfirmed;
	}

	public void setEmailConfirmed(boolean emailConfirmed) {
		EmailConfirmed = emailConfirmed;
	}

	public boolean isEnabled() {
		return Enabled;
	}

	public void setEnabled(boolean enabled) {
		Enabled = enabled;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getHomeAddress() {
		return HomeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		HomeAddress = homeAddress;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public boolean isLockoutEnabled() {
		return LockoutEnabled;
	}

	public void setLockoutEnabled(boolean lockoutEnabled) {
		LockoutEnabled = lockoutEnabled;
	}

	public Date getLockoutEndDateUtc() {
		return LockoutEndDateUtc;
	}

	public void setLockoutEndDateUtc(Date lockoutEndDateUtc) {
		LockoutEndDateUtc = lockoutEndDateUtc;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getPasswordHash() {
		return PasswordHash;
	}

	public void setPasswordHash(String passwordHash) {
		PasswordHash = passwordHash;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public boolean isPhoneNumberConfirmed() {
		return PhoneNumberConfirmed;
	}

	public void setPhoneNumberConfirmed(boolean phoneNumberConfirmed) {
		PhoneNumberConfirmed = phoneNumberConfirmed;
	}

	public String getProfession() {
		return Profession;
	}

	public void setProfession(String profession) {
		Profession = profession;
	}

	

	public String getSecurityStamp() {
		return SecurityStamp;
	}

	public void setSecurityStamp(String securityStamp) {
		SecurityStamp = securityStamp;
	}

	public String getSpeciality() {
		return Speciality;
	}

	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}

	public String getSpecialReq() {
		return SpecialReq;
	}

	public void setSpecialReq(String specialReq) {
		SpecialReq = specialReq;
	}

	public boolean isSurgeon() {
		return Surgeon;
	}

	public void setSurgeon(boolean surgeon) {
		Surgeon = surgeon;
	}

	public boolean isTwoFactorEnabled() {
		return TwoFactorEnabled;
	}

	public void setTwoFactorEnabled(boolean twoFactorEnabled) {
		TwoFactorEnabled = twoFactorEnabled;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public List<Analytic> getAnalytics() {
		return analytics;
	}

	public void setAnalytics(List<Analytic> analytics) {
		this.analytics = analytics;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public List<CustomUserClaim> getCustomUserClaims() {
		return customUserClaims;
	}

	public void setCustomUserClaims(List<CustomUserClaim> customUserClaims) {
		this.customUserClaims = customUserClaims;
	}

	public List<CustomUserLogin> getCustomUserLogins() {
		return customUserLogins;
	}

	public void setCustomUserLogins(List<CustomUserLogin> customUserLogins) {
		this.customUserLogins = customUserLogins;
	}

	public List<CustomUserRole> getCustomUserRoles() {
		return customUserRoles;
	}

	public void setCustomUserRoles(List<CustomUserRole> customUserRoles) {
		this.customUserRoles = customUserRoles;
	}

	public List<DayOff> getDayOffs() {
		return dayOffs;
	}

	public void setDayOffs(List<DayOff> dayOffs) {
		this.dayOffs = dayOffs;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public List<Treatment> getTreatments() {
		return treatments;
	}

	public void setTreatments(List<Treatment> treatments) {
		this.treatments = treatments;
	}

	public List<VisitReason> getVisitReasons() {
		return visitReasons;
	}

	public void setVisitReasons(List<VisitReason> visitReasons) {
		this.visitReasons = visitReasons;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setId(int id) {
		Id = id;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", AccessFailedCount=" + AccessFailedCount + ", Allergies=" + Allergies
				+ ", City=" + City + ", CivilStatus=" + CivilStatus + ", Discriminator="
				+ Discriminator + ", Email=" + Email + ", EmailConfirmed=" + EmailConfirmed + ", Enabled=" + Enabled
				+ ", FirstName=" + FirstName + ", Gender=" + Gender + ", HomeAddress=" + HomeAddress + ", LastName="
				+ LastName + ", Location=" + Location + ", LockoutEnabled=" + LockoutEnabled + ", LockoutEndDateUtc="
				+ LockoutEndDateUtc + ", Password=" + Password + ", PasswordHash=" + PasswordHash + ", PhoneNumber="
				+ PhoneNumber + ", PhoneNumberConfirmed=" + PhoneNumberConfirmed + ", Profession=" + Profession
				+ ", SecurityStamp=" + SecurityStamp + ", Speciality="
				+ Speciality + ", SpecialReq=" + SpecialReq + ", Surgeon=" + Surgeon + ", TwoFactorEnabled="
				+ TwoFactorEnabled + ", UserName=" + UserName + ", analytics=" + analytics + ", appointments="
				+ appointments + ", customUserClaims=" + customUserClaims + ", customUserLogins=" + customUserLogins
				+ ", customUserRoles=" + customUserRoles + ", dayOffs=" + dayOffs + ", events=" + events + ", messages="
				+ messages + ", treatments=" + treatments + ", visitReasons=" + visitReasons + "]";
	}

}