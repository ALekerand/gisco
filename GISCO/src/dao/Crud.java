package dao;


import java.io.Serializable;
import java.util.List;

import hibernate.util.HibernateUtil;

import org.hibernate.Session;

public class Crud implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void addObject(Object objet){
		// Session session = HibernateUtil.getSessionFactory().openSession();
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(objet);
		session.getTransaction().commit();
		//session.close();
	}

	public Object getObject(int id, String objet){
		
		// Session session = HibernateUtil.getSessionFactory().openSession();
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String query= "from" +" "+ objet + " "+ " where id =?";
		List liste = session.createQuery(query).setParameter(0,id).list();
		if (liste.size()==0){
			return null;}
		session.getTransaction().commit();
		return (Object)liste.get(0);
	}
	
	public List getObjects(String objet){
		// Session session = HibernateUtil.getSessionFactory().openSession();
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String query= "from" +" "+ objet;
		List liste = session.createQuery(query).list();
		session.getTransaction().commit();
		return liste;
		
	}
	public void deleteObject(Object objet){
		// Session session = HibernateUtil.getSessionFactory().openSession();
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(objet);
		session.getTransaction().commit();
		// session.close();
		
	}
	
	public void updateObject(Object objet){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(objet);
		session.getTransaction().commit();
		//session.close();
	}

}
