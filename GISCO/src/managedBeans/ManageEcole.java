package managedBeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;

import dao.Crud;
import dataModel.EcoleModel;
import hibernate.beans.Ecole;

public class ManageEcole {
	private static  Logger logger=Logger.getLogger(ManageEcole.class);
	
	private Ecole monEcole = new Ecole();
	private Crud monCrud = new Crud();
	private EcoleModel monEcoleModel;
	private Ecole selectedEcole = new Ecole();
	private List listeEcole = new ArrayList<>();
	

	public void enregistrerEcole(){
		try {
			monEcole.setAbrevEcole(monEcole.getAbrevEcole().toUpperCase());
			getMonCrud().addObject(monEcole);
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
		getMonCrud().updateObject(monEcole);
		FacesContext.getCurrentInstance().addMessage(null,  new FacesMessage(FacesMessage.SEVERITY_INFO,"Modification","Opération effectuée avec succès"));
		annulerSaisie();
	}
	
	public void afficherSelectedEcole(){
		setMonEcole(selectedEcole);
	}
	
	public List chargerToutEcole(){
		setListeEcole(monCrud.getObjects("Ecole"));
		return listeEcole;
		
	}
	
	public void supprimerEcole(){
		getMonCrud().deleteObject(selectedEcole);
		annulerSaisie();
	}

	// getters and Setters
	
	public Ecole getMonEcole() {
		return monEcole;
	}

	public void setMonEcole(Ecole monEcole) {
		this.monEcole = monEcole;
	}


	public Crud getMonCrud() {
		return monCrud;
	}


	public void setMonCrud(Crud monCrud) {
		this.monCrud = monCrud;
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

}
