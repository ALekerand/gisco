package com.artm.managedBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.artm.hibernate.beans.Concours;
import com.artm.hibernate.beans.Ecole;
import com.artm.objetService.IService;
import com.artm.requetes.ReqConcours;

@Component
@Scope("session")
public class ManageConcours implements Serializable {
	// Injection de Spring
	@Autowired
	IService service;
	@Autowired
	ReqConcours reqConcours;
	
	private Concours monConcours = new Concours();
	private Ecole selectedEcole = new Ecole();
	private List listeConcours = new ArrayList<>();
	
	private List maListeConcoursEcole;

	public void enregistrerConcours(){
		monConcours.setAbrevEcoleConcours(getSelectedEcole().getAbrevEcole());
		monConcours.setLibConcours("Concours "+selectedEcole.getAbrevEcole());
		getService().saveObject(monConcours);
		FacesContext.getCurrentInstance().addMessage(null,  new FacesMessage(FacesMessage.SEVERITY_INFO,"Enregistrement","Enregistrement effectué"));	
		annulerSaisie();
	}
	public void viderConcours(Concours monObjet){
		monObjet.setAbrevEcoleConcours("");
		monObjet.setLibConcours("");
		monObjet.setAbrevObtentionDiplome("");
		monObjet.setObtentionDiplome("");
		monObjet.setLibEcoleConcours("");
		setSelectedEcole(null);
		
	}
	
	public void annulerSaisie(){
		viderConcours(monConcours);
		
	}
	
	/*public List<Concours> chargerListeconcours(){
		setListeConcours(getService().getObjects("Concours"));
		return listeConcours;
		
	}*/
	
	/*public List chargerListeConcoursEcole(){
		maListeConcoursEcole= new ArrayList<>();
		maRequetConcours=new ReqConcours();
		maListeConcoursEcole = maRequetConcours.recupererListeConcoursEcole(getSelectedEcole().getAbrevEcole());
		monConcoursModel = (ConcoursModel) maRequetConcours.recupererListeConcoursEcole(getSelectedEcole().getAbrevEcole());
		
		return null;
		
	}*/
	
	public void afficherLibEcole(){
		monConcours.setLibEcoleConcours(getSelectedEcole().getNomEcole());
		monConcours.setLibConcours("Concours d'entrée à l'"+getSelectedEcole().getNomEcole());
		
		listeConcours.clear();
		setListeConcours(reqConcours.recupererListeConcoursEcole(selectedEcole.getAbrevEcole()));
	//	setListeConcours(reqConcours.recupererListeConcoursEcole(selectedEcole.getAbrevEcole()));


	}
	

	//********************Accesseurs*********//

	public Concours getMonConcours() {
		return monConcours;
	}


	public void setMonConcours(Concours monConcours) {
		this.monConcours = monConcours;
	}
	
	public Ecole getSelectedEcole() {
		return selectedEcole;
	}
	public void setSelectedEcole(Ecole selectedEcole) {
		this.selectedEcole = selectedEcole;
	}
	/*public List getListeConcours() {
		//	setListeConcours(getService().getObjects("Concours"));
		return listeConcours = getService().getObjects("Concours");
		
	}
	public void setListeConcours(List listeConcours) {
		this.listeConcours = listeConcours;
	}*/
	
	
	public List getMaListeConcoursEcole() {
		return maListeConcoursEcole;
	}
	public void setMaListeConcoursEcole(List maListeConcoursEcole) {
		this.maListeConcoursEcole = maListeConcoursEcole;
	}
	public IService getService() {
		return service;
	}
	public void setService(IService service) {
		this.service = service;
	}
	
	public List getListeConcours() {
		return listeConcours;
	}
	public void setListeConcours(List listeConcours) {
		this.listeConcours = listeConcours;
	}
	public ReqConcours getReqConcours() {
		return reqConcours;
	}
	public void setReqConcours(ReqConcours reqConcours) {
		this.reqConcours = reqConcours;
	}
	
	

}
