package com.artm.requetes;

import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.artm.hibernate.beans.Users;

@Component
@Transactional
public class RequeteUtilisateur {
	private static Logger logger = Logger.getLogger(RequeteUtilisateur.class);
	@Autowired
	private SessionFactory sessionFactory;
	private Users currentUser;
	

	/**
	 * Méthode pour l'utilisateur de la session
	 * @return utilisateur
	 * @throws HibernateException
	 */
	public Users RecupererUtilisateurCourrant() throws HibernateException{
		//Recupération du login de l'utilisateur courant
			String paramLogin = FacesContext.getCurrentInstance().getExternalContext().getUserPrincipal().getName();
			System.out.println("-----Username: "+paramLogin);
			String query ="SELECT * FROM `users` WHERE `USER_NAME`='"+paramLogin+"'";
			currentUser = new Users();
			currentUser = (Users) getSessionFactory().getCurrentSession().createSQLQuery(query).addEntity(Users.class).uniqueResult();
			//logger.error(" Erreur sur la recupération de l'utilisateur");
		return currentUser;
	}
	
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Users getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(Users currentUser) {
		this.currentUser = currentUser;
	}

}
