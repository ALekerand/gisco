/**
 * 
 */
package com.artm.managedBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;
import org.primefaces.component.commandbutton.CommandButton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.artm.hibernate.beans.Ecole;
import com.artm.hibernate.beans.Filieres;
import com.artm.objetService.IService;
import com.artm.requetes.ReqFiliere;

/**
 * @author NGORAN
 *
 */
@Component
@Scope("session")
public class ManageFiliere implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private static  Logger logger=Logger.getLogger(ManageFiliere.class);
	
	//Injection de Spring
	@Autowired
	IService service;
	@Autowired
	ReqFiliere reqFiliere;
	
	private Ecole selectedEcole = new Ecole();
	private Filieres maFiliere = new Filieres();
	private List listeFiliere = new ArrayList<>();
	private List filiereList = new ArrayList<>();
	private Filieres selectedFiliere;
	
	private CommandButton engButton;
	private CommandButton modifButton;
	private CommandButton supButton;
	
	public void enregistrerFiliere(){
		try {
		maFiliere.setCodeEcole(getSelectedEcole());
		maFiliere.setAbrevFiliere(maFiliere.getAbrevFiliere().toUpperCase());
		getService().saveObject(maFiliere);
		viderFiliere(maFiliere);
		FacesContext.getCurrentInstance().addMessage(null,  new FacesMessage(FacesMessage.SEVERITY_INFO,"Enregistrement","Enregistrement effectué"));
		} catch (Exception e) {
			logger.error("Une erreur s'est produite lors de l'enregistrement de la Filière",e);
		}
		
	}
	
	public void viderFiliere(Filieres monObjet){
		monObjet.setNomFiliere("");
		monObjet.setAbrevFiliere("");
		
	}
	
	public void annulerAction(){
		viderFiliere(maFiliere);
		engButton.setDisabled(false);
		modifButton.setDisabled(true);
		supButton.setDisabled(true);
		listeFiliere.clear();
	
	}
	
	public void afficherFiliereEcole() {
		listeFiliere.clear();
		setListeFiliere(reqFiliere.recuperFiliereEcole(selectedEcole.getId()));
			
	}
	
	public void afficherSelection() {
		maFiliere = selectedFiliere;
		engButton.setDisabled(true);
		modifButton.setDisabled(false);
		supButton.setDisabled(false);
		
	}
	public void modifierFiliere(){
		getService().updateObject(maFiliere);
		FacesContext.getCurrentInstance().addMessage(null,  new FacesMessage(FacesMessage.SEVERITY_INFO,"Modification","Opération effectuée avec succès"));
		viderFiliere(maFiliere);
	}
	
	
	// getters and Setters

	public Ecole getSelectedEcole() {
		return selectedEcole;
	}

	public void setSelectedEcole(Ecole selectedEcole) {
		this.selectedEcole = selectedEcole;
	}


	public Filieres getMaFiliere() {
		return maFiliere;
	}


	public void setMaFiliere(Filieres maFiliere) {
		this.maFiliere = maFiliere;
	}


	public IService getService() {
		return service;
	}


	public void setService(IService service) {
		this.service = service;
	}

	public ReqFiliere getReqFiliere() {
		return reqFiliere;
	}

	public void setReqFiliere(ReqFiliere reqFiliere) {
		this.reqFiliere = reqFiliere;
	}

	public List getListeFiliere() {
		return listeFiliere;
	}

	public void setListeFiliere(List listeFiliere) {
		this.listeFiliere = listeFiliere;
	}

	public List getFiliereList() {
		filiereList = getService().getojects("Filieres");
		return filiereList;
	}

	public void setFiliereList(List filiereList) {
		this.filiereList = filiereList;
	}

	public Filieres getSelectedFiliere() {
		return selectedFiliere;
	}

	public void setSelectedFiliere(Filieres selectedFiliere) {
		this.selectedFiliere = selectedFiliere;
	}

	public CommandButton getEngButton() {
		return engButton;
	}

	public void setEngButton(CommandButton engButton) {
		this.engButton = engButton;
	}

	public CommandButton getModifButton() {
		return modifButton;
	}

	public void setModifButton(CommandButton modifButton) {
		this.modifButton = modifButton;
	}

	public CommandButton getSupButton() {
		return supButton;
	}

	public void setSupButton(CommandButton supButton) {
		this.supButton = supButton;
	}
	

}
