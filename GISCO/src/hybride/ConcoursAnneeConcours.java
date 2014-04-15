package hybride;

public class ConcoursAnneeConcours {

	// Propriétés de la table AnneeConcours
	// primary key
		private java.lang.Integer idAnneeConcours;

		// fields
		private java.lang.Integer anneeConcoursDebut;
		private java.lang.Integer anneeConcoursFin;
		private java.lang.String libAnneeConcours;
		private java.util.Date dateComposition;
		private java.math.BigDecimal droitConcours;
		private java.math.BigDecimal nbrePlaces;

		// many to one
		private hibernate.beans.Pays codepays;
		private hibernate.beans.Concours codeConcours;
		
		// Propriétés de la table Concours
		
		// primary key
		private java.lang.Integer idConcours;

		// fields
		private java.lang.String libConcours;
		private java.lang.String libEcoleConcours;
		private java.lang.String abrevEcoleConcours;
		private java.lang.String obtentionDiplome;
		private java.lang.String abrevObtentionDiplome;
		
		
		//Getters and Setters créés
		
		public java.lang.Integer getIdAnneeConcours() {
			return idAnneeConcours;
		}
		public void setIdAnneeConcours(java.lang.Integer idAnneeConcours) {
			this.idAnneeConcours = idAnneeConcours;
		}
		public java.lang.Integer getAnneeConcoursDebut() {
			return anneeConcoursDebut;
		}
		public void setAnneeConcoursDebut(java.lang.Integer anneeConcoursDebut) {
			this.anneeConcoursDebut = anneeConcoursDebut;
		}
		public java.lang.Integer getAnneeConcoursFin() {
			return anneeConcoursFin;
		}
		public void setAnneeConcoursFin(java.lang.Integer anneeConcoursFin) {
			this.anneeConcoursFin = anneeConcoursFin;
		}
		public java.lang.String getLibAnneeConcours() {
			return libAnneeConcours;
		}
		public void setLibAnneeConcours(java.lang.String libAnneeConcours) {
			this.libAnneeConcours = libAnneeConcours;
		}
		public java.util.Date getDateComposition() {
			return dateComposition;
		}
		public void setDateComposition(java.util.Date dateComposition) {
			this.dateComposition = dateComposition;
		}
		public java.math.BigDecimal getDroitConcours() {
			return droitConcours;
		}
		public void setDroitConcours(java.math.BigDecimal droitConcours) {
			this.droitConcours = droitConcours;
		}
		public java.math.BigDecimal getNbrePlaces() {
			return nbrePlaces;
		}
		public void setNbrePlaces(java.math.BigDecimal nbrePlaces) {
			this.nbrePlaces = nbrePlaces;
		}
		public hibernate.beans.Pays getCodepays() {
			return codepays;
		}
		public void setCodepays(hibernate.beans.Pays codepays) {
			this.codepays = codepays;
		}
		public hibernate.beans.Concours getCodeConcours() {
			return codeConcours;
		}
		public void setCodeConcours(hibernate.beans.Concours codeConcours) {
			this.codeConcours = codeConcours;
		}
		public java.lang.Integer getIdConcours() {
			return idConcours;
		}
		public void setIdConcours(java.lang.Integer idConcours) {
			this.idConcours = idConcours;
		}
		public java.lang.String getLibConcours() {
			return libConcours;
		}
		public void setLibConcours(java.lang.String libConcours) {
			this.libConcours = libConcours;
		}
		public java.lang.String getLibEcoleConcours() {
			return libEcoleConcours;
		}
		public void setLibEcoleConcours(java.lang.String libEcoleConcours) {
			this.libEcoleConcours = libEcoleConcours;
		}
		public java.lang.String getAbrevEcoleConcours() {
			return abrevEcoleConcours;
		}
		public void setAbrevEcoleConcours(java.lang.String abrevEcoleConcours) {
			this.abrevEcoleConcours = abrevEcoleConcours;
		}
		public java.lang.String getObtentionDiplome() {
			return obtentionDiplome;
		}
		public void setObtentionDiplome(java.lang.String obtentionDiplome) {
			this.obtentionDiplome = obtentionDiplome;
		}
		public java.lang.String getAbrevObtentionDiplome() {
			return abrevObtentionDiplome;
		}
		public void setAbrevObtentionDiplome(java.lang.String abrevObtentionDiplome) {
			this.abrevObtentionDiplome = abrevObtentionDiplome;
		}


}
