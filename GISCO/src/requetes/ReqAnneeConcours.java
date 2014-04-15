package requetes;

import hibernate.beans.Anneeconcours;
import hibernate.beans.Concours;
import hibernate.util.HibernateUtil;

import java.util.List;

import org.hibernate.Session;

public class ReqAnneeConcours {

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

	
}

