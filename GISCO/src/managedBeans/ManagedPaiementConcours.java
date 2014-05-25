package managedBeans;

import hibernate.beans.Caisconcours;
import hibernate.beans.Candidat;
import hibernate.beans.Inscriptionconcours;
import hibernate.beans.Mode;
import hibernate.beans.Sexes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import objetService.IService;

import org.apache.log4j.Logger;
import org.primefaces.component.inputtext.InputText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import requetes.ReqInscriptionConcours;

@Component
@Scope("session")
public class ManagedPaiementConcours implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static  Logger logger=Logger.getLogger(ManagedPaiementConcours.class);
	
	//Injection par Spring
	@Autowired
		IService  service;
	@Autowired
		private ReqInscriptionConcours reqInscriptionConcours;


	
	//Attributs d'instance
	private String valeurRecherche;
	private List<Inscriptionconcours> listInscriptionconcours = new ArrayList<Inscriptionconcours>();
	private Candidat candidat = new Candidat();
	private Sexes sexesCandidat = new Sexes();
	private Inscriptionconcours selectedInscripConcours[];
	private int montantPaiement;
	private Caisconcours caisconcours;
	private Mode selectedMode = new Mode();
	private InputText inputRefCheque;
	
	
	public List<Inscriptionconcours> rechercherCandidat() {
		reinitialiserPage();
		listInscriptionconcours = reqInscriptionConcours.recupererInscription(valeurRecherche);
		//continuer le processus si liste non vide
		if (listInscriptionconcours.size()==0) {
			//Message
			FacesContext.getCurrentInstance().addMessage(null,  new FacesMessage(FacesMessage.SEVERITY_INFO,"RECHERCHE","Aucune inscription en instance de règlement pour ce numero"));
			
		}else {
			//Faire le traitement
			//Recuperer le candidat
			setCandidat(getListInscriptionconcours().get(0).getNumCandidat());
			setSexesCandidat(getCandidat().getCodesexe());
		}
		
	return	listInscriptionconcours;
	}

	
	
	public int calculerMontant() {
		setMontantPaiement(0);
		for(int i = 0; i < selectedInscripConcours.length; i++) {
			montantPaiement += selectedInscripConcours[i].getCodeAnneesConcours().getDroitConcours().intValue();
		}
		return montantPaiement;
			
	}
	
	
	public void paiementCaisseConcours() {
		if (selectedInscripConcours.length == 0) {
			FacesContext.getCurrentInstance().addMessage(null,  new FacesMessage(FacesMessage.SEVERITY_INFO,"ENREGISTREMENT","Aucune Inscription selectionnée"));
		}else {
			//Effectuer l'enregistrement
			for(int i = 0; i < selectedInscripConcours.length; i++) {
				caisconcours = new Caisconcours();
				caisconcours.setCodeInscriptionConcours(selectedInscripConcours[i]);
				caisconcours.setCodeMode(selectedMode);
				caisconcours.setDateCaisconcours(Calendar.getInstance().getTime());
				caisconcours.setLibCaisconcours("Droit concours");
				caisconcours.setMontantCaisconcours(selectedInscripConcours[i].getCodeAnneesConcours().getDroitConcours());
				
				//Enregistrer le paiement
				getService().saveObject(caisconcours);
				
				//Mis à jour du statut de l'inscription
				selectedInscripConcours[i].setSolde(true);
				getService().updateObject(selectedInscripConcours[i]);
				
				System.out.println("Paiement effectué");//Clean after
				reinitialiserPage();
				setValeurRecherche("");
				FacesContext.getCurrentInstance().addMessage(null,  new FacesMessage(FacesMessage.SEVERITY_INFO,"ENREGISTREMENT","Règlement droit de concours effectué!"));


		}
		}
	}
	
	public void choisirMode() {
		switch (selectedMode.getLibMode()) {
		case "espece":
			inputRefCheque.setDisabled(true);
			inputRefCheque.setRequired(false);
			break;
			
		case "cheque":
			inputRefCheque.setDisabled(false);
			inputRefCheque.setRequired(true);
			break;

		default:
			break;
		}
	}
	
	
	public void viderCondidat(Candidat candidat) {
		candidat.setNomCandidat(null);
		candidat.setPrenomsCandidat(null);
		candidat.setDateNaissance(null);
		candidat.setLieuNaissance(null);
	}
	
	public void viderInscripConcours() {
		
	}
	
	public void reinitialiserPage() {
		viderCondidat(candidat);
		sexesCandidat.setLibsexe("");
		setMontantPaiement(0);
		
	}
	
	

	
	
	//****************************ACCESSEURS***********************************//
	public String getValeurRecherche() {
		return valeurRecherche;
	}

	public void setValeurRecherche(String valeurRecherche) {
		this.valeurRecherche = valeurRecherche;
	}




	public ReqInscriptionConcours getReqInscriptionConcours() {
		return reqInscriptionConcours;
	}




	public void setReqInscriptionConcours(ReqInscriptionConcours reqInscriptionConcours) {
		this.reqInscriptionConcours = reqInscriptionConcours;
	}




	public List<Inscriptionconcours> getListInscriptionconcours() {
		return listInscriptionconcours;
	}




	public void setListInscriptionconcours(List<Inscriptionconcours> listInscriptionconcours) {
		this.listInscriptionconcours = listInscriptionconcours;
	}

	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}

	public Sexes getSexesCandidat() {
		return sexesCandidat;
	}

	public void setSexesCandidat(Sexes sexesCandidat) {
		this.sexesCandidat = sexesCandidat;
	}

	public Inscriptionconcours[] getSelectedInscripConcours() {
		return selectedInscripConcours;
	}

	public void setSelectedInscripConcours(
			Inscriptionconcours[] selectedInscripConcours) {
		this.selectedInscripConcours = selectedInscripConcours;
	}

	public int getMontantPaiement() {
		return montantPaiement;
	}

	public void setMontantPaiement(int montantPaiement) {
		this.montantPaiement = montantPaiement;
	}


	public InputText getInputRefCheque() {
		return inputRefCheque;
	}

	public void setInputRefCheque(InputText inputRefCheque) {
		this.inputRefCheque = inputRefCheque;
	}

	public Mode getSelectedMode() {
		return selectedMode;
	}

	public void setSelectedMode(Mode selectedMode) {
		this.selectedMode = selectedMode;
	}



	public IService getService() {
		return service;
	}



	public void setService(IService service) {
		this.service = service;
	}

	
}
