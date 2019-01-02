package tn.esprit.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import tn.esprit.entities.*;

/**
 * Session Bean implementation class TreatmentSessionBean
 */
@Stateless
@LocalBean
public class TreatmentSessionBean implements TreatmentSessionBeanRemote, TreatmentSessionBeanLocal {

	@PersistenceContext
	EntityManager em;
    /**
     * Default constructor. 
     */
    public TreatmentSessionBean() {
        // TODO Auto-generated constructor stub
    }
	@Override
	public List<Treatment> getTreatments() {
		Query jpql = em.createQuery("select a from Treatment a");
		return jpql.getResultList();
		
	}
	
	//Stat
	public Long CountValidationTrue(int idPatient) {
		TypedQuery<Long> query = em.createQuery("select count (*) from Treatment where Validation=true AND PatientId="+idPatient,
				Long.class);
		return (Long) query.getSingleResult();
		
	}
	
	public Long CountValidationFalse(int idPatient){
		TypedQuery<Long> query = em.createQuery("select count (*) from Treatment where Validation=false  AND PatientId="+idPatient,
				Long.class);
		return (Long) query.getSingleResult();
	}
	
	public Long CountAll(int idPatient){
		TypedQuery<Long> query = em.createQuery("select count (*) from Treatment where PatientId="+idPatient,
				Long.class);
		return (Long) query.getSingleResult();
	}
	
	
	
	
	
	
    
}
