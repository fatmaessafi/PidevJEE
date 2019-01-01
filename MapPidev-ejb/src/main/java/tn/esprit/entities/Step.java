package tn.esprit.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Steps database table.
 * 
 */
@Entity
@Table(name="Steps")
@NamedQuery(name="Step.findAll", query="SELECT s FROM Step s")
public class Step implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="StepId")
	private int stepId;

	@Column(name="LastModificationBy")
	private int lastModificationBy;

	@Column(name="LastModificationDate")
	private String lastModificationDate;

	@Column(name="ModificationReason")
	private String modificationReason;

	@Column(name="NbModifications")
	private int nbModifications;

	@Column(name="StepDate")
	private String stepDate;

	@Column(name="StepDescription")
	private String stepDescription;

	@Column(name="StepSpeciality")
	private String stepSpeciality;

	@Column(name="Validation")
	private boolean validation;

	//bi-directional many-to-one association to Appointment
	@OneToMany(mappedBy="Step")
	private List<Appointment> appointments;

	//bi-directional many-to-one association to Appointment
	@ManyToOne
	@JoinColumn(name="AppointmentId")
	private Appointment appointment;

	//bi-directional many-to-one association to Treatment
	@ManyToOne
	@JoinColumn(name="TreatmentId")
	private Treatment treatment;

	public Step() {
	}

	public int getStepId() {
		return this.stepId;
	}

	public void setStepId(int stepId) {
		this.stepId = stepId;
	}

	public int getLastModificationBy() {
		return this.lastModificationBy;
	}

	public void setLastModificationBy(int lastModificationBy) {
		this.lastModificationBy = lastModificationBy;
	}

	public String getLastModificationDate() {
		return this.lastModificationDate;
	}

	public void setLastModificationDate(String lastModificationDate) {
		this.lastModificationDate = lastModificationDate;
	}

	public String getModificationReason() {
		return this.modificationReason;
	}

	public void setModificationReason(String modificationReason) {
		this.modificationReason = modificationReason;
	}

	public int getNbModifications() {
		return this.nbModifications;
	}

	public void setNbModifications(int nbModifications) {
		this.nbModifications = nbModifications;
	}

	public String getStepDate() {
		return this.stepDate;
	}

	public void setStepDate(String stepDate) {
		this.stepDate = stepDate;
	}

	public String getStepDescription() {
		return this.stepDescription;
	}

	public void setStepDescription(String stepDescription) {
		this.stepDescription = stepDescription;
	}

	public String getStepSpeciality() {
		return this.stepSpeciality;
	}

	public void setStepSpeciality(String stepSpeciality) {
		this.stepSpeciality = stepSpeciality;
	}

	public boolean getValidation() {
		return this.validation;
	}

	public void setValidation(boolean validation) {
		this.validation = validation;
	}

	public List<Appointment> getAppointments() {
		return this.appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public Appointment addAppointment(Appointment appointment) {
		getAppointments().add(appointment);
		appointment.setStep(this);

		return appointment;
	}

	public Appointment removeAppointment(Appointment appointment) {
		getAppointments().remove(appointment);
		appointment.setStep(null);

		return appointment;
	}

	public Appointment getAppointment() {
		return this.appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public Treatment getTreatment() {
		return this.treatment;
	}

	public void setTreatment(Treatment treatment) {
		this.treatment = treatment;
	}

}