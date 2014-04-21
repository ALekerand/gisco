package requetes;

import hibernate.beans.Annees;
import hibernate.util.HibernateUtil;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

public class ReqAnneeScolaire implements Serializable{

	public Annees recupererMaxAnneeScolaire(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		//String a = " SELECT `annees`.`CODE_ANNEES`, `annees`.`LIB_ANNEE_SCOLAIRE`FROM annees ORDER BY `annees`.`CODE_ANNEES` DESC";
	//	String a = "SELECT `annees`.*, `annees`.`LIB_ANNEE_SCOLAIRE`FROM annees ORDER BY `annees`.`CODE_ANNEES` DESC";
		String a =" SELECT `annees`. * FROM annees ORDER BY `annees`.`CODE_ANNEES` DESC LIMIT 0 , 1";
		List liste = session.createSQLQuery(a).addEntity(Annees.class).list();
		session.getTransaction().commit();
		return (Annees) liste.get(0);
		
	}

}