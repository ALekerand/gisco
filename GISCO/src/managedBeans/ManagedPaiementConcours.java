package managedBeans;

import hibernate.beans.Candidat;
import hibernate.beans.Concours;
import hibernate.beans.Inscriptionconcours;
import hibernate.beans.Sexes;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import requetes.ReqInscriptionConcours;


public class ManagedPaiementConcours implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static  Logger logger=Logger.getLogger(ManagedPaiementConcours.class);
	
	//Attributs d'instance
	private String valeurRecherche;
	private List<Inscriptionconcours> listInscriptionconcours = new ArrayList<Inscriptionconcours>();
	private ReqInscriptionConcours reqInscriptionConcours = new ReqInscriptionConcours();
	private Candidat candidat = new Candidat();
	private Sexes sexesCandidat = new Sexes();
	private Inscriptionconcours selectedInscripConcours[];
	private BigDecimal montantPaiement = new BigDecimal(0);
	
	
	public List<Inscriptionconcours> rechercherCandidat() {
		listInscriptionconcours = reqInscriptionConcours.recupererInscription(valeurRecherche);
		//Recuperer le candidat
		setCandidat(getListInscriptionconcours().get(0).getNumCandidat());
		setSexesCandidat(getCandidat().getCodesexe());
	return	listInscriptionconcours;
	}
	
	public void calculerMontant() {
		System.out.println("Calcul du montant");//Clean After
		System.out.println("taille tableau: "+selectedInscripConcours.length);//Clean After
		
		setMontantPaiement(new BigDecimal(0));
		for(int i=0; i<selectedInscripConcours.length; i++) {
			System.out.println("Montant "+selectedInscripConcours[i].getCodeAnneesConcours().getDroitConcours());//Clean After
			montantPaiement.add(selectedInscripConcours[i].getCodeAnneesConcours().getDroitConcours());
			System.out.println("montant: "+montantPaiement );//Clean After
			System.out.println("Fin Calcul du montant");//Clean After

		}
			
	}
	
	
	public void test() {
		System.out.println("------>> Serveur OK");
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


	public BigDecimal getMontantPaiement() {
		return montantPaiement;
	}


	public void setMontantPaiement(BigDecimal montantPaiement) {
		this.montantPaiement = montantPaiement;
	}

	public Inscriptionconcours[] getSelectedInscripConcours() {
		return selectedInscripConcours;
	}

	public void setSelectedInscripConcours(
			Inscriptionconcours[] selectedInscripConcours) {
		this.selectedInscripConcours = selectedInscripConcours;
	}

	
}
