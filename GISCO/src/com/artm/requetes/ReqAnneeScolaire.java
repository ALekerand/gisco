package com.artm.requetes;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.artm.hibernate.beans.Anneeconcours;
import com.artm.hibernate.beans.Annees;

@Transactional
@Component
public class ReqAnneeScolaire{

	@Autowired
	SessionFactory sessionFactory;
	
	public Annees recupererMaxAnneeScolaire(){
		String b = "SELECT `annees`.* FROM annees ORDER BY `annees`.`CODE_ANNEES` DESC LIMIT 0 , 1";
		List liste = getSessionFactory().getCurrentSession().createSQLQuery(b).addEntity(Annees.class).list();
		return (Annees) liste.get(0);
	}
	
	public List<Anneeconcours> recupererDernierAnneeConcours(){
		String a = " SELECT `anneeconcours`. * FROM anneeconcours ORDER BY `anneeconcours`.`CODE_ANNEES_CONCOURS` DESC LIMIT 0 , 1";
		List liste = getSessionFactory().getCurrentSession().createSQLQuery(a).addEntity(Anneeconcours.class).list();
		return liste;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
