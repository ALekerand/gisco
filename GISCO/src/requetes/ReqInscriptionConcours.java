package requetes;

import hibernate.beans.Inscriptionconcours;
import hibernate.util.HibernateUtil;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

public class ReqInscriptionConcours implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public List<Inscriptionconcours> recupererInscription(String numCandidat){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String query = "SELECT `inscriptionconcours`.* FROM inscriptionconcours WHERE (`inscriptionconcours`.`NUM_CANDIDAT`  ='"+numCandidat+"')";
		List<Inscriptionconcours> liste = session.createSQLQuery(query).addEntity(Inscriptionconcours.class).list();
		session.getTransaction().commit();
		return liste;
	
	}
}

