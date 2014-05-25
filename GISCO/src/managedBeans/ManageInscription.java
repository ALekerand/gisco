package managedBeans;

import hibernate.beans.Annees;
import hibernate.beans.Etudiants;
import hibernate.beans.Pays;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import objetService.IService;
import requetes.ReqAnneeScolaire;

@Component
@Scope("session")

public class ManageInscription implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Injection de Spring
	@Autowired
	IService service;
	
	private Annees monObjetAnnees = new Annees();
	private ReqAnneeScolaire reqAnneeScolaire;
	private Etudiants monEtudiant = new Etudiants();
	private Pays selectedPays = new Pays();
	
	
	
	
	
	public void enregisterInscription(){
		getService().saveObject(monEtudiant);
		FacesContext.getCurrentInstance().addMessage(null,  new FacesMessage(FacesMessage.SEVERITY_INFO,"Enregistrement","Enregistrement effectué avec succès"));	
		
	}
	
	
	// ************************ Getters and Setters

	public Annees getMonObjetAnnees() {
		reqAnneeScolaire = new ReqAnneeScolaire();
		// setMonObjetAnnees(reqAnneeScolaire.recupererMaxAnneeScolaire().get(0));
		setMonObjetAnnees((Annees) reqAnneeScolaire.recupererMaxAnneeScolaire());
		return monObjetAnnees;
	}

	public void setMonObjetAnnees(Annees monObjetAnnees) {
		this.monObjetAnnees = monObjetAnnees;
	}


	public ReqAnneeScolaire getReqAnneeScolaire() {
		return reqAnneeScolaire;
	}


	public void setReqAnneeScolaire(ReqAnneeScolaire reqAnneeScolaire) {
		this.reqAnneeScolaire = reqAnneeScolaire;
	}


	public Etudiants getMonEtudiant() {
		return monEtudiant;
	}


	public void setMonEtudiant(Etudiants monEtudiant) {
		this.monEtudiant = monEtudiant;
	}


	public Pays getSelectedPays() {
		return selectedPays;
	}


	public void setSelectedPays(Pays selectedPays) {
		this.selectedPays = selectedPays;
	}


	public IService getService() {
		return service;
	}


	public void setService(IService service) {
		this.service = service;
	}

}
