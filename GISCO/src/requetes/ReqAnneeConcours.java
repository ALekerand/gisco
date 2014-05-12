package requetes;

import hibernate.beans.Anneeconcours;
import hibernate.beans.Concours;
import hibernate.util.HibernateUtil;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

public class ReqAnneeConcours implements Serializable {

	public List<Anneeconcours> recupererListeAnneeConcours(int codePays, String libanneeconcours){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		//String query = "SELECT `anneeconcours`.* FROM anneeconcours WHERE ((`anneeconcours`.`CODEPAYS` ='"+codePays+"') AND (`anneeconcours`.`LIB_ANNEE_CONCOURS` ='"+libanneeconcours+"'";
		String a =     "SELECT `anneeconcours`.* FROM anneeconcours WHERE ((`anneeconcours`.`CODEPAYS` ='"+codePays+"') AND (`anneeconcours`.`LIB_ANNEE_CONCOURS` ='"+libanneeconcours+"'))";
		List liste = session.createSQLQuery(a).addEntity(Anneeconcours.class).list();
		session.getTransaction().commit();
		
		return liste;
		
		
	}

	public List<Anneeconcours> recupererDernierAnneeConcours(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String a = " SELECT `anneeconcours`. * FROM anneeconcours ORDER BY `anneeconcours`.`CODE_ANNEES_CONCOURS` DESC LIMIT 0 , 1";
		List liste = session.createSQLQuery(a).addEntity(Anneeconcours.class).list();
		session.getTransaction().commit();
		return liste;
	}
	
	
	public Anneeconcours recupAnneeConcoursParConcours(String codeAnneeConcour){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String queryString = "SELECT `anneeconcours`.* FROM anneeconcours WHERE (`anneeconcours`.`CODE_CONCOURS` ='"+codeAnneeConcour+"') ORDER BY `anneeconcours`.`CODE_CONCOURS` DESC LIMIT 0 , 1";
		//String a = " SELECT `anneeconcours`. * FROM anneeconcours ORDER BY `anneeconcours`.`CODE_ANNEES_CONCOURS` DESC LIMIT 0 , 1";
		Anneeconcours anneeconcours = (Anneeconcours) session.createSQLQuery(queryString).addEntity(Anneeconcours.class).uniqueResult();
		session.getTransaction().commit();
		return anneeconcours;
	}

	
}

