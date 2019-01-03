package tn.esprit.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * The persistent class for the Analytics database table.
 * 
 */
@Entity
@Table(name="Analytics")
@NamedQuery(name="Analytic.findAll", query="SELECT a FROM Analytic a")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Analytic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="StatId")
	private int statId;

	@Column(name="CancelingRate")
	private float cancelingRate;

	@Column(name="NbPatients")
	private int nbPatients;

	@Column(name="StatDate")
	private String statDate;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="DoctorId")
	private User user;

	public Analytic() {
	}

	public int getStatId() {
		return this.statId;
	}

	public void setStatId(int statId) {
		this.statId = statId;
	}

	public float getCancelingRate() {
		return this.cancelingRate;
	}

	public void setCancelingRate(float cancelingRate) {
		this.cancelingRate = cancelingRate;
	}

	public int getNbPatients() {
		return this.nbPatients;
	}

	public void setNbPatients(int nbPatients) {
		this.nbPatients = nbPatients;
	}

	public String getStatDate() {
		return this.statDate;
	}

	public void setStatDate(String statDate) {
		this.statDate = statDate;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}