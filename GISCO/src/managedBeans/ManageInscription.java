package managedBeans;

import hibernate.beans.Annees;
import hibernate.beans.Etudiants;
import hibernate.beans.Pays;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import dao.Crud;

import requetes.ReqAnneeScolaire;

public class ManageInscription implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Crud monCrud = new Crud();
	private Annees monObjetAnnees = new Annees();
	private ReqAnneeScolaire reqAnneeScolaire;
	private Etudiants monEtudiant = new Etudiants();
	private Pays selectedPays = new Pays();
	
	
	
	
	
	public void enregisterInscription(){
		getMonCrud().addObject(monEtudiant);
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


	public Crud getMonCrud() {
		return monCrud;
	}


	public void setMonCrud(Crud monCrud) {
		this.monCrud = monCrud;
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

}
