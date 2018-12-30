package tn.esprit.vm;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import tn.esprit.entities.Analytic;
import tn.esprit.entities.Appointment;
import tn.esprit.entities.CustomUserClaim;
import tn.esprit.entities.CustomUserLogin;
import tn.esprit.entities.CustomUserRole;
import tn.esprit.entities.DayOff;
import tn.esprit.entities.Event;
import tn.esprit.entities.Message;
import tn.esprit.entities.Treatment;
import tn.esprit.entities.VisitReason;

public class DoctorVM implements Serializable {
	private static final long serialVersionUID = 1L;

	private int Id;

	private int AccessFailedCount;


	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone="UTC")
	@JsonSerialize(as = Date.class)
	private Date BirthDate;

	private String City;

	private String CivilStatus;


	private String Email;

	private boolean EmailConfirmed;

	private boolean Enabled;

	private String FirstName;

	private String Gender;

	private String HomeAddress;

	private String LastName;

	private String Location;

	private boolean LockoutEnabled;

	private Date LockoutEndDateUtc;

	private String Password;

	private String PasswordHash;

	private String PhoneNumber;

	private boolean PhoneNumberConfirmed;

	private String Profession;

	private Date RegistrationDate;

	private String SecurityStamp;

	private String Speciality;

	private String SpecialReq;

	private boolean Surgeon;

	private boolean TwoFactorEnabled;

	private String UserName;

	//bi-directional many-to-one association to Analytic
	private List<Analytic> ListAnalytics;
		//bi-directional many-to-one association to CustomUserClaim
	private List<CustomUserClaim> Claims;

	//bi-directional many-to-one association to CustomUserLogin
	
	private List<CustomUserLogin> Logins;

	//bi-directional many-to-one association to CustomUserRole
	private List<CustomUserRole> Roles;

	//bi-directional many-to-one association to DayOff
	private List<DayOff> ListDayOff;

	//bi-directional many-to-one association to Event
	private List<Event> ListEvent;

	//bi-directional many-to-one association to Message
	private List<Message> ListMsg;

	//bi-directional many-to-one association to Treatment
	private List<Treatment> ListReferringTreatment;

	//bi-directional many-to-one association to VisitReason
	private List<VisitReason> ListVisitReason;

}
