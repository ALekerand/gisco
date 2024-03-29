package com.artm.managedBeans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.artm.hibernate.beans.Annees;
import com.artm.hibernate.beans.Ecole;
import com.artm.hibernate.beans.Etudiants;
import com.artm.hibernate.beans.Nationalites;
import com.artm.hibernate.beans.Pays;
import com.artm.objetService.IService;
import com.artm.requetes.ReqAnneeScolaire;
import com.sun.org.apache.bcel.internal.generic.NEW;

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
	@Autowired
	ReqAnneeScolaire reqAnneeScolaire;
	
	
	private Annees monObjetAnnees = new Annees();
	//private ReqAnneeScolaire reqAnneeScolaire;
	private Etudiants monEtudiant = new Etudiants();
	private Pays selectedPays = new Pays();
	private Nationalites selectNationalites = new Nationalites();
	private Ecole selectedEcole =new Ecole();
	
	
	
	
	
	public void enregisterInscription(){
		getService().saveObject(monEtudiant);
		FacesContext.getCurrentInstance().addMessage(null,  new FacesMessage(FacesMessage.SEVERITY_INFO,"Enregistrement","Enregistrement effectu� avec succ�s"));	
	}
	
	
	// ************************ Getters and Setters

	public Annees getMonObjetAnnees() {
	//	reqAnneeScolaire = new ReqAnneeScolaire();
		//setMonObjetAnnees(reqAnneeScolaire.recupererMaxAnneeScolaire().get(0));
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


	public Nationalites getSelectNationalites() {
		return selectNationalites;
	}


	public void setSelectNationalites(Nationalites selectNationalites) {
		this.selectNationalites = selectNationalites;
	}


	public Ecole getSelectedEcole() {
		return selectedEcole;
	}


	public void setSelectedEcole(Ecole selectedEcole) {
		this.selectedEcole = selectedEcole;
	}

}
