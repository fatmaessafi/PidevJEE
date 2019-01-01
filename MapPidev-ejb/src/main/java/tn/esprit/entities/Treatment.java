package tn.esprit.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;


/**
 * The persistent class for the Treatments database table.
 * 
 */
@Entity
@Table(name="Treatments")
@NamedQuery(name="Treatment.findAll", query="SELECT t FROM Treatment t")
public class Treatment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TreatmentId")
	private int TreatmentId;

	@Column(name="Illness")
	private String Illness;

	@Column(name="PatientId")
	private int PatientId;

	@Column(name="Validation")
	private boolean Validation;

	//bi-directional many-to-one association to Step
	@OneToMany(mappedBy="treatment")
	private List<Step> steps;
	@Transient
	@JsonInclude
	private int DoctorId;
	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="DoctorId")
	private User user;

	public Treatment() {
	}

	public int getTreatmentId() {
		return TreatmentId;
	}

	public void setTreatmentId(int treatmentId) {
		TreatmentId = treatmentId;
	}

	public String getIllness() {
		return Illness;
	}

	public void setIllness(String illness) {
		Illness = illness;
	}

	public int getPatientId() {
		return PatientId;
	}

	public void setPatientId(int patientId) {
		PatientId = patientId;
	}

	public boolean isValidation() {
		return Validation;
	}

	public void setValidation(boolean validation) {
		Validation = validation;
	}

	public List<Step> getSteps() {
		return steps;
	}

	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}

	public int getDoctorId() {
		return DoctorId;
	}

	public void setDoctorId(int doctorId) {
		DoctorId = doctorId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Treatment [TreatmentId=" + TreatmentId + ", Illness=" + Illness + ", PatientId=" + PatientId
				+ ", Validation=" + Validation + ", steps=" + steps + ", DoctorId=" + DoctorId + ", user=" + user + "]";
	}


}