package tn.esprit.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Reports database table.
 * 
 */
@Entity
@Table(name="Reports")
@NamedQuery(name="Report.findAll", query="SELECT r FROM Report r")
public class Report implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ReportId")
	private int ReportId;

	@Column(name="ReportDate")
	private String ReportDate;

	public int getReportId() {
		return ReportId;
	}


	public void setReportId(int reportId) {
		ReportId = reportId;
	}


	public String getReportDate() {
		return ReportDate;
	}


	public void setReportDate(String reportDate) {
		ReportDate = reportDate;
	}


	public String getReportDescription() {
		return ReportDescription;
	}


	public void setReportDescription(String reportDescription) {
		ReportDescription = reportDescription;
	}

	@Column(name="ReportDescription")
	private String ReportDescription;

	//bi-directional one-to-one association to Appointment
	@OneToOne
	@JoinColumn(name="ReportId")
	private Appointment appointment;

	public Report() {
	}


	public Appointment getAppointment() {
		return this.appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

}