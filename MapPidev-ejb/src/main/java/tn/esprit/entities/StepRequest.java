package tn.esprit.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the StepRequests database table.
 * 
 */
@Entity
@Table(name="StepRequests")
@NamedQuery(name="StepRequest.findAll", query="SELECT s FROM StepRequest s")
public class StepRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="NewStepId")
	private int newStepId;

	@Column(name="NewLastModificationBy")
	private int newLastModificationBy;

	@Column(name="NewLastModificationDate")
	private String newLastModificationDate;

	@Column(name="NewModificationReason")
	private String newModificationReason;

	@Column(name="NewStepDate")
	private String newStepDate;

	@Column(name="NewStepDescription")
	private String newStepDescription;

	@Column(name="NewStepSpeciality")
	private String newStepSpeciality;

	@Column(name="NewTreatmentId")
	private int newTreatmentId;

	@Column(name="NewValidation")
	private boolean newValidation;

	@Column(name="StepId")
	private int stepId;

	@Column(name="Type")
	private String type;

	public StepRequest() {
	}

	public int getNewStepId() {
		return this.newStepId;
	}

	public void setNewStepId(int newStepId) {
		this.newStepId = newStepId;
	}

	public int getNewLastModificationBy() {
		return this.newLastModificationBy;
	}

	public void setNewLastModificationBy(int newLastModificationBy) {
		this.newLastModificationBy = newLastModificationBy;
	}

	public String getNewLastModificationDate() {
		return this.newLastModificationDate;
	}

	public void setNewLastModificationDate(String newLastModificationDate) {
		this.newLastModificationDate = newLastModificationDate;
	}

	public String getNewModificationReason() {
		return this.newModificationReason;
	}

	public void setNewModificationReason(String newModificationReason) {
		this.newModificationReason = newModificationReason;
	}

	public String getNewStepDate() {
		return this.newStepDate;
	}

	public void setNewStepDate(String newStepDate) {
		this.newStepDate = newStepDate;
	}

	public String getNewStepDescription() {
		return this.newStepDescription;
	}

	public void setNewStepDescription(String newStepDescription) {
		this.newStepDescription = newStepDescription;
	}

	public String getNewStepSpeciality() {
		return this.newStepSpeciality;
	}

	public void setNewStepSpeciality(String newStepSpeciality) {
		this.newStepSpeciality = newStepSpeciality;
	}

	public int getNewTreatmentId() {
		return this.newTreatmentId;
	}

	public void setNewTreatmentId(int newTreatmentId) {
		this.newTreatmentId = newTreatmentId;
	}

	public boolean getNewValidation() {
		return this.newValidation;
	}

	public void setNewValidation(boolean newValidation) {
		this.newValidation = newValidation;
	}

	public int getStepId() {
		return this.stepId;
	}

	public void setStepId(int stepId) {
		this.stepId = stepId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}