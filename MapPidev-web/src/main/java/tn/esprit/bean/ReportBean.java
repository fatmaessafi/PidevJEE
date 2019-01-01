package tn.esprit.bean;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import tn.esprit.entities.Report;
import tn.esprit.entities.User;
import tn.esprit.service.ReportServiceLocal;

@ManagedBean
@javax.faces.bean.SessionScoped
public class ReportBean {
	@EJB
	ReportServiceLocal reportServiceLocal ;

	List<Report> listReports = new ArrayList<>();
	private int ReportId ;
	private String ReportDate ;
	private String ReportDescription ;
	private String ReportImage ;
	private String ReportTitle ;
	
	
	public String getReportTitle() {
		return ReportTitle;
	}
	public void setReportTitle(String reportTitle) {
		ReportTitle = reportTitle;
	}
	public int getReportId() {
		return ReportId;
	}
	public List<Report> getListReports() {
		return listReports;
	}
	public void setListReports(List<Report> listReports) {
		this.listReports = listReports;
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
	public String getReportImage() {
		return ReportImage;
	}
	public void setReportImage(String reportImage) {
		ReportImage = reportImage;
	}
	

	public List<Report>  GetAllReports() throws ParseException
	{
		listReports = reportServiceLocal.getAllReports() ;
		for( Report u :  listReports)
		{
			
			System.out.println(u.getReportDescription());
		}
		return listReports;
	}
}
