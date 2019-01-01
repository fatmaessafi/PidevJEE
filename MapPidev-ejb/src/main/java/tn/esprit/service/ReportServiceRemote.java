package tn.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.entities.Report;

@Remote
public interface ReportServiceRemote {
	public List<Report> getAllReports() ;
}
