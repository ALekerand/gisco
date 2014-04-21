package report;

import hibernate.beans.Anneeconcours;
import hibernate.beans.Candidat;
import hibernate.beans.Concours;
import hibernate.beans.Ecole;

public class InsConcoursReport {

	public InsConcoursReport() {
		// TODO Auto-generated constructor stub
	}

	private Anneeconcours anneeconcours = new Anneeconcours();
	private Ecole ecole = new Ecole();
	private Candidat candidat = new Candidat();
	private Concours concours = new Concours();
	public Anneeconcours getAnneeconcours() {
		return anneeconcours;
	}
	
	// *******************Getters & Setters
	
	public void setAnneeconcours(Anneeconcours anneeconcours) {
		this.anneeconcours = anneeconcours;
	}
	public Ecole getEcole() {
		return ecole;
	}
	public void setEcole(Ecole ecole) {
		this.ecole = ecole;
	}
	public Candidat getCandidat() {
		return candidat;
	}
	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}
	public Concours getConcours() {
		return concours;
	}
	public void setConcours(Concours concours) {
		this.concours = concours;
	}
	
}
