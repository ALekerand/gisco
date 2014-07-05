package com.artm.requetes;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.artm.hibernate.beans.Annees;

@Transactional
@Component
public class ReqAnneeScolaire{

	@Autowired
	SessionFactory sessionFactory;
	
	public Annees recupererMaxAnneeScolaire(){
	//String a = " SELECT `annees`.`CODE_ANNEES`, `annees`.`LIB_ANNEE_SCOLAIRE`FROM annees ORDER BY `annees`.`CODE_ANNEES` DESC";
	//	String a = "SELECT `annees`.*, `annees`.`LIB_ANNEE_SCOLAIRE`FROM annees ORDER BY `annees`.`CODE_ANNEES` DESC";
		String a =" SELECT `annees`. * FROM annees ORDER BY `annees`.`CODE_ANNEES` DESC LIMIT 0 , 1";
		List liste = getSessionFactory().getCurrentSession().createSQLQuery(a).addEntity(Annees.class).list();
		return (Annees) liste.get(0);
		
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
