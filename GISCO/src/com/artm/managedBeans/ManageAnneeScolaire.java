package com.artm.managedBeans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

import com.artm.objetService.IService;
import com.artm.hibernate.beans.Annees;

@Component
@Scope("session")
public class ManageAnneeScolaire implements Serializable {

	private static  Logger logger=Logger.getLogger(ManageAnneeScolaire.class);
	/**
	 * 
	 */
	// injection de spring
		@Autowired
		IService service;
		
	private static final long serialVersionUID = 1L;
	private Annees monAnneeScolaire = new Annees();
	
	
	public String enregistrerAnneeScolaire(){
		try {
			getService().saveObject(monAnneeScolaire);
			System.out.println("enregistrement effectué");
		} catch (DataIntegrityViolationException e){
		
		
		FacesContext.getCurrentInstance().addMessage(null,  new FacesMessage(FacesMessage.SEVERITY_INFO,"Enregistrement","Enregistrement effectué"));	
		}
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
