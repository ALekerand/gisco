package managedBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import objetService.IService;
import requetes.ReqConcours;
import hibernate.beans.Concours;
import hibernate.beans.Ecole;
import dataModel.ConcoursModel;

@Component
@Scope("session")

public class ManageConcours implements Serializable {
	// Injection de Spring
	IService service;
	
	private Concours monConcours = new Concours();
	private Ecole selectedEcole = new Ecole();
	private List listeConcours;
	private ConcoursModel monConcoursModel = new ConcoursModel(chargerListeconcours());
	private ReqConcours maRequetConcours;
	private List maListeConcoursEcole;
	private ReqConcours  reqConcours= new ReqConcours();

	public void enregistrerConcours(){
		System.out.println("---->>> m�thode d'enreg");
		monConcours.setAbrevEcoleConcours(getSelectedEcole().getAbrevEcole());
		monConcours.setLibConcours("Concours "+selectedEcole.getAbrevEcole());
		System.out.println(" ---->> Abr�viation Ecole"+getSelectedEcole().getNomEcole());
		// monConcours.setLibEcoleConcours(getSelectedEcole().getNomEcole());
		getService().saveObject(monConcours);
		FacesContext.getCurrentInstance().addMessage(null,  new FacesMessage(FacesMessage.SEVERITY_INFO,"Enregistrement","Enregistrement effectu�"));	
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
	
	public List<Concours> chargerListeconcours(){
		setListeConcours(getService().getObjects("Concours"));
		return listeConcours;
		
	}
	
	public List chargerListeConcoursEcole(){
		maListeConcoursEcole= new ArrayList<>();
		maRequetConcours=new ReqConcours();
		maListeConcoursEcole = maRequetConcours.recupererListeConcoursEcole(getSelectedEcole().getAbrevEcole());
		monConcoursModel = (ConcoursModel) maRequetConcours.recupererListeConcoursEcole(getSelectedEcole().getAbrevEcole());
		
		return null;
		
	}
	
	public void afficherLibEcole(){
		System.out.println("m�thode afficherLib appel�e");
		System.out.println("Nom ecole: "+getSelectedEcole().getId());
		System.out.println("lib�l� ecole: "+getSelectedEcole().getNomEcole());

		monConcours.setLibEcoleConcours(getSelectedEcole().getNomEcole());
		monConcours.setLibConcours("Concours d'entr�e � l'"+getSelectedEcole().getNomEcole());
		
		listeConcours.clear();
		setListeConcours(reqConcours.recupererListeConcoursEcole(selectedEcole.getAbrevEcole()));


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
	public List getListeConcours() {
		//if(listeConcours.size()==0){
		if(getSelectedEcole()==null){
			setListeConcours(getService().getObjects("Concours"));
		}
		return listeConcours;
		
	}
	public void setListeConcours(List listeConcours) {
		this.listeConcours = listeConcours;
	}
	public ConcoursModel getMonConcoursModel() {
		// monConcoursModel = new ConcoursModel(chargerListeconcours());
		return monConcoursModel;
	}
	public void setMonConcoursModel(ConcoursModel monConcoursModel) {
		this.monConcoursModel = monConcoursModel;
	}
	public ReqConcours getMaRequetConcours() {
		return maRequetConcours;
	}
	public void setMaRequetConcours(ReqConcours maRequetConcours) {
		this.maRequetConcours = maRequetConcours;
	}
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

}
