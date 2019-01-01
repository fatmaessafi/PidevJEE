package tn.esprit.service;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.entities.Report;

@Local
public interface ReportServiceLocal {
	public List<Report> getAllReports() ;

}
