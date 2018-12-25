package tn.esprit.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Users database table.
 * 
 */
@Entity
@Table(name="Users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;

	@Column(name="AccessFailedCount")
	private int accessFailedCount;

	@Column(name="Allergies")
	private String allergies;

	@Column(name="BirthDate")
	private String birthDate;

	@Column(name="City")
	private String city;

	@Column(name="CivilStatus")
	private String civilStatus;

	@Column(name="Discriminator")
	private String discriminator;

	@Column(name="Email")
	private String email;

	@Column(name="EmailConfirmed")
	private boolean emailConfirmed;

	@Column(name="Enabled")
	private boolean enabled;

	@Column(name="FirstName")
	private String firstName;

	@Column(name="Gender")
	private String gender;

	@Column(name="HomeAddress")
	private String homeAddress;

	@Column(name="LastName")
	private String lastName;

	@Column(name="Location")
	private String location;

	@Column(name="LockoutEnabled")
	private boolean lockoutEnabled;

	@Column(name="LockoutEndDateUtc")
	private String lockoutEndDateUtc;

	@Column(name="Password")
	private String password;

	@Column(name="PasswordHash")
	private String passwordHash;

	@Column(name="PhoneNumber")
	private String phoneNumber;

	@Column(name="PhoneNumberConfirmed")
	private boolean phoneNumberConfirmed;

	@Column(name="Profession")
	private String profession;

	@Column(name="RegistrationDate")
	private String registrationDate;

	@Column(name="SecurityStamp")
	private String securityStamp;

	@Column(name="Speciality")
	private String speciality;

	@Column(name="SpecialReq")
	private String specialReq;

	@Column(name="Surgeon")
	private boolean surgeon;

	@Column(name="TwoFactorEnabled")
	private boolean twoFactorEnabled;

	@Column(name="UserName")
	private String userName;

	//bi-directional many-to-one association to Analytic
	@OneToMany(mappedBy="user")
	private List<Analytic> analytics;

	//bi-directional many-to-one association to Appointment
	@OneToMany(mappedBy="user")
	private List<Appointment> appointments;

	//bi-directional many-to-one association to CustomUserClaim
	@OneToMany(mappedBy="user")
	private List<CustomUserClaim> customUserClaims;

	//bi-directional many-to-one association to CustomUserLogin
	@OneToMany(mappedBy="user")
	private List<CustomUserLogin> customUserLogins;

	//bi-directional many-to-one association to CustomUserRole
	@OneToMany(mappedBy="user")
	private List<CustomUserRole> customUserRoles;

	//bi-directional many-to-one association to DayOff
	@OneToMany(mappedBy="user")
	private List<DayOff> dayOffs;

	//bi-directional many-to-one association to Event
	@OneToMany(mappedBy="user")
	private List<Event> events;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="user")
	private List<Message> messages;

	//bi-directional many-to-one association to Treatment
	@OneToMany(mappedBy="user")
	private List<Treatment> treatments;

	//bi-directional many-to-one association to VisitReason
	@OneToMany(mappedBy="user")
	private List<VisitReason> visitReasons;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccessFailedCount() {
		return this.accessFailedCount;
	}

	public void setAccessFailedCount(int accessFailedCount) {
		this.accessFailedCount = accessFailedCount;
	}

	public String getAllergies() {
		return this.allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public String getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCivilStatus() {
		return this.civilStatus;
	}

	public void setCivilStatus(String civilStatus) {
		this.civilStatus = civilStatus;
	}

	public String getDiscriminator() {
		return this.discriminator;
	}

	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getEmailConfirmed() {
		return this.emailConfirmed;
	}

	public void setEmailConfirmed(boolean emailConfirmed) {
		this.emailConfirmed = emailConfirmed;
	}

	public boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHomeAddress() {
		return this.homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean getLockoutEnabled() {
		return this.lockoutEnabled;
	}

	public void setLockoutEnabled(boolean lockoutEnabled) {
		this.lockoutEnabled = lockoutEnabled;
	}

	public String getLockoutEndDateUtc() {
		return this.lockoutEndDateUtc;
	}

	public void setLockoutEndDateUtc(String lockoutEndDateUtc) {
		this.lockoutEndDateUtc = lockoutEndDateUtc;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordHash() {
		return this.passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean getPhoneNumberConfirmed() {
		return this.phoneNumberConfirmed;
	}

	public void setPhoneNumberConfirmed(boolean phoneNumberConfirmed) {
		this.phoneNumberConfirmed = phoneNumberConfirmed;
	}

	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getRegistrationDate() {
		return this.registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getSecurityStamp() {
		return this.securityStamp;
	}

	public void setSecurityStamp(String securityStamp) {
		this.securityStamp = securityStamp;
	}

	public String getSpeciality() {
		return this.speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getSpecialReq() {
		return this.specialReq;
	}

	public void setSpecialReq(String specialReq) {
		this.specialReq = specialReq;
	}

	public boolean getSurgeon() {
		return this.surgeon;
	}

	public void setSurgeon(boolean surgeon) {
		this.surgeon = surgeon;
	}

	public boolean getTwoFactorEnabled() {
		return this.twoFactorEnabled;
	}

	public void setTwoFactorEnabled(boolean twoFactorEnabled) {
		this.twoFactorEnabled = twoFactorEnabled;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Analytic> getAnalytics() {
		return this.analytics;
	}

	public void setAnalytics(List<Analytic> analytics) {
		this.analytics = analytics;
	}

	public Analytic addAnalytic(Analytic analytic) {
		getAnalytics().add(analytic);
		analytic.setUser(this);

		return analytic;
	}

	public Analytic removeAnalytic(Analytic analytic) {
		getAnalytics().remove(analytic);
		analytic.setUser(null);

		return analytic;
	}

	public List<Appointment> getAppointments() {
		return this.appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public Appointment addAppointment(Appointment appointment) {
		getAppointments().add(appointment);
		appointment.setUser(this);

		return appointment;
	}

	public Appointment removeAppointment(Appointment appointment) {
		getAppointments().remove(appointment);
		appointment.setUser(null);

		return appointment;
	}

	public List<CustomUserClaim> getCustomUserClaims() {
		return this.customUserClaims;
	}

	public void setCustomUserClaims(List<CustomUserClaim> customUserClaims) {
		this.customUserClaims = customUserClaims;
	}

	public CustomUserClaim addCustomUserClaim(CustomUserClaim customUserClaim) {
		getCustomUserClaims().add(customUserClaim);
		customUserClaim.setUser(this);

		return customUserClaim;
	}

	public CustomUserClaim removeCustomUserClaim(CustomUserClaim customUserClaim) {
		getCustomUserClaims().remove(customUserClaim);
		customUserClaim.setUser(null);

		return customUserClaim;
	}

	public List<CustomUserLogin> getCustomUserLogins() {
		return this.customUserLogins;
	}

	public void setCustomUserLogins(List<CustomUserLogin> customUserLogins) {
		this.customUserLogins = customUserLogins;
	}

	public CustomUserLogin addCustomUserLogin(CustomUserLogin customUserLogin) {
		getCustomUserLogins().add(customUserLogin);
		customUserLogin.setUser(this);

		return customUserLogin;
	}

	public CustomUserLogin removeCustomUserLogin(CustomUserLogin customUserLogin) {
		getCustomUserLogins().remove(customUserLogin);
		customUserLogin.setUser(null);

		return customUserLogin;
	}

	public List<CustomUserRole> getCustomUserRoles() {
		return this.customUserRoles;
	}

	public void setCustomUserRoles(List<CustomUserRole> customUserRoles) {
		this.customUserRoles = customUserRoles;
	}

	public CustomUserRole addCustomUserRole(CustomUserRole customUserRole) {
		getCustomUserRoles().add(customUserRole);
		customUserRole.setUser(this);

		return customUserRole;
	}

	public CustomUserRole removeCustomUserRole(CustomUserRole customUserRole) {
		getCustomUserRoles().remove(customUserRole);
		customUserRole.setUser(null);

		return customUserRole;
	}

	public List<DayOff> getDayOffs() {
		return this.dayOffs;
	}

	public void setDayOffs(List<DayOff> dayOffs) {
		this.dayOffs = dayOffs;
	}

	public DayOff addDayOff(DayOff dayOff) {
		getDayOffs().add(dayOff);
		dayOff.setUser(this);

		return dayOff;
	}

	public DayOff removeDayOff(DayOff dayOff) {
		getDayOffs().remove(dayOff);
		dayOff.setUser(null);

		return dayOff;
	}

	public List<Event> getEvents() {
		return this.events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public Event addEvent(Event event) {
		getEvents().add(event);
		event.setUser(this);

		return event;
	}

	public Event removeEvent(Event event) {
		getEvents().remove(event);
		event.setUser(null);

		return event;
	}

	public List<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public Message addMessage(Message message) {
		getMessages().add(message);
		message.setUser(this);

		return message;
	}

	public Message removeMessage(Message message) {
		getMessages().remove(message);
		message.setUser(null);

		return message;
	}

	public List<Treatment> getTreatments() {
		return this.treatments;
	}

	public void setTreatments(List<Treatment> treatments) {
		this.treatments = treatments;
	}

	public Treatment addTreatment(Treatment treatment) {
		getTreatments().add(treatment);
		treatment.setUser(this);

		return treatment;
	}

	public Treatment removeTreatment(Treatment treatment) {
		getTreatments().remove(treatment);
		treatment.setUser(null);

		return treatment;
	}

	public List<VisitReason> getVisitReasons() {
		return this.visitReasons;
	}

	public void setVisitReasons(List<VisitReason> visitReasons) {
		this.visitReasons = visitReasons;
	}

	public VisitReason addVisitReason(VisitReason visitReason) {
		getVisitReasons().add(visitReason);
		visitReason.setUser(this);

		return visitReason;
	}

	public VisitReason removeVisitReason(VisitReason visitReason) {
		getVisitReasons().remove(visitReason);
		visitReason.setUser(null);

		return visitReason;
	}

}