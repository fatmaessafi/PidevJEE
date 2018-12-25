package tn.esprit.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DayOffs database table.
 * 
 */
@Entity
@Table(name="DayOffs")
@NamedQuery(name="DayOff.findAll", query="SELECT d FROM DayOff d")
public class DayOff implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DayOffId")
	private int dayOffId;

	@Column(name="DayOffDate")
	private String dayOffDate;

	@Column(name="EndHour")
	private int endHour;

	@Column(name="StartHour")
	private int startHour;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="DoctorId")
	private User user;

	public DayOff() {
	}

	public int getDayOffId() {
		return this.dayOffId;
	}

	public void setDayOffId(int dayOffId) {
		this.dayOffId = dayOffId;
	}

	public String getDayOffDate() {
		return this.dayOffDate;
	}

	public void setDayOffDate(String dayOffDate) {
		this.dayOffDate = dayOffDate;
	}

	public int getEndHour() {
		return this.endHour;
	}

	public void setEndHour(int endHour) {
		this.endHour = endHour;
	}

	public int getStartHour() {
		return this.startHour;
	}

	public void setStartHour(int startHour) {
		this.startHour = startHour;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}