package com.artm.requetes;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.artm.hibernate.beans.Filieres;

@Component
@Transactional
public class ReqFiliere {
	
@Autowired
private SessionFactory sessionFactory;

@SuppressWarnings("unchecked")
public List<Filieres> recuperFiliereEcole (int codeecole) throws HibernateException{
	String query = "SELECT `filieres`.*, `filieres`.`CODE_ECOLE`FROM filieres WHERE (`filieres`.`CODE_ECOLE` ='"+codeecole+"')"; 
	List<Filieres> liste = getSessionFactory().getCurrentSession().createSQLQuery(query).addEntity(Filieres.class).list();
	System.out.println("------Taille liste"+liste.size());
	return liste;
}	

public SessionFactory getSessionFactory() {
	return sessionFactory;
}

public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
}
}
