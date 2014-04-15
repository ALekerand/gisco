package managedBeans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import hibernate.beans.Annees;
import dao.Crud;

public class ManageAnneeScolaire implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Crud monCrud = new Crud();
	private Annees monAnneeScolaire = new Annees();
	
	
	public String enregistrerAnneeScolaire(){
		getMonCrud().addObject(monAnneeScolaire);
		FacesContext.getCurrentInstance().addMessage(null,  new FacesMessage(FacesMessage.SEVERITY_INFO,"Enregistrement","Enregistrement effectué"));	
		annulerSaisie();
		return null;
		
	}
	
	public void afficherLibAnneeScolaire(){
		monAnneeScolaire.setAnneesFin(getMonAnneeScolaire().getAnneesDebut()+1);
		monAnneeScolaire.setLibAnneeScolaire(getMonAnneeScolaire().getAnneesDebut()+" / "+getMonAnneeScolaire().getAnneesFin());
		
	}
	
	public void viderAnneeScolaire(Annees monObjet){
		monObjet.setAnneesDebut(null);
		monObjet.setAnneesFin(null);
		monObjet.setLibAnneeScolaire("");
		monObjet.setDateCommission(null);
		monObjet.setSessionExamen("");
	}
	
	public void annulerSaisie(){
		viderAnneeScolaire(monAnneeScolaire);
	}
	
	
	public void test(){
		System.out.println("****************Serveur ok");
	}
	
	// ************ Getters and Setters *****************

	public Crud getMonCrud() {
		return monCrud;
	}

	public void setMonCrud(Crud monCrud) {
		this.monCrud = monCrud;
	}



	public Annees getMonAnneeScolaire() {
		return monAnneeScolaire;
	}



	public void setMonAnneeScolaire(Annees monAnneeScolaire) {
		this.monAnneeScolaire = monAnneeScolaire;
	}
	
}
