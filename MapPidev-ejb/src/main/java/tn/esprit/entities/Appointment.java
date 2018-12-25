package tn.esprit.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Appointments database table.
 * 
 */
@Entity
@Table(name="Appointments")
@NamedQuery(name="Appointment.findAll", query="SELECT a FROM Appointment a")
public class Appointment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AppointmentId")
	private int appointmentId;

	@Column(name="AppDate")
	private String appDate;

	@Column(name="AppRate")
	private int appRate;

	@Column(name="PatientId")
	private int patientId;

	@Column(name="VisitReason")
	private String visitReason;

	//bi-directional many-to-one association to Step
	@ManyToOne
	@JoinColumn(name="StepId")
	private Step step;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="DoctorId")
	private User user;

	//bi-directional one-to-one association to Report
	@OneToOne(mappedBy="appointment")
	private Report report;

	//bi-directional many-to-one association to Step
	@OneToMany(mappedBy="appointment")
	private List<Step> steps;

	public Appointment() {
	}

	public int getAppointmentId() {
		return this.appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getAppDate() {
		return this.appDate;
	}

	public void setAppDate(String appDate) {
		this.appDate = appDate;
	}

	public int getAppRate() {
		return this.appRate;
	}

	public void setAppRate(int appRate) {
		this.appRate = appRate;
	}

	public int getPatientId() {
		return this.patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getVisitReason() {
		return this.visitReason;
	}

	public void setVisitReason(String visitReason) {
		this.visitReason = visitReason;
	}

	public Step getStep() {
		return this.step;
	}

	public void setStep(Step step) {
		this.step = step;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Report getReport() {
		return this.report;
	}

	public void setReport(Report report) {
		this.report = report;
	}

	public List<Step> getSteps() {
		return this.steps;
	}

	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}

	public Step addStep(Step step) {
		getSteps().add(step);
		step.setAppointment(this);

		return step;
	}

	public Step removeStep(Step step) {
		getSteps().remove(step);
		step.setAppointment(null);

		return step;
	}

}