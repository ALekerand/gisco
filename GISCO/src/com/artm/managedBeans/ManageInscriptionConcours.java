package com.artm.managedBeans;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.artm.dataModel.ConcoursModel;
import com.artm.etats.EtatAutorisationConcours;
import com.artm.hibernate.beans.Anneeconcours;
import com.artm.hibernate.beans.Candidat;
import com.artm.hibernate.beans.Concours;
import com.artm.hibernate.beans.Diplomes;
import com.artm.hibernate.beans.Ecole;
import com.artm.hibernate.beans.Inscriptionconcours;
import com.artm.hibernate.beans.Nationalites;
import com.artm.hibernate.beans.Niveaux;
import com.artm.hibernate.beans.Pays;
import com.artm.hibernate.beans.Sexes;
import com.artm.objetService.IService;
import com.artm.requetes.ReqAnneeConcours;
import com.artm.requetes.ReqConcours;
import com.artm.utilitaires.DateCalculator;

@Component
@Scope("session")
public class ManageInscriptionConcours implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static  Logger logger=Logger.getLogger(ManageInscriptionConcours.class);
	
	//Injection de Spring
	@Autowired
	IService service;
	@Autowired
	ReqAnneeConcours reqAnneeConcours;
	@Autowired
	ReqConcours reqConcours;
	@Autowired
	DateCalculator dateCalculator;
	@Autowired
	EtatAutorisationConcours autorisationConcours;
	
	private Ecole selectedEcole = new Ecole();
	private Pays selectedPays=new Pays();
	private Sexes selectedSexe = new Sexes();
	private Nationalites selectedNationalite = new Nationalites();
	private Candidat monCandidat = new Candidat();
	private Niveaux selectedNiveau = new Niveaux();
	private Diplomes selectedDiplome = new Diplomes();
	private int age;
	private String ageDiplome;
	private Anneeconcours monObjetAnneeConcours = new Anneeconcours();
	private ConcoursModel monConcoursModel;
	private List listeconcours;
	private List listeConcoursChoisis;
	private Concours selectedsConcours[];
	private Inscriptionconcours inscriptionconcours;

	
	
	public void enregistrerCandidat(){	
			monCandidat.setCodepays(getSelectedPays());
			monCandidat.setCodesexe(getSelectedSexe());
			monCandidat.setCodenationalite(getSelectedNationalite());
			monCandidat.setCodeniveau(getSelectedNiveau());
			monCandidat.setCodeDiplome(getSelectedDiplome());
			getService().saveObject(getMonCandidat());
			FacesContext.getCurrentInstance().addMessage(null,  new FacesMessage(FacesMessage.SEVERITY_INFO,"Enregistrement","Enregistrement effectué avec succès"));
		
			
		}

	
	
	public void enregTableInscription(){
		int i;
		
		for(i=0; i<selectedsConcours.length; i++){
			//Rensegner les la Table InscriptionConcours
		inscriptionconcours=new Inscriptionconcours();
		inscriptionconcours.setNumCandidat(monCandidat);
	//	inscriptionconcours.setCodeAnneesConcours(monObjetAnneeConcours);
		inscriptionconcours.setCodeAnneesConcours(reqAnneeConcours.recupAnneeConcoursParConcours(selectedsConcours[i].getId().toString()));
		inscriptionconcours.setCodeConcours(selectedsConcours[i]);
		inscriptionconcours.setDateInscriptionConcours(Calendar.getInstance().getTime());
		//Enregistrer ds la Table
		getService().saveObject(inscriptionconcours);
		}
	}
	
	public void inscrirCandidat(){
		try {
			enregistrerCandidat();
			System.out.println("------>> Candidat enregistrer");//Clean after
			 enregTableInscription();
			 //Edition Etat
			 getAutorisationConcours().setAnneeconcours(monObjetAnneeConcours);
			 getAutorisationConcours().setCandidat(monCandidat);
			 for(Concours concours : selectedsConcours){
				 getAutorisationConcours().setConcours(concours);	
				 getAutorisationConcours().creerAutorisation();
			 }
			getAutorisationConcours().creerAutorisation();
			 ViderCandidat(monCandidat);
		} catch (Exception e) {
			logger.error("Une erreur est survenue lors de l'enregistrement du candidat",e);
		}
	}
	
	
	public void ViderCandidat(Candidat monObjet){
		monObjet.setNomCandidat("");
		monObjet.setPrenomsCandidat("");
		monObjet.setLieuNaissance("");
		monObjet.setCodesexe(null);
		monObjet.setDateNaissance(null);
		monObjet.setCodeDiplome(null);
		monObjet.setCodenationalite(null);
		monObjet.setCodeniveau(null);
		monObjet.setCodepays(null);
		setAge(0);
		
			
	}
		
	public int calculerAge(){
		setAge(0);
		System.out.println("Calcul de l'age");
	int nbreJour =	(int) getDateCalculator().calculerDifference(getMonCandidat().getDateNaissance(), Calendar.getInstance().getTime());
	System.out.println("----------->>> Age"+getAge());
	return age = nbreJour/365; 
	} 
	
	public int calculerAgeDiplome(){
		setAgeDiplome(null);
	int nbreJour =	(int) getDateCalculator().calculerDifference(getMonCandidat().getDateNaissance(), Calendar.getInstance().getTime());
	System.out.println("----------->>> Age"+getAge());
	return age = nbreJour/365; 
	} 
	
	
	
	
	
	
	public List chargerListeConcours(){
		listeconcours= reqConcours.recupererListeConcoursPays(selectedPays.getId(), monObjetAnneeConcours.getLibAnneeConcours());		
		System.out.println("**************************"+listeconcours.size());
		return listeconcours;

	}
	
	public void annulerSaisie(){
		ViderCandidat(monCandidat);
		chargerListeConcours();
		
	}
	
	public void test(){
		System.out.println("******************Taille du tableau:"+selectedsConcours);
	}

	
	//*************************ACCESSEURS***********************

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



	public Sexes getSelectedSexe() {
		return selectedSexe;
	}



	public void setSelectedSexe(Sexes selectedSexe) {
		this.selectedSexe = selectedSexe;
	}



	public Candidat getMonCandidat() {
		return monCandidat;
	}





	public void setMonCandidat(Candidat monCandidat) {
		this.monCandidat = monCandidat;
	}





	public Nationalites getSelectedNationalite() {
		return selectedNationalite;
	}





	public void setSelectedNationalite(Nationalites selectedNationalite) {
		this.selectedNationalite = selectedNationalite;
	}


	public Niveaux getSelectedNiveau() {
		return selectedNiveau;
	}


	public void setSelectedNiveau(Niveaux selectedNiveau) {
		this.selectedNiveau = selectedNiveau;
	}


	public Diplomes getSelectedDiplome() {
		return selectedDiplome;
	}


	public void setSelectedDiplome(Diplomes selectedDiplome) {
		this.selectedDiplome = selectedDiplome;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Anneeconcours getMonObjetAnneeConcours() {
		try {
			setMonObjetAnneeConcours(reqAnneeConcours.recupererDernierAnneeConcours().get(0));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Renseigner une Année Scolaire");
		//	e.printStackTrace();
		}
		
		return monObjetAnneeConcours;
	}

	public void setMonObjetAnneeConcours(Anneeconcours monObjetAnneeConcours) {
		this.monObjetAnneeConcours = monObjetAnneeConcours;
	}

	public ConcoursModel getMonConcoursModel() {
		return monConcoursModel;
	}

	public void setMonConcoursModel(ConcoursModel monConcoursModel) {
		this.monConcoursModel = monConcoursModel;
	}

	public List getListeconcours() {
		return listeconcours;
	}

	public void setListeconcours(List listeconcours) {
		this.listeconcours = listeconcours;
	}

	public List getListeConcoursChoisis() {
		return listeConcoursChoisis;
	}

	public void setListeConcoursChoisis(List listeConcoursChoisis) {
		this.listeConcoursChoisis = listeConcoursChoisis;
	}

	public Concours[] getSelectedsConcours() {
		return selectedsConcours;
	}

	public void setSelectedsConcours(Concours[] selectedsConcours) {
		this.selectedsConcours = selectedsConcours;
	}



	public DateCalculator getDateCalculator() {
		return dateCalculator;
	}



	public void setDateCalculator(DateCalculator dateCalculator) {
		this.dateCalculator = dateCalculator;
	}



	public EtatAutorisationConcours getAutorisationConcours() {
		return autorisationConcours;
	}



	public void setAutorisationConcours(EtatAutorisationConcours autorisationConcours) {
		this.autorisationConcours = autorisationConcours;
	}



	public IService getService() {
		return service;
	}



	public void setService(IService service) {
		this.service = service;
	}



	public ReqAnneeConcours getReqAnneeConcours() {
		return reqAnneeConcours;
	}



	public void setReqAnneeConcours(ReqAnneeConcours reqAnneeConcours) {
		this.reqAnneeConcours = reqAnneeConcours;
	}



	public String getAgeDiplome() {
		return ageDiplome;
	}



	public void setAgeDiplome(String ageDiplome) {
		this.ageDiplome = ageDiplome;
	}


	






}
