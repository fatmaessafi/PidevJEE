package tn.esprit.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;


/**
 * The persistent class for the Appointments database table.
 * 
 */
/**
 * @author wael
 *
 */
@Entity
@Table(name="Appointments")
@NamedQuery(name="Appointment.findAll", query="SELECT a FROM Appointment a")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Appointment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AppointmentId")
	private int AppointmentId;

	@Column(name="AppDate")
	private String AppDate;

	@Column(name="AppRate")
	private int AppRate;

	@Column(name="PatientId")
	private int PatientId;

	@Column(name="VisitReason")
	private String VisitReason;

	//bi-directional many-to-one association to Step
	@ManyToOne
	@JoinColumn(name="StepId")
	private Step Step;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="DoctorId")
	private User User;

	//bi-directional one-to-one association to Report
	@OneToOne(mappedBy="appointment")
	private Report Report;

	//bi-directional many-to-one association to Step
	@OneToMany(mappedBy="appointment")
	private List<Step> Steps;

	public Appointment() {
	}

	public int getAppointmentId() {
		return this.AppointmentId;
	}

	public void setAppointmentId(int AppointmentId) {
		this.AppointmentId = AppointmentId;
	}

	public String getAppDate() {
		return this.AppDate;
	}

	public void setAppDate(String AppDate) {
		this.AppDate = AppDate;
	}

	public int getAppRate() {
		return this.AppRate;
	}

	public void setAppRate(int AppRate) {
		this.AppRate = AppRate;
	}

	public int getPatientId() {
		return this.PatientId;
	}

	public void setPatientId(int PatientId) {
		this.PatientId = PatientId;
	}

	public String getVisitReason() {
		return this.VisitReason;
	}

	public void setVisitReason(String VisitReason) {
		this.VisitReason = VisitReason;
	}

	public Step getStep() {
		return this.Step;
	}

	public void setStep(Step Step) {
		this.Step = Step;
	}

	public User getUser() {
		return this.User;
	}

	public void setUser(User user) {
		this.User = User;
	}

	public Report getReport() {
		return this.Report;
	}

	public void setReport(Report Report) {
		this.Report = Report;
	}

	public List<Step> getSteps() {
		return this.Steps;
	}

	public void setSteps(List<Step> Steps) {
		this.Steps = Steps;
	}

	public Step addStep(Step Step) {
		getSteps().add(Step);
		Step.setAppointment(this);

		return Step;
	}

	public Step removeStep(Step Step) {
		getSteps().remove(Step);
		Step.setAppointment(null);

		return Step;
	}
	
	

	public Appointment( String appDate, int appRate, int patientId, String visitReason) {
		super();
	
		this.AppDate = appDate;
		this.AppRate = appRate;
		this.PatientId = patientId;
		this.VisitReason = visitReason;
		
	}
	

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + AppointmentId + ", appDate=" + AppDate + ", appRate=" + AppRate
				+ ", patientId=" + PatientId + ", visitReason=" + VisitReason + ", step=" + Step + ", user=" + User
				+ ", report=" + Report + ", steps=" + Steps + "]";
	}

}