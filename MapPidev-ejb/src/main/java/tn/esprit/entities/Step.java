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
	private int StepId;

	@Column(name="LastModificationBy")
	private int LastModificationBy;

	@Column(name="LastModificationDate")
	private String LastModificationDate;

	@Column(name="ModificationReason")
	private String ModificationReason;

	@Column(name="NbModifications")
	private int NbModifications;

	@Column(name="StepDate")
	private String StepDate;

	@Column(name="StepDescription")
	private String StepDescription;

	@Column(name="StepSpeciality")
	private String StepSpeciality;

	@Column(name="Validation")
	private boolean Validation;

	//bi-directional many-to-one association to Appointment
	@OneToMany(mappedBy="step")
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
		return StepId;
	}

	public void setStepId(int stepId) {
		StepId = stepId;
	}

	public int getLastModificationBy() {
		return LastModificationBy;
	}

	public void setLastModificationBy(int lastModificationBy) {
		LastModificationBy = lastModificationBy;
	}

	public String getLastModificationDate() {
		return LastModificationDate;
	}

	public void setLastModificationDate(String lastModificationDate) {
		LastModificationDate = lastModificationDate;
	}

	public String getModificationReason() {
		return ModificationReason;
	}

	public void setModificationReason(String modificationReason) {
		ModificationReason = modificationReason;
	}

	public int getNbModifications() {
		return NbModifications;
	}

	public void setNbModifications(int nbModifications) {
		NbModifications = nbModifications;
	}

	public String getStepDate() {
		return StepDate;
	}

	public void setStepDate(String stepDate) {
		StepDate = stepDate;
	}

	public String getStepDescription() {
		return StepDescription;
	}

	public void setStepDescription(String stepDescription) {
		StepDescription = stepDescription;
	}

	public String getStepSpeciality() {
		return StepSpeciality;
	}

	public void setStepSpeciality(String stepSpeciality) {
		StepSpeciality = stepSpeciality;
	}

	public boolean isValidation() {
		return Validation;
	}

	public void setValidation(boolean validation) {
		Validation = validation;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public Treatment getTreatment() {
		return treatment;
	}

	public void setTreatment(Treatment treatment) {
		this.treatment = treatment;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}