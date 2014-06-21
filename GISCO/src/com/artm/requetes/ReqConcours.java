package com.artm.requetes;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.artm.hibernate.beans.Concours;


public class ReqConcours implements Serializable{

	@Autowired
	SessionFactory sessionFactory;

	/**
	 * M�thode pour de recup�ration des concours selon le d�but de l'ann�e concours et le pays
	 * @param codePays
	 * @param anneeDebut
	 * @return Liste concours
	 */

	//Liste des concours par Pays
	@SuppressWarnings("unchecked")
	public List<Concours> recupererListeConcoursPays(int codePays, int anneeDebut){

		String query = "SELECT C.* FROM  concours C Join anneeconcours AC ON AC.CODE_CONCOURS= C.CODE_CONCOURS " +
				"WHERE AC.CODEPAYS='"+codePays+"' and AC.ANNEE_CONCOURS_DEBUT='"+anneeDebut+"'";
		List liste = getSessionFactory().getCurrentSession().createSQLQuery(query).addEntity(Concours.class).list();
		return liste;
	}


	/**
	 * M�thode pour de recup�ration des concours selon le lib�ll� l'ann�e concours et le pays
	 * @param codePays
	 * @param anneeDebut
	 * @return Liste concours
	 */

	public List<Concours> recupererListeConcoursPays(int codePays, String libAnneeConcours){

		String query = "SELECT C.* FROM  concours C Join anneeconcours AC ON AC.CODE_CONCOURS= C.CODE_CONCOURS " +
				"WHERE AC.CODEPAYS='"+codePays+"' and AC.LIB_ANNEE_CONCOURS='"+libAnneeConcours+"'";
		List liste = getSessionFactory().getCurrentSession().createSQLQuery(query).addEntity(Concours.class).list();			
		return liste;


	}


	public List<Concours> recupererListeConcoursEcole(String paramEcole){
		String query = "SELECT * FROM `concours` WHERE `ABREV_ECOLE_CONCOURS`='"+paramEcole+"'";
		List liste = getSessionFactory().getCurrentSession().createSQLQuery(query).addEntity(Concours.class).list();
		return liste;
	}


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
