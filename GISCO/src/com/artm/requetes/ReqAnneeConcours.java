package com.artm.requetes;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.artm.hibernate.beans.Anneeconcours;

@Transactional
@Component
public class ReqAnneeConcours {
	
	@Autowired
	SessionFactory sessionFactory;

	public List<Anneeconcours> recupererListeAnneeConcours(int codePays, String libanneeconcours){
		//String query = "SELECT `anneeconcours`.* FROM anneeconcours WHERE ((`anneeconcours`.`CODEPAYS` ='"+codePays+"') AND (`anneeconcours`.`LIB_ANNEE_CONCOURS` ='"+libanneeconcours+"'";
		String a =     "SELECT `anneeconcours`.* FROM anneeconcours WHERE ((`anneeconcours`.`CODEPAYS` ='"+codePays+"') AND (`anneeconcours`.`LIB_ANNEE_CONCOURS` ='"+libanneeconcours+"'))";
		List liste = getSessionFactory().getCurrentSession().createSQLQuery(a).addEntity(Anneeconcours.class).list();		
		return liste;
		
		
	}

	public List<Anneeconcours> recupererDernierAnneeConcours(){
		String a = " SELECT `anneeconcours`. * FROM anneeconcours ORDER BY `anneeconcours`.`CODE_ANNEES_CONCOURS` DESC LIMIT 0 , 1";
		List liste = getSessionFactory().getCurrentSession().createSQLQuery(a).addEntity(Anneeconcours.class).list();
		return liste;
	}
	
	
	public Anneeconcours recupAnneeConcoursParConcours(String codeAnneeConcour){
		String queryString = "SELECT `anneeconcours`.* FROM anneeconcours WHERE (`anneeconcours`.`CODE_CONCOURS` ='"+codeAnneeConcour+"') ORDER BY `anneeconcours`.`CODE_CONCOURS` DESC LIMIT 0 , 1";
		//String a = " SELECT `anneeconcours`. * FROM anneeconcours ORDER BY `anneeconcours`.`CODE_ANNEES_CONCOURS` DESC LIMIT 0 , 1";
		Anneeconcours anneeconcours = (Anneeconcours) getSessionFactory().getCurrentSession().createSQLQuery(queryString).addEntity(Anneeconcours.class).uniqueResult();
		return anneeconcours;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
}

