package com.artm.managedBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.artm.dataModel.DiplomeModel;
import com.artm.hibernate.beans.Diplomes;
import com.artm.objetService.IService;

@Component
@Scope("session")

public class ManageDiplome implements Serializable {
	// Injection de Spring
	@Autowired
	IService service;
	
	private Diplomes monDiplome = new Diplomes();
	private List listeDiplome = new ArrayList<>();
	private DiplomeModel monDiplomeModel;
	private Diplomes selectedDiplome = new Diplomes();
	

	public void enregistrerDiplome(){
		getService().saveObject(monDiplome);
		FacesContext.getCurrentInstance().addMessage(null,  new FacesMessage(FacesMessage.SEVERITY_INFO,"Enregistrement","Enregistrement effectué"));
		annulerSaisie();
	}
	
	public void viderDiplome(Diplomes monObjet){
		monObjet.setLibDiplome("");
		monObjet.setAbrevDiplome("");			
	}
	
	public void annulerSaisie(){
		viderDiplome(monDiplome);
	}
	
	public List ChargerToutDiplime(){
		setListeDiplome(getService().getObjects("Diplomes"));
		return listeDiplome;
		
	}
	
	public void afficherSelectedDiplome(){
		setMonDiplome(selectedDiplome);
		
	}
	
	
	public void supprimerDiplome(){
		getService().deleteObject(selectedDiplome);
		annulerSaisie();
	}
	
	
	public void testMethod(){
		System.out.println("***************Test appélé*****************");
	}
	//getters and setters


	public Diplomes getMonDiplome() {
		return monDiplome;
	}


	public void setMonDiplome(Diplomes monDiplome) {
		this.monDiplome = monDiplome;
	}

	@SuppressWarnings("unchecked")
	public DiplomeModel getMonDiplomeModel() {
		monDiplomeModel=new DiplomeModel(ChargerToutDiplime());
		return monDiplomeModel;
	}

	public void setMonDiplomeModel(DiplomeModel monDiplomeModel) {
		this.monDiplomeModel = monDiplomeModel;
	}

	public Diplomes getSelectedDiplome() {
		return selectedDiplome;
	}

	public void setSelectedDiplome(Diplomes selectedDiplome) {
		this.selectedDiplome = selectedDiplome;
	}

	public List getListeDiplome() {
		return listeDiplome;
	}

	public void setListeDiplome(List listeDiplome) {
		this.listeDiplome = listeDiplome;
	}

	public IService getService() {
		return service;
	}

	public void setService(IService service) {
		this.service = service;
	}

}
