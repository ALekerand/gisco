package com.artm.requetes;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

import com.artm.hibernate.beans.Concours;
import com.artm.hibernate.util.HibernateUtil;

public class ReqConcours implements Serializable{

	public ReqConcours() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Méthode pour de recupération des concours selon le debut de l'année concours et le pays
	 * @param codePays
	 * @param anneeDebut
	 * @return Liste concours
	 */
		
	//Liste des concours par Pays
	public List<Concours> recupererListeConcoursPays(int codePays, int anneeDebut){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String query = "SELECT C.* FROM  concours C Join anneeconcours AC ON AC.CODE_CONCOURS= C.CODE_CONCOURS " +
				"WHERE AC.CODEPAYS='"+codePays+"' and AC.ANNEE_CONCOURS_DEBUT='"+anneeDebut+"'";
		List liste = session.createSQLQuery(query).addEntity(Concours.class).list();
		session.getTransaction().commit();
		
		return liste;
	}
		
		
		/**
		 * Méthode pour de recupération des concours selon le libéllé l'année concours et le pays
		 * @param codePays
		 * @param anneeDebut
		 * @return Liste concours
		 */
			
		//Liste des concours par Pays
		public List<Concours> recupererListeConcoursPays(int codePays, String libAnneeConcours){
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			String query = "SELECT C.* FROM  concours C Join anneeconcours AC ON AC.CODE_CONCOURS= C.CODE_CONCOURS " +
					"WHERE AC.CODEPAYS='"+codePays+"' and AC.LIB_ANNEE_CONCOURS='"+libAnneeConcours+"'";
			List liste = session.createSQLQuery(query).addEntity(Concours.class).list();
			session.getTransaction().commit();
			
			return liste;
		
		
	}
	/*
	 * 
	 */
	//Liste des Concours par Ecole
	public List<Concours> recupererListeConcoursEcole(String paramEcole){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String query = "SELECT * FROM `concours` WHERE `ABREV_ECOLE_CONCOURS`='"+paramEcole+"'";
		List liste = session.createSQLQuery(query).addEntity(Concours.class).list();
		session.getTransaction().commit();
		return liste;
		
	}
	

	
}
