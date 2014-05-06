package managedBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import hibernate.beans.Niveaux;
import dao.Crud;
import dataModel.NiveauModel;

public class ManageNiveaux implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Crud monCrud = new Crud();
	private Niveaux monNiveau = new Niveaux();
	private NiveauModel monNiveauModel;
	private List listeNiveau = new ArrayList<>();
	private Niveaux selectedNiveau = new Niveaux();
	

	public void enregistrerNiveaux() {
		monNiveau.setAbrevNiveau(monNiveau.getAbrevNiveau().toUpperCase());
		getMonCrud().addObject(monNiveau);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Enregistrement","Enregistrement effectué avec succès"));
		annulerSaisie();
	}
	
	public void viderNiveau(Niveaux monObjet){
		monObjet.setLibNiveau("");
		monObjet.setAbrevNiveau("");
		
	}
	
	public void annulerSaisie(){
		viderNiveau(monNiveau);
	}
	
	@SuppressWarnings("rawtypes")
	public List afficherToutNiveau(){
		setListeNiveau(monCrud.getObjects("Niveaux"));
		return listeNiveau;
		
		
	}
	
	public void afficherSelectedNiveau(){
		setMonNiveau(selectedNiveau);
		
	}
	
	// ************************* Getters and Setters ***********************


	public Crud getMonCrud() {
		return monCrud;
	}


	public void setMonCrud(Crud monCrud) {
		this.monCrud = monCrud;
	}

	public Niveaux getMonNiveau() {
		return monNiveau;
	}

	public void setMonNiveau(Niveaux monNiveau) {
		this.monNiveau = monNiveau;
	}

	@SuppressWarnings("unchecked")
	public NiveauModel getMonNiveauModel() {
		monNiveauModel = new NiveauModel(afficherToutNiveau());
		return monNiveauModel;
	}

	public void setMonNiveauModel(NiveauModel monNiveauModel) {
		this.monNiveauModel = monNiveauModel;
	}

	public List getListeNiveau() {
		return listeNiveau;
	}

	public void setListeNiveau(List listeNiveau) {
		this.listeNiveau = listeNiveau;
	}

	public Niveaux getSelectedNiveau() {
		return selectedNiveau;
	}

	public void setSelectedNiveau(Niveaux selectedNiveau) {
		this.selectedNiveau = selectedNiveau;
	}
	
	

}
