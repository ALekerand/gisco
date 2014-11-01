package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the etudiants table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="etudiants"
 */

public abstract class BaseEtudiants  implements Serializable {

	public static String REF = "Etudiants";
	public static String PROP_TEL_ETUDIANT = "TelEtudiant";
	public static String PROP_CODENATIONALITE = "Codenationalite";
	public static String PROP_TEL_TUTEUR = "TelTuteur";
	public static String PROP_DATENAIS = "Datenais";
	public static String PROP_CODEMATRIMONIALE = "Codematrimoniale";
	public static String PROP_NOM_PRENOMS_PERE = "NomPrenomsPere";
	public static String PROP_NUMCNI = "Numcni";
	public static String PROP_FONCTION_MERE = "FonctionMere";
	public static String PROP_CODENIVEAU = "Codeniveau";
	public static String PROP_MLE = "Mle";
	public static String PROP_CODEPAYS = "Codepays";
	public static String PROP_CODE_DIPLOME = "CodeDiplome";
	public static String PROP_NOM_PRENOMS_TUTEUR = "NomPrenomsTuteur";
	public static String PROP_PHOTO = "Photo";
	public static String PROP_NOM = "Nom";
	public static String PROP_NBSOEURS = "Nbsoeurs";
	public static String PROP_TEL_PERE = "TelPere";
	public static String PROP_PRENOMS = "Prenoms";
	public static String PROP_FONCTION_PERE = "FonctionPere";
	public static String PROP_MAIL_ETUDIANT = "MailEtudiant";
	public static String PROP_PAYS_NAISSANCE_ETUDIANT = "PaysNaissanceEtudiant";
	public static String PROP_ECOLE_ANCIENNE_ETUDIANT = "EcoleAncienneEtudiant";
	public static String PROP_NOM_PRENOMS_MERE = "NomPrenomsMere";
	public static String PROP_ID = "Id";
	public static String PROP_NBENFANTS = "Nbenfants";
	public static String PROP_TEL_MERE = "TelMere";
	public static String PROP_LIEUNAIS = "Lieunais";
	public static String PROP_TEL_DOCTEUR = "TelDocteur";
	public static String PROP_NBFRERES = "Nbfreres";
	public static String PROP_NOM_PRENOMS_DOCTEUT = "NomPrenomsDocteut";
	public static String PROP_CODESANTE = "Codesante";


	// constructors
	public BaseEtudiants () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseEtudiants (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseEtudiants (
		java.lang.Integer id,
		com.artm.hibernate.beans.Nationalites codenationalite,
		com.artm.hibernate.beans.Pays codepays,
		com.artm.hibernate.beans.Santes codesante,
		com.artm.hibernate.beans.Niveaux codeniveau,
		com.artm.hibernate.beans.Matrimoniales codematrimoniale) {

		this.setId(id);
		this.setCodenationalite(codenationalite);
		this.setCodepays(codepays);
		this.setCodesante(codesante);
		this.setCodeniveau(codeniveau);
		this.setCodematrimoniale(codematrimoniale);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String mle;
	private java.lang.String nom;
	private java.lang.String prenoms;
	private java.util.Date datenais;
	private java.lang.String lieunais;
	private java.lang.String paysNaissanceEtudiant;
	private java.lang.Integer nbenfants;
	private java.lang.Integer nbsoeurs;
	private java.lang.Integer nbfreres;
	private java.lang.String numcni;
	private java.lang.String nomPrenomsPere;
	private java.lang.String fonctionPere;
	private java.lang.String telPere;
	private java.lang.String nomPrenomsMere;
	private java.lang.String fonctionMere;
	private java.lang.String telMere;
	private java.lang.String nomPrenomsTuteur;
	private java.lang.String telTuteur;
	private java.lang.String nomPrenomsDocteut;
	private java.lang.String telDocteur;
	private java.lang.String telEtudiant;
	private java.lang.String mailEtudiant;
	private java.lang.String ecoleAncienneEtudiant;
	private java.lang.String photo;

	// many to one
	private com.artm.hibernate.beans.Nationalites codenationalite;
	private com.artm.hibernate.beans.Pays codepays;
	private com.artm.hibernate.beans.Santes codesante;
	private com.artm.hibernate.beans.Niveaux codeniveau;
	private com.artm.hibernate.beans.Diplomes codeDiplome;
	private com.artm.hibernate.beans.Matrimoniales codematrimoniale;

	// collections
	private java.util.Set<com.artm.hibernate.beans.Inscriptions> inscriptions;
	private java.util.Set<com.artm.hibernate.beans.Scolarites> scolarites;
	private java.util.Set<com.artm.hibernate.beans.Notexam> notexams;
	private java.util.Set<com.artm.hibernate.beans.Absence> absences;
	private java.util.Set<com.artm.hibernate.beans.Versement> versements;
	private java.util.Set<com.artm.hibernate.beans.Notes> notes;
	private java.util.Set<com.artm.hibernate.beans.Logement> logements;
	private java.util.Set<com.artm.hibernate.beans.Candidature> candidatures;
	private java.util.Set<com.artm.hibernate.beans.Sexes> sexes;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="NUMETUDIANT"
     */
	public java.lang.Integer getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (java.lang.Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: MLE
	 */
	public java.lang.String getMle () {
		return mle;
	}

	/**
	 * Set the value related to the column: MLE
	 * @param mle the MLE value
	 */
	public void setMle (java.lang.String mle) {
		this.mle = mle;
	}



	/**
	 * Return the value associated with the column: NOM
	 */
	public java.lang.String getNom () {
		return nom;
	}

	/**
	 * Set the value related to the column: NOM
	 * @param nom the NOM value
	 */
	public void setNom (java.lang.String nom) {
		this.nom = nom;
	}



	/**
	 * Return the value associated with the column: PRENOMS
	 */
	public java.lang.String getPrenoms () {
		return prenoms;
	}

	/**
	 * Set the value related to the column: PRENOMS
	 * @param prenoms the PRENOMS value
	 */
	public void setPrenoms (java.lang.String prenoms) {
		this.prenoms = prenoms;
	}



	/**
	 * Return the value associated with the column: DATENAIS
	 */
	public java.util.Date getDatenais () {
		return datenais;
	}

	/**
	 * Set the value related to the column: DATENAIS
	 * @param datenais the DATENAIS value
	 */
	public void setDatenais (java.util.Date datenais) {
		this.datenais = datenais;
	}



	/**
	 * Return the value associated with the column: LIEUNAIS
	 */
	public java.lang.String getLieunais () {
		return lieunais;
	}

	/**
	 * Set the value related to the column: LIEUNAIS
	 * @param lieunais the LIEUNAIS value
	 */
	public void setLieunais (java.lang.String lieunais) {
		this.lieunais = lieunais;
	}



	/**
	 * Return the value associated with the column: PAYS_NAISSANCE_ETUDIANT
	 */
	public java.lang.String getPaysNaissanceEtudiant () {
		return paysNaissanceEtudiant;
	}

	/**
	 * Set the value related to the column: PAYS_NAISSANCE_ETUDIANT
	 * @param paysNaissanceEtudiant the PAYS_NAISSANCE_ETUDIANT value
	 */
	public void setPaysNaissanceEtudiant (java.lang.String paysNaissanceEtudiant) {
		this.paysNaissanceEtudiant = paysNaissanceEtudiant;
	}



	/**
	 * Return the value associated with the column: NBENFANTS
	 */
	public java.lang.Integer getNbenfants () {
		return nbenfants;
	}

	/**
	 * Set the value related to the column: NBENFANTS
	 * @param nbenfants the NBENFANTS value
	 */
	public void setNbenfants (java.lang.Integer nbenfants) {
		this.nbenfants = nbenfants;
	}



	/**
	 * Return the value associated with the column: NBSOEURS
	 */
	public java.lang.Integer getNbsoeurs () {
		return nbsoeurs;
	}

	/**
	 * Set the value related to the column: NBSOEURS
	 * @param nbsoeurs the NBSOEURS value
	 */
	public void setNbsoeurs (java.lang.Integer nbsoeurs) {
		this.nbsoeurs = nbsoeurs;
	}



	/**
	 * Return the value associated with the column: NBFRERES
	 */
	public java.lang.Integer getNbfreres () {
		return nbfreres;
	}

	/**
	 * Set the value related to the column: NBFRERES
	 * @param nbfreres the NBFRERES value
	 */
	public void setNbfreres (java.lang.Integer nbfreres) {
		this.nbfreres = nbfreres;
	}



	/**
	 * Return the value associated with the column: NUMCNI
	 */
	public java.lang.String getNumcni () {
		return numcni;
	}

	/**
	 * Set the value related to the column: NUMCNI
	 * @param numcni the NUMCNI value
	 */
	public void setNumcni (java.lang.String numcni) {
		this.numcni = numcni;
	}



	/**
	 * Return the value associated with the column: NOM_PRENOMS_PERE
	 */
	public java.lang.String getNomPrenomsPere () {
		return nomPrenomsPere;
	}

	/**
	 * Set the value related to the column: NOM_PRENOMS_PERE
	 * @param nomPrenomsPere the NOM_PRENOMS_PERE value
	 */
	public void setNomPrenomsPere (java.lang.String nomPrenomsPere) {
		this.nomPrenomsPere = nomPrenomsPere;
	}



	/**
	 * Return the value associated with the column: FONCTION_PERE
	 */
	public java.lang.String getFonctionPere () {
		return fonctionPere;
	}

	/**
	 * Set the value related to the column: FONCTION_PERE
	 * @param fonctionPere the FONCTION_PERE value
	 */
	public void setFonctionPere (java.lang.String fonctionPere) {
		this.fonctionPere = fonctionPere;
	}



	/**
	 * Return the value associated with the column: TEL_PERE
	 */
	public java.lang.String getTelPere () {
		return telPere;
	}

	/**
	 * Set the value related to the column: TEL_PERE
	 * @param telPere the TEL_PERE value
	 */
	public void setTelPere (java.lang.String telPere) {
		this.telPere = telPere;
	}



	/**
	 * Return the value associated with the column: NOM_PRENOMS_MERE
	 */
	public java.lang.String getNomPrenomsMere () {
		return nomPrenomsMere;
	}

	/**
	 * Set the value related to the column: NOM_PRENOMS_MERE
	 * @param nomPrenomsMere the NOM_PRENOMS_MERE value
	 */
	public void setNomPrenomsMere (java.lang.String nomPrenomsMere) {
		this.nomPrenomsMere = nomPrenomsMere;
	}



	/**
	 * Return the value associated with the column: FONCTION_MERE
	 */
	public java.lang.String getFonctionMere () {
		return fonctionMere;
	}

	/**
	 * Set the value related to the column: FONCTION_MERE
	 * @param fonctionMere the FONCTION_MERE value
	 */
	public void setFonctionMere (java.lang.String fonctionMere) {
		this.fonctionMere = fonctionMere;
	}



	/**
	 * Return the value associated with the column: TEL_MERE
	 */
	public java.lang.String getTelMere () {
		return telMere;
	}

	/**
	 * Set the value related to the column: TEL_MERE
	 * @param telMere the TEL_MERE value
	 */
	public void setTelMere (java.lang.String telMere) {
		this.telMere = telMere;
	}



	/**
	 * Return the value associated with the column: NOM_PRENOMS_TUTEUR
	 */
	public java.lang.String getNomPrenomsTuteur () {
		return nomPrenomsTuteur;
	}

	/**
	 * Set the value related to the column: NOM_PRENOMS_TUTEUR
	 * @param nomPrenomsTuteur the NOM_PRENOMS_TUTEUR value
	 */
	public void setNomPrenomsTuteur (java.lang.String nomPrenomsTuteur) {
		this.nomPrenomsTuteur = nomPrenomsTuteur;
	}



	/**
	 * Return the value associated with the column: TEL_TUTEUR
	 */
	public java.lang.String getTelTuteur () {
		return telTuteur;
	}

	/**
	 * Set the value related to the column: TEL_TUTEUR
	 * @param telTuteur the TEL_TUTEUR value
	 */
	public void setTelTuteur (java.lang.String telTuteur) {
		this.telTuteur = telTuteur;
	}



	/**
	 * Return the value associated with the column: NOM_PRENOMS_DOCTEUT
	 */
	public java.lang.String getNomPrenomsDocteut () {
		return nomPrenomsDocteut;
	}

	/**
	 * Set the value related to the column: NOM_PRENOMS_DOCTEUT
	 * @param nomPrenomsDocteut the NOM_PRENOMS_DOCTEUT value
	 */
	public void setNomPrenomsDocteut (java.lang.String nomPrenomsDocteut) {
		this.nomPrenomsDocteut = nomPrenomsDocteut;
	}



	/**
	 * Return the value associated with the column: TEL_DOCTEUR
	 */
	public java.lang.String getTelDocteur () {
		return telDocteur;
	}

	/**
	 * Set the value related to the column: TEL_DOCTEUR
	 * @param telDocteur the TEL_DOCTEUR value
	 */
	public void setTelDocteur (java.lang.String telDocteur) {
		this.telDocteur = telDocteur;
	}



	/**
	 * Return the value associated with the column: TEL_ETUDIANT
	 */
	public java.lang.String getTelEtudiant () {
		return telEtudiant;
	}

	/**
	 * Set the value related to the column: TEL_ETUDIANT
	 * @param telEtudiant the TEL_ETUDIANT value
	 */
	public void setTelEtudiant (java.lang.String telEtudiant) {
		this.telEtudiant = telEtudiant;
	}



	/**
	 * Return the value associated with the column: MAIL_ETUDIANT
	 */
	public java.lang.String getMailEtudiant () {
		return mailEtudiant;
	}

	/**
	 * Set the value related to the column: MAIL_ETUDIANT
	 * @param mailEtudiant the MAIL_ETUDIANT value
	 */
	public void setMailEtudiant (java.lang.String mailEtudiant) {
		this.mailEtudiant = mailEtudiant;
	}



	/**
	 * Return the value associated with the column: ECOLE_ANCIENNE_ETUDIANT
	 */
	public java.lang.String getEcoleAncienneEtudiant () {
		return ecoleAncienneEtudiant;
	}

	/**
	 * Set the value related to the column: ECOLE_ANCIENNE_ETUDIANT
	 * @param ecoleAncienneEtudiant the ECOLE_ANCIENNE_ETUDIANT value
	 */
	public void setEcoleAncienneEtudiant (java.lang.String ecoleAncienneEtudiant) {
		this.ecoleAncienneEtudiant = ecoleAncienneEtudiant;
	}



	/**
	 * Return the value associated with the column: PHOTO
	 */
	public java.lang.String getPhoto () {
		return photo;
	}

	/**
	 * Set the value related to the column: PHOTO
	 * @param photo the PHOTO value
	 */
	public void setPhoto (java.lang.String photo) {
		this.photo = photo;
	}



	/**
	 * Return the value associated with the column: CODENATIONALITE
	 */
	public com.artm.hibernate.beans.Nationalites getCodenationalite () {
		return codenationalite;
	}

	/**
	 * Set the value related to the column: CODENATIONALITE
	 * @param codenationalite the CODENATIONALITE value
	 */
	public void setCodenationalite (com.artm.hibernate.beans.Nationalites codenationalite) {
		this.codenationalite = codenationalite;
	}



	/**
	 * Return the value associated with the column: CODEPAYS
	 */
	public com.artm.hibernate.beans.Pays getCodepays () {
		return codepays;
	}

	/**
	 * Set the value related to the column: CODEPAYS
	 * @param codepays the CODEPAYS value
	 */
	public void setCodepays (com.artm.hibernate.beans.Pays codepays) {
		this.codepays = codepays;
	}



	/**
	 * Return the value associated with the column: CODESANTE
	 */
	public com.artm.hibernate.beans.Santes getCodesante () {
		return codesante;
	}

	/**
	 * Set the value related to the column: CODESANTE
	 * @param codesante the CODESANTE value
	 */
	public void setCodesante (com.artm.hibernate.beans.Santes codesante) {
		this.codesante = codesante;
	}



	/**
	 * Return the value associated with the column: CODENIVEAU
	 */
	public com.artm.hibernate.beans.Niveaux getCodeniveau () {
		return codeniveau;
	}

	/**
	 * Set the value related to the column: CODENIVEAU
	 * @param codeniveau the CODENIVEAU value
	 */
	public void setCodeniveau (com.artm.hibernate.beans.Niveaux codeniveau) {
		this.codeniveau = codeniveau;
	}



	/**
	 * Return the value associated with the column: CODE_DIPLOME
	 */
	public com.artm.hibernate.beans.Diplomes getCodeDiplome () {
		return codeDiplome;
	}

	/**
	 * Set the value related to the column: CODE_DIPLOME
	 * @param codeDiplome the CODE_DIPLOME value
	 */
	public void setCodeDiplome (com.artm.hibernate.beans.Diplomes codeDiplome) {
		this.codeDiplome = codeDiplome;
	}



	/**
	 * Return the value associated with the column: CODEMATRIMONIALE
	 */
	public com.artm.hibernate.beans.Matrimoniales getCodematrimoniale () {
		return codematrimoniale;
	}

	/**
	 * Set the value related to the column: CODEMATRIMONIALE
	 * @param codematrimoniale the CODEMATRIMONIALE value
	 */
	public void setCodematrimoniale (com.artm.hibernate.beans.Matrimoniales codematrimoniale) {
		this.codematrimoniale = codematrimoniale;
	}



	/**
	 * Return the value associated with the column: Inscriptions
	 */
	public java.util.Set<com.artm.hibernate.beans.Inscriptions> getInscriptions () {
		return inscriptions;
	}

	/**
	 * Set the value related to the column: Inscriptions
	 * @param inscriptions the Inscriptions value
	 */
	public void setInscriptions (java.util.Set<com.artm.hibernate.beans.Inscriptions> inscriptions) {
		this.inscriptions = inscriptions;
	}

	public void addToInscriptions (com.artm.hibernate.beans.Inscriptions inscriptions) {
		if (null == getInscriptions()) setInscriptions(new java.util.TreeSet<com.artm.hibernate.beans.Inscriptions>());
		getInscriptions().add(inscriptions);
	}



	/**
	 * Return the value associated with the column: Scolarites
	 */
	public java.util.Set<com.artm.hibernate.beans.Scolarites> getScolarites () {
		return scolarites;
	}

	/**
	 * Set the value related to the column: Scolarites
	 * @param scolarites the Scolarites value
	 */
	public void setScolarites (java.util.Set<com.artm.hibernate.beans.Scolarites> scolarites) {
		this.scolarites = scolarites;
	}

	public void addToScolarites (com.artm.hibernate.beans.Scolarites scolarites) {
		if (null == getScolarites()) setScolarites(new java.util.TreeSet<com.artm.hibernate.beans.Scolarites>());
		getScolarites().add(scolarites);
	}



	/**
	 * Return the value associated with the column: Notexams
	 */
	public java.util.Set<com.artm.hibernate.beans.Notexam> getNotexams () {
		return notexams;
	}

	/**
	 * Set the value related to the column: Notexams
	 * @param notexams the Notexams value
	 */
	public void setNotexams (java.util.Set<com.artm.hibernate.beans.Notexam> notexams) {
		this.notexams = notexams;
	}

	public void addToNotexams (com.artm.hibernate.beans.Notexam notexam) {
		if (null == getNotexams()) setNotexams(new java.util.TreeSet<com.artm.hibernate.beans.Notexam>());
		getNotexams().add(notexam);
	}



	/**
	 * Return the value associated with the column: Absences
	 */
	public java.util.Set<com.artm.hibernate.beans.Absence> getAbsences () {
		return absences;
	}

	/**
	 * Set the value related to the column: Absences
	 * @param absences the Absences value
	 */
	public void setAbsences (java.util.Set<com.artm.hibernate.beans.Absence> absences) {
		this.absences = absences;
	}

	public void addToAbsences (com.artm.hibernate.beans.Absence absence) {
		if (null == getAbsences()) setAbsences(new java.util.TreeSet<com.artm.hibernate.beans.Absence>());
		getAbsences().add(absence);
	}



	/**
	 * Return the value associated with the column: Versements
	 */
	public java.util.Set<com.artm.hibernate.beans.Versement> getVersements () {
		return versements;
	}

	/**
	 * Set the value related to the column: Versements
	 * @param versements the Versements value
	 */
	public void setVersements (java.util.Set<com.artm.hibernate.beans.Versement> versements) {
		this.versements = versements;
	}

	public void addToVersements (com.artm.hibernate.beans.Versement versement) {
		if (null == getVersements()) setVersements(new java.util.TreeSet<com.artm.hibernate.beans.Versement>());
		getVersements().add(versement);
	}



	/**
	 * Return the value associated with the column: Notes
	 */
	public java.util.Set<com.artm.hibernate.beans.Notes> getNotes () {
		return notes;
	}

	/**
	 * Set the value related to the column: Notes
	 * @param notes the Notes value
	 */
	public void setNotes (java.util.Set<com.artm.hibernate.beans.Notes> notes) {
		this.notes = notes;
	}

	public void addToNotes (com.artm.hibernate.beans.Notes notes) {
		if (null == getNotes()) setNotes(new java.util.TreeSet<com.artm.hibernate.beans.Notes>());
		getNotes().add(notes);
	}



	/**
	 * Return the value associated with the column: Logements
	 */
	public java.util.Set<com.artm.hibernate.beans.Logement> getLogements () {
		return logements;
	}

	/**
	 * Set the value related to the column: Logements
	 * @param logements the Logements value
	 */
	public void setLogements (java.util.Set<com.artm.hibernate.beans.Logement> logements) {
		this.logements = logements;
	}

	public void addToLogements (com.artm.hibernate.beans.Logement logement) {
		if (null == getLogements()) setLogements(new java.util.TreeSet<com.artm.hibernate.beans.Logement>());
		getLogements().add(logement);
	}



	/**
	 * Return the value associated with the column: Candidatures
	 */
	public java.util.Set<com.artm.hibernate.beans.Candidature> getCandidatures () {
		return candidatures;
	}

	/**
	 * Set the value related to the column: Candidatures
	 * @param candidatures the Candidatures value
	 */
	public void setCandidatures (java.util.Set<com.artm.hibernate.beans.Candidature> candidatures) {
		this.candidatures = candidatures;
	}

	public void addToCandidatures (com.artm.hibernate.beans.Candidature candidature) {
		if (null == getCandidatures()) setCandidatures(new java.util.TreeSet<com.artm.hibernate.beans.Candidature>());
		getCandidatures().add(candidature);
	}



	/**
	 * Return the value associated with the column: Sexes
	 */
	public java.util.Set<com.artm.hibernate.beans.Sexes> getSexes () {
		return sexes;
	}

	/**
	 * Set the value related to the column: Sexes
	 * @param sexes the Sexes value
	 */
	public void setSexes (java.util.Set<com.artm.hibernate.beans.Sexes> sexes) {
		this.sexes = sexes;
	}

	public void addToSexes (com.artm.hibernate.beans.Sexes sexes) {
		if (null == getSexes()) setSexes(new java.util.TreeSet<com.artm.hibernate.beans.Sexes>());
		getSexes().add(sexes);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.Etudiants)) return false;
		else {
			com.artm.hibernate.beans.Etudiants etudiants = (com.artm.hibernate.beans.Etudiants) obj;
			if (null == this.getId() || null == etudiants.getId()) return false;
			else return (this.getId().equals(etudiants.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}