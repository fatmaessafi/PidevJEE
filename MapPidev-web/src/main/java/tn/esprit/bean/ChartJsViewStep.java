package tn.esprit.bean;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.chart.PieChartModel;

import tn.esprit.service.StepSessionBean;
import tn.esprit.service.TreatmentSessionBean;

@ManagedBean
@ViewScoped
public class ChartJsViewStep {

	@EJB
	StepSessionBean s;

	public int getPourcentageValid(int idTreatment) {
		// pieModel2 = new PieChartModel();
		int countValidationTrue = s.CountValidationTrue( idTreatment).intValue();

		int totale = (int) s.CountAll( idTreatment).intValue();

		int pourcentageTrue = (int) (countValidationTrue * 100) / totale;

		System.out.println("True=" + pourcentageTrue);

		return countValidationTrue;

	}

	public int getPourcentageNotValid( int idTreatment) {

		// pieModel2 = new PieChartModel();
		int countValidationFalse = s.CountValidationFalse( idTreatment).intValue();

		int totale = (int) s.CountAll(idTreatment).intValue();

		int pourcentageFalse = (int) (countValidationFalse * 100) / totale;
		System.out.println("False=" + pourcentageFalse);

		return countValidationFalse;

	}

	public String Redirectstat() {
		return "PieTreatment?faces-redirect=true";
	}

}
