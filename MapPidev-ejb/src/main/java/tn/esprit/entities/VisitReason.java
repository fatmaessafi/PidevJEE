package tn.esprit.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the VisitReasons database table.
 * 
 */
@Entity
@Table(name="VisitReasons")
@NamedQuery(name="VisitReason.findAll", query="SELECT v FROM VisitReason v")
public class VisitReason implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int VRId;

	private String VRDescription;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="DoctorId")
	private User user;

	public VisitReason() {
	}

	public int getVRId() {
		return this.VRId;
	}

	public void setVRId(int VRId) {
		this.VRId = VRId;
	}

	public String getVRDescription() {
		return this.VRDescription;
	}

	public void setVRDescription(String VRDescription) {
		this.VRDescription = VRDescription;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}