package com.artm.managedBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.artm.dataModel.EcoleModel;
import com.artm.hibernate.beans.Ecole;
import com.artm.objetService.IService;

@Component
@Scope("session")

public class ManageEcole implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static  Logger logger=Logger.getLogger(ManageEcole.class);
	//Injection de Spring
	@Autowired
	IService service;
	
	private Ecole monEcole = new Ecole();
	private EcoleModel monEcoleModel;
	private Ecole selectedEcole = new Ecole();
	private List listeEcole = new ArrayList<>();
	

	public void enregistrerEcole(){
		try {
			monEcole.setAbrevEcole(monEcole.getAbrevEcole().toUpperCase());
			getService().saveObject(monEcole);
			FacesContext.getCurrentInstance().addMessage(null,  new FacesMessage(FacesMessage.SEVERITY_INFO,"Enregistrement","Enregistrement effectué"));
			annulerSaisie();
		} catch (Exception e) {
			logger.error("Une erreur s'est produite lors de l'enregistrement d'une Ecole",e);
		}
	}
	
	public void viderEcole(Ecole monObjet){
		monObjet.setNomEcole("");
		monObjet.setAbrevEcole("");
		
	}
	
	public void annulerSaisie(){
		viderEcole(monEcole);
		
	}
	
	public void modifierEcole(){
		getService().updateObject(monEcole);
		FacesContext.getCurrentInstance().addMessage(null,  new FacesMessage(FacesMessage.SEVERITY_INFO,"Modification","Opération effectuée avec succès"));
		annulerSaisie();
	}
	
	public void afficherSelectedEcole(){
		setMonEcole(selectedEcole);
	}
	
	public List chargerToutEcole(){
		setListeEcole(getService().getObjects("Ecole"));
		return listeEcole;
		
	}
	
	public void supprimerEcole(){
		getService().deleteObject(selectedEcole);
		annulerSaisie();
	}

	// getters and Setters
	
	public Ecole getMonEcole() {
		return monEcole;
	}

	public void setMonEcole(Ecole monEcole) {
		this.monEcole = monEcole;
	}

	public Ecole getSelectedEcole() {
		return selectedEcole;
	}

	public void setSelectedEcole(Ecole selectedEcole) {
		this.selectedEcole = selectedEcole;
	}

	public List getListeEcole() {
		return listeEcole;
	}

	public void setListeEcole(List listeEcole) {
		this.listeEcole = listeEcole;
	}

	@SuppressWarnings("unchecked")
	public EcoleModel getMonEcoleModel() {
		monEcoleModel = new EcoleModel(chargerToutEcole());
		return monEcoleModel;
	}

	public void setMonEcoleModel(EcoleModel monEcoleModel) {
		this.monEcoleModel = monEcoleModel;
	}

	public IService getService() {
		return service;
	}

	public void setService(IService service) {
		this.service = service;
	}

}
