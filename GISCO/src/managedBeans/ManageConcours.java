package managedBeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import requetes.ReqConcours;

import hibernate.beans.Concours;
import hibernate.beans.Ecole;
import dao.Crud;
import dataModel.ConcoursModel;

public class ManageConcours {
	
	private Crud monCrud = new Crud();
	private Concours monConcours = new Concours();
	private Ecole selectedEcole = new Ecole();
	private List listeConcours;
	private ConcoursModel monConcoursModel = new ConcoursModel(chargerListeconcours());
	private ReqConcours maRequetConcours;
	private List maListeConcoursEcole;
	private ReqConcours  reqConcours= new ReqConcours();

	public void enregistrerConcours(){
		System.out.println("---->>> méthode d'enreg");
		monConcours.setAbrevEcoleConcours(getSelectedEcole().getAbrevEcole());
		monConcours.setLibConcours("Concours "+selectedEcole.getAbrevEcole());
		System.out.println(" ---->> Abréviation Ecole"+getSelectedEcole().getNomEcole());
		// monConcours.setLibEcoleConcours(getSelectedEcole().getNomEcole());
		getMonCrud().addObject(monConcours);
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
	
	public List<Concours> chargerListeconcours(){
		setListeConcours(getMonCrud().getObjects("Concours"));
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
		System.out.println("méthode afficherLib appelée");
		System.out.println("Nom ecole: "+getSelectedEcole().getId());
		System.out.println("libélé ecole: "+getSelectedEcole().getNomEcole());

		monConcours.setLibEcoleConcours(getSelectedEcole().getNomEcole());
		monConcours.setLibConcours("Concours d'entrée à l'"+getSelectedEcole().getNomEcole());
		
		listeConcours.clear();
		setListeConcours(reqConcours.recupererListeConcoursEcole(selectedEcole.getAbrevEcole()));


	}
	

	//********************Accesseurs*********//
	public Crud getMonCrud() {
		return monCrud;
	}

	public void setMonCrud(Crud monCrud) {
		this.monCrud = monCrud;
	}


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
			setListeConcours(getMonCrud().getObjects("Concours"));
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

}
