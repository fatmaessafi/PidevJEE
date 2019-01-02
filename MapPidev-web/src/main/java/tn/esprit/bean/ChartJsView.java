package tn.esprit.bean;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.chart.PieChartModel;

import tn.esprit.service.StatService;

@ManagedBean
@ViewScoped
public class ChartJsView {
	@EJB
	StatService s;
	

	
	private PieChartModel pieModel2;

	@PostConstruct
	public void init() {
		createPieModels();
	}

	

	public PieChartModel getPieModel2() {
		return pieModel2;
	}

	private void createPieModels() {
		
		createPieModel2();
	}

	public void createPieModel2() {
		// pieModel2 = new PieChartModel();

		//int countActif = (int) s.CountEtatCompteMActif().intValue();
		//int CountSanc = (int) s.CountEtatCompteMSanctionne().intValue();
		int totale = 2;

		int pourcentageActif = (int) (50) / totale;
		int pourcentageSanc = (int) (50) / totale;

		pieModel2 = new PieChartModel();
		pieModel2.set("Actif " + pourcentageActif+ "%",pourcentageActif);
		pieModel2.set("SanctionnÃ© " + pourcentageSanc + "%", pourcentageSanc);

		pieModel2.setTitle("Etat Des rdv");
		pieModel2.setLegendPosition("w");

	}

	

	public String Redirectstat() {
		return "/Admin/Chart?faces-redirect=true";
	}

}
