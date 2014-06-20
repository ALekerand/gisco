package com.artm.managedBeans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.artm.objetService.IService;
import com.artm.hibernate.beans.Annees;

@Component
@Scope("request")
public class ManageAnneeScolaire implements Serializable {

	/**
	 * 
	 */
	// injection de spring
		IService service;
		
	private static final long serialVersionUID = 1L;
	private Annees monAnneeScolaire = new Annees();
	
	
	public String enregistrerAnneeScolaire(){
		getService().saveObject(monAnneeScolaire);
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

	public Annees getMonAnneeScolaire() {
		return monAnneeScolaire;
	}



	public void setMonAnneeScolaire(Annees monAnneeScolaire) {
		this.monAnneeScolaire = monAnneeScolaire;
	}

	public IService getService() {
		return service;
	}

	public void setService(IService service) {
		this.service = service;
	}
	
}
