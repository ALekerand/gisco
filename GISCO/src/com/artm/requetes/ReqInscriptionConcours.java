package com.artm.requetes;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.artm.hibernate.beans.Inscriptionconcours;

@Transactional
@Component
public class ReqInscriptionConcours implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Injection spring
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Inscriptionconcours> recupererInscription(String numCandidat) throws HibernateException{
		String query =  "SELECT `inscriptionconcours`.* FROM inscriptionconcours WHERE ((`inscriptionconcours`.`NUM_CANDIDAT` ='"+numCandidat+"') AND (`inscriptionconcours`.`SOLDE` ='0'))";
		List<Inscriptionconcours> liste = getSessionFactory().getCurrentSession().createSQLQuery(query).addEntity(Inscriptionconcours.class).list();
		return liste;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}

