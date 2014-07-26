package com.artm.managedBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

import com.artm.dataModel.PaysModel;
import com.artm.hibernate.beans.Pays;
import com.artm.objetService.IService;


@Component
@Scope("session")
public class ManagePays implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static  Logger logger=Logger.getLogger(ManagePays.class);
	
	// Injection de Spring
	@Autowired
	IService service;
	
	private Pays monPays= new Pays();
	private Pays resultatPays =new Pays();
	private List listePays= new ArrayList<>();
	private PaysModel monPaysModel;
	private Pays selectedPays=new Pays();
	
	
	
	public void enregistrerPays(){
		monPays.setAbrevpays(monPays.getAbrevpays().toUpperCase());
		getService().saveObject(monPays);
		FacesContext.getCurrentInstance().addMessage(null,  new FacesMessage(FacesMessage.SEVERITY_INFO,"Enregistrement","Enregistrement effectué"));
		viderPays(monPays);
		
		
	}

	public void rechercherPay(){
		resultatPays=(Pays) getService().getObject(1, "Pays");
		
		System.out.println(resultatPays.getLibpays());
	}
	
	public List chargerToutPays(){
		setListePays(getService().getObjects("Pays"));
		
		return listePays;
		
	}
	
	public void supprimerPays(){
		
		try {
			getService().deleteObject(selectedPays);
			System.out.println("Suppression effectuée");
		} catch (DataIntegrityViolationException e) {
			FacesContext.getCurrentInstance().addMessage(null,  new FacesMessage(FacesMessage.SEVERITY_WARN,"SUPPRESSION","Suppression impossible pour ce pays!"));
		}
		annulerSaisie();
	}
	
	
	public void verifier(){
		System.out.println("Objet senectionné: "+getSelectedPays().getLibpays());
	}
	
	public void viderPays(Pays nomObjet){
		nomObjet.setLibpays("");
		nomObjet.setRepublic("");
		nomObjet.setAbrevpays("");
	}
	
	public void annulerSaisie(){
		viderPays(monPays);
	}
	
	public void afficherSelectedPays(){
		/*monPays.setLibpays(selectedPays.getLibpays());
		monPays.setId(selectedPays.getId());
		monPays.setRepublic(selectedPays.getRepublic());
		monPays.setAbrevpays(selectedPays.getAbrevpays());
		System.out.println("Information passée à monPays");
		*/
		setMonPays(selectedPays);
	}
	// getters et setters
	
	public Pays getMonPays() {
		return monPays;
	}

	public void setMonPays(Pays monPays) {
		this.monPays = monPays;
	}

	public Pays getResultatPays() {
		return resultatPays;
	}

	public void setResultatPays(Pays resultatPays) {
		this.resultatPays = resultatPays;
	}

	public List getListePays() {
		return listePays;
	}

	public void setListePays(List listePays) {
		this.listePays = listePays;
	}

	@SuppressWarnings("unchecked")
	public PaysModel getMonPaysModel() {
		monPaysModel=new PaysModel(chargerToutPays());
		return monPaysModel;
	}

	public void setMonPaysModel(PaysModel monPaysModel) {
		this.monPaysModel = monPaysModel;
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
