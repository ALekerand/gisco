package com.artm.managedBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.artm.dataModel.NationaliteModel;
import com.artm.hibernate.beans.Nationalites;
import com.artm.objetService.IService;

@Component
@Scope("session")
public class manageNationalite implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Injection de Spring
	@Autowired
	IService service;
	
	private Nationalites maNationalite=new Nationalites();
	private Nationalites resultatNationalite = new Nationalites();
	private List listeNationalite = new ArrayList<>();
	private NationaliteModel maNationaliteModel;
	private Nationalites selectedNationalite=new Nationalites();
	
	public void EnregistrerNationalite(){
		getService().saveObject(maNationalite);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Enregistrement","Opération effectuée avec succès"));
		annulerSaisie();
		
	}

	
	public List chargerToutNationalite(){
		setListeNationalite(getService().getObjects("Nationalites"));
		System.out.println(listeNationalite.size());
		
		return listeNationalite;
		
	}
	
	public void viderNationalite(Nationalites monObjet){
		monObjet.setLibnationalite("");
	}
	
	
	public void annulerSaisie(){
		viderNationalite(maNationalite);
		System.out.println("Anulation de saisie");
		
	}
	
	public void afficherSelectedNationalite(){
		setMaNationalite(selectedNationalite);
		System.out.println("Code selectioné"+selectedNationalite.getId());
		System.out.println("Libellé selectionné"+selectedNationalite.getLibnationalite());
	}
	
	public void supprimerNationalite(){
		System.out.println("Supression debut");
		getService().deleteObject(selectedNationalite);
		System.out.println("Supression fin");
		annulerSaisie();
		
	}
	
	//Getters & setters
	
	
	public Nationalites getMaNationalite() {
		return maNationalite;
	}

	public void setMaNationalite(Nationalites maNationalite) {
		this.maNationalite = maNationalite;
	}

	public Nationalites getResultatNationalite() {
		return resultatNationalite;
	}

	public void setResultatNationalite(Nationalites resultatNationalite) {
		this.resultatNationalite = resultatNationalite;
	}

	public List getListeNationalite() {
		return listeNationalite;
	}

	public void setListeNationalite(List listeNationalite) {
		this.listeNationalite = listeNationalite;
	}

	@SuppressWarnings("unchecked")
	public NationaliteModel getMaNationaliteModel() {
		System.out.println("Debut de methode");
		maNationaliteModel=new NationaliteModel(chargerToutNationalite());
		System.out.println("fin de methode");
		return maNationaliteModel;
	}

	public void setMaNationaliteModel(NationaliteModel maNationaliteModel) {
		this.maNationaliteModel = maNationaliteModel;
	}

	public Nationalites getSelectedNationalite() {
		return selectedNationalite;
	}

	public void setSelectedNationalite(Nationalites selectedNationalite) {
		this.selectedNationalite = selectedNationalite;
	}


	public IService getService() {
		return service;
	}


	public void setService(IService service) {
		this.service = service;
	}
	
	

}
