package tn.esprit.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 * Session Bean implementation class StepSessionBean
 */
@Stateless
@LocalBean
public class StepSessionBean implements StepSessionBeanRemote, StepSessionBeanLocal {
	@PersistenceContext
	EntityManager em;

	/**
	 * Default constructor.
	 */
	public StepSessionBean() {
		// TODO Auto-generated constructor stub
	}

	// Stat
	public Long CountValidationTrue(int idTreatment) {
		System.out.println("Treatment number " + idTreatment);
		TypedQuery<Long> query = em.createQuery(
				"select count (*) from Step where Validation=true  AND TreatmentId=" + idTreatment, Long.class);
		return (Long) query.getSingleResult();

	}

	public Long CountValidationFalse(int idTreatment) {
		TypedQuery<Long> query = em.createQuery(
				"select count (*) from Step where Validation=false   AND TreatmentId=" + idTreatment, Long.class);
		return (Long) query.getSingleResult();
	}

	public Long CountAll(int idTreatment) {
		TypedQuery<Long> query = em.createQuery("select count (*) from Step where TreatmentId=" + idTreatment,
				Long.class);
		return (Long) query.getSingleResult();
	}

}
