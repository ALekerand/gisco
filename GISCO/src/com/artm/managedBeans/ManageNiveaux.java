package com.artm.managedBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.artm.hibernate.beans.Niveaux;
import com.artm.objetService.IService;

@Component
@Scope("session")
public class ManageNiveaux implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Injection de Spring
	@Autowired
	IService service;
	
	private Niveaux monNiveau = new Niveaux();
	private List<Object> listeNiveau = new ArrayList<>();
	private Niveaux selectedNiveau = new Niveaux();
	

	public void enregistrerNiveaux() {
		monNiveau.setAbrevNiveau(monNiveau.getAbrevNiveau().toUpperCase());
		getService().saveObject(monNiveau);
		annulerSaisie();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Enregistrement","Enregistrement effectué avec succès"));

	}
	
	public void viderNiveau(Niveaux monObjet){
		monObjet.setLibNiveau("");
		monObjet.setAbrevNiveau("");
		
	}
	
	public void annulerSaisie(){
		viderNiveau(monNiveau);
	}
	
	@SuppressWarnings({"unchecked" })
	public List<Object> afficherToutNiveau(){
		setListeNiveau(getService().getObjects("Niveaux"));
		return listeNiveau;
		
		
	}
	
	public void afficherSelectedNiveau(){
		setMonNiveau(selectedNiveau);
		
	}
	
	// ************************* Getters and Setters ***********************


	public Niveaux getMonNiveau() {
		return monNiveau;
	}

	public void setMonNiveau(Niveaux monNiveau) {
		this.monNiveau = monNiveau;
	}

	@SuppressWarnings("unchecked")
	public List<Object> getListeNiveau() {
		return listeNiveau = getService().getObjects("Niveaux");
	}

	public void setListeNiveau(List<Object> listeNiveau) {
		this.listeNiveau = listeNiveau;
	}

	public Niveaux getSelectedNiveau() {
		return selectedNiveau;
	}

	public void setSelectedNiveau(Niveaux selectedNiveau) {
		this.selectedNiveau = selectedNiveau;
	}

	public IService getService() {
		return service;
	}

	public void setService(IService service) {
		this.service = service;
	}
	
	

}
