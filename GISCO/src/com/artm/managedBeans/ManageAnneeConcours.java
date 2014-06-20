package com.artm. managedBeans;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.artm.hibernate.beans.Anneeconcours;
import com.artm.hibernate.beans.Concours;
import com.artm.hibernate.beans.Ecole;
import com.artm.hibernate.beans.Pays;
import com.artm.hybride.ConcoursAnneeConcours;
import com.artm.objetService.IService;
import com.artm.objetService.Service;
import com.artm.requetes.ReqAnneeConcours;
import com.artm.requetes.ReqConcours;
//import hibernate.beans.Anneeconcours;
//import hibernate.beans.Concours;
//import hibernate.beans.Ecole;
//import hibernate.beans.Pays;
//import hybride.ConcoursAnneeConcours;

@Component
@Scope("session")
public class ManageAnneeConcours implements Serializable {

	/**
	 * 
	 */
	//Injection par Spring
	IService  service;
	
	private static final long serialVersionUID = 1L;
	private Ecole selectedEcole = new Ecole();
	private Pays selectedPays = new Pays();
	private Anneeconcours monAnneeConcours = new Anneeconcours();
	private ReqConcours maRequeteConcours;
	private List maListeConcours;
	private Concours selectedConcours = new Concours();
	private List<ConcoursAnneeConcours> maListehybride = new ArrayList<>();
	
	
	public void EnregistrerAnneeConcours(){
		monAnneeConcours.setCodepays(getSelectedPays());
		monAnneeConcours.setCodeConcours(getSelectedConcours());
		getService().saveObject(monAnneeConcours);
		FacesContext.getCurrentInstance().addMessage(null,  new FacesMessage(FacesMessage.SEVERITY_INFO,"Enregistrement","Enregistrement effectu� avec succ�s"));
		//Charger la dataTable des objets hybrid
		chargerListeAnneeConcoursConcours();
		viderobjet(monAnneeConcours);
	}
	
	public List ChargerListeConcours(){
		maRequeteConcours = new ReqConcours();
		maListeConcours = new ArrayList<>();
		maListeConcours = maRequeteConcours.recupererListeConcoursEcole(getSelectedEcole().getAbrevEcole());
		System.out.println(selectedPays.getLibpays());//clean after
		System.out.println(selectedEcole.getAbrevEcole());//clean after
		//Charger la dataTable des objets hybrid
		chargerListeAnneeConcoursConcours();

		return maListeConcours;
	}
	
	public void viderAnneeConcours(Anneeconcours monObjet){
		monObjet.setAnneeConcoursDebut(null);
		monObjet.setAnneeConcoursFin(null);
		monObjet.setDateComposition(null);
		monObjet.setDroitConcours(null);
		monObjet.setNbreplacesConcours(null);
		monObjet.setLibAnneeConcours("");
		setSelectedPays(null);
		setSelectedEcole(null);
		setSelectedConcours(null);
		
		
	}
	
	public void afficherLibAnneeConcours(){
		System.out.println("*****************"+monAnneeConcours.getAnneeConcoursDebut());
		monAnneeConcours.setAnneeConcoursFin(getMonAnneeConcours().getAnneeConcoursDebut()+1);
		monAnneeConcours.setLibAnneeConcours(getMonAnneeConcours().getAnneeConcoursDebut()+" / "+getMonAnneeConcours().getAnneeConcoursFin());
	}
	
	public void annulerSaisie(){
		viderAnneeConcours(monAnneeConcours);
		chargerListeAnneeConcoursConcours();
	}
	
	public List chargerListeAnneeConcoursConcours(){
		
		maListehybride.clear();
		List<Anneeconcours> listeAnneeConcours = new ArrayList<>();
		ReqAnneeConcours reqAnneeConcours = new ReqAnneeConcours();
		listeAnneeConcours = reqAnneeConcours.recupererListeAnneeConcours(selectedPays.getId(), monAnneeConcours.getLibAnneeConcours());
		
		for(Anneeconcours obj:listeAnneeConcours){
			
			if(obj.getCodeConcours().getAbrevEcoleConcours().equals(selectedEcole.getAbrevEcole())){
				//Chargement obj hybrid
				ConcoursAnneeConcours concoursAnneeConcours = new ConcoursAnneeConcours();
				//Partie AnneeConcours
				concoursAnneeConcours.setIdAnneeConcours(obj.getId());
				concoursAnneeConcours.setAnneeConcoursDebut(obj.getAnneeConcoursDebut());
				concoursAnneeConcours.setAnneeConcoursFin(obj.getAnneeConcoursFin());
				concoursAnneeConcours.setLibAnneeConcours(obj.getLibAnneeConcours());
				concoursAnneeConcours.setDateComposition(obj.getDateComposition());
				concoursAnneeConcours.setDroitConcours(obj.getDroitConcours());
				concoursAnneeConcours.setNbreplacesConcours(obj.getNbreplacesConcours());
				concoursAnneeConcours.setCodepays(obj.getCodepays());
				concoursAnneeConcours.setCodeConcours(obj.getCodeConcours());
					//partie Concours
				concoursAnneeConcours.setAbrevEcoleConcours(obj.getCodeConcours().getAbrevEcoleConcours());
				concoursAnneeConcours.setLibConcours(obj.getCodeConcours().getLibConcours());
				concoursAnneeConcours.setLibEcoleConcours(obj.getCodeConcours().getLibEcoleConcours());
				concoursAnneeConcours.setAbrevEcoleConcours(obj.getCodeConcours().getAbrevEcoleConcours());
				concoursAnneeConcours.setObtentionDiplome(obj.getCodeConcours().getObtentionDiplome());
				concoursAnneeConcours.setAbrevObtentionDiplome(obj.getCodeConcours().getAbrevObtentionDiplome());
				
				//Charger la liste d'objets hybrid
				maListehybride.add(concoursAnneeConcours);
		
			}
			
			System.out.println("Taille de la liste "+maListehybride.size());
		}
		
		return maListehybride;
		
		
	}
	
	public void viderobjet(Anneeconcours quelqueObjets){
		quelqueObjets.setDroitConcours(null);
		quelqueObjets.setNbreplacesConcours(null);
		quelqueObjets.setLibAnneeConcours("");
		setSelectedPays(null);
		setSelectedEcole(null);
		setSelectedConcours(null);
		
	}
	
	
	//***********************Accesseurs*********************//

	

	public Ecole getSelectedEcole() {
		return selectedEcole;
	}

	public void setSelectedEcole(Ecole selectedEcole) {
		this.selectedEcole = selectedEcole;
	}

	public Pays getSelectedPays() {
		return selectedPays;
	}

	public void setSelectedPays(Pays selectedPays) {
		this.selectedPays = selectedPays;
	}

	public Anneeconcours getMonAnneeConcours() {
		return monAnneeConcours;
	}

	public void setMonAnneeConcours(Anneeconcours monAnneeConcours) {
		this.monAnneeConcours = monAnneeConcours;
	}

	public ReqConcours getMaRequeteConcours() {
		return maRequeteConcours;
	}

	public void setMaRequeteConcours(ReqConcours maRequeteConcours) {
		this.maRequeteConcours = maRequeteConcours;
	}

	public List getMaListeConcours() {
		return maListeConcours;
	}

	public void setMaListeConcours(List maListeConcours) {
		this.maListeConcours = maListeConcours;
	}

	public Concours getSelectedConcours() {
		return selectedConcours;
	}

	public void setSelectedConcours(Concours selectedConcours) {
		this.selectedConcours = selectedConcours;
	}

	public List<ConcoursAnneeConcours> getMaListehybride() {
		return maListehybride;
	}

	public void setMaListehybride(List<ConcoursAnneeConcours> maListehybride) {
		this.maListehybride = maListehybride;
	}

	public IService getService() {
		return service;
	}

	public void setService(IService service) {
		this.service = service;
	}

	
	
	
}
