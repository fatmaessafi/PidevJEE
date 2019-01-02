package tn.esprit.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
@LocalBean
public class StatService implements StatServiceRemote,StatServiceLocal {
	@PersistenceContext
	EntityManager em;
	
	public StatService(){
		
	}

	public Long CountEtatCompteMActif() {
		TypedQuery<Long> query = em.createQuery("select count (*) from Users",
				Long.class);
		return (Long) query.getSingleResult();
		
	}
	
	public Long CountEtatCompteMSanctionne(){
		TypedQuery<Long> query = em.createQuery("select count (*) from Users where Discriminator=Patient",
				Long.class);
		return (Long) query.getSingleResult();
	}
	
	
	public Long CountEtatCompteM() {
		TypedQuery<Long> query = em.createQuery("select count (*) from Users where Discriminator=Doctor",Long.class);
		return (Long) query.getSingleResult();
		
	}

	
}
