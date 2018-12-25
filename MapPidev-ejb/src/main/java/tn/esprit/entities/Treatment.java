package tn.esprit.entities;

import java.io.Serializable;
import javax.persistence.*;
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
	private int treatmentId;

	@Column(name="Illness")
	private String illness;

	@Column(name="PatientId")
	private int patientId;

	@Column(name="Validation")
	private boolean validation;

	//bi-directional many-to-one association to Step
	@OneToMany(mappedBy="treatment")
	private List<Step> steps;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="DoctorId")
	private User user;

	public Treatment() {
	}

	public int getTreatmentId() {
		return this.treatmentId;
	}

	public void setTreatmentId(int treatmentId) {
		this.treatmentId = treatmentId;
	}

	public String getIllness() {
		return this.illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}

	public int getPatientId() {
		return this.patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public boolean getValidation() {
		return this.validation;
	}

	public void setValidation(boolean validation) {
		this.validation = validation;
	}

	public List<Step> getSteps() {
		return this.steps;
	}

	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}

	public Step addStep(Step step) {
		getSteps().add(step);
		step.setTreatment(this);

		return step;
	}

	public Step removeStep(Step step) {
		getSteps().remove(step);
		step.setTreatment(null);

		return step;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}