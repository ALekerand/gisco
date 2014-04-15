package hibernate.beans.base;

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
	public static String PROP_MLE = "Mle";
	public static String PROP_CODEPAYS = "Codepays";
	public static String PROP_CODENATIONALITE = "Codenationalite";
	public static String PROP_CODE_DIPLOME = "CodeDiplome";
	public static String PROP_CODE_ADRESSE = "CodeAdresse";
	public static String PROP_DATENAIS = "Datenais";
	public static String PROP_NUMMERE2 = "Nummere2";
	public static String PROP_PHOTO = "Photo";
	public static String PROP_CODEMATRIMONIALE = "Codematrimoniale";
	public static String PROP_NOM = "Nom";
	public static String PROP_NBSOEURS = "Nbsoeurs";
	public static String PROP_PRENOMS = "Prenoms";
	public static String PROP_NUMCNI = "Numcni";
	public static String PROP_ID = "Id";
	public static String PROP_NBENFANTS = "Nbenfants";
	public static String PROP_LIEUNAIS = "Lieunais";
	public static String PROP_NUM_PERE = "NumPere";
	public static String PROP_NBFRERES = "Nbfreres";
	public static String PROP_CODENIVEAU = "Codeniveau";
	public static String PROP_CODESANTE = "Codesante";
	public static String PROP_NUM_MERE = "NumMere";


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
		hibernate.beans.Nationalites codenationalite,
		hibernate.beans.Pays codepays,
		hibernate.beans.Santes codesante,
		hibernate.beans.Niveaux codeniveau,
		hibernate.beans.Matrimoniales codematrimoniale) {

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
	private java.lang.Integer nbenfants;
	private java.lang.Integer nbsoeurs;
	private java.lang.Integer nbfreres;
	private java.lang.String numcni;
	private java.lang.String photo;

	// many to one
	private hibernate.beans.Meres numMere;
	private hibernate.beans.Nationalites codenationalite;
	private hibernate.beans.Pays codepays;
	private hibernate.beans.Tuteurs nummere2;
	private hibernate.beans.Santes codesante;
	private hibernate.beans.Niveaux codeniveau;
	private hibernate.beans.Diplomes codeDiplome;
	private hibernate.beans.Matrimoniales codematrimoniale;
	private hibernate.beans.Adresses codeAdresse;
	private hibernate.beans.Peres numPere;

	// collections
	private java.util.Set<hibernate.beans.Inscriptions> inscriptions;
	private java.util.Set<hibernate.beans.Scolarites> scolarites;
	private java.util.Set<hibernate.beans.Notexam> notexams;
	private java.util.Set<hibernate.beans.Absence> absences;
	private java.util.Set<hibernate.beans.Versement> versements;
	private java.util.Set<hibernate.beans.Notes> notes;
	private java.util.Set<hibernate.beans.Logement> logements;
	private java.util.Set<hibernate.beans.Candidature> candidatures;
	private java.util.Set<hibernate.beans.Sexes> sexes;



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
	 * Return the value associated with the column: NUM_MERE
	 */
	public hibernate.beans.Meres getNumMere () {
		return numMere;
	}

	/**
	 * Set the value related to the column: NUM_MERE
	 * @param numMere the NUM_MERE value
	 */
	public void setNumMere (hibernate.beans.Meres numMere) {
		this.numMere = numMere;
	}



	/**
	 * Return the value associated with the column: CODENATIONALITE
	 */
	public hibernate.beans.Nationalites getCodenationalite () {
		return codenationalite;
	}

	/**
	 * Set the value related to the column: CODENATIONALITE
	 * @param codenationalite the CODENATIONALITE value
	 */
	public void setCodenationalite (hibernate.beans.Nationalites codenationalite) {
		this.codenationalite = codenationalite;
	}



	/**
	 * Return the value associated with the column: CODEPAYS
	 */
	public hibernate.beans.Pays getCodepays () {
		return codepays;
	}

	/**
	 * Set the value related to the column: CODEPAYS
	 * @param codepays the CODEPAYS value
	 */
	public void setCodepays (hibernate.beans.Pays codepays) {
		this.codepays = codepays;
	}



	/**
	 * Return the value associated with the column: NUMMERE2
	 */
	public hibernate.beans.Tuteurs getNummere2 () {
		return nummere2;
	}

	/**
	 * Set the value related to the column: NUMMERE2
	 * @param nummere2 the NUMMERE2 value
	 */
	public void setNummere2 (hibernate.beans.Tuteurs nummere2) {
		this.nummere2 = nummere2;
	}



	/**
	 * Return the value associated with the column: CODESANTE
	 */
	public hibernate.beans.Santes getCodesante () {
		return codesante;
	}

	/**
	 * Set the value related to the column: CODESANTE
	 * @param codesante the CODESANTE value
	 */
	public void setCodesante (hibernate.beans.Santes codesante) {
		this.codesante = codesante;
	}



	/**
	 * Return the value associated with the column: CODENIVEAU
	 */
	public hibernate.beans.Niveaux getCodeniveau () {
		return codeniveau;
	}

	/**
	 * Set the value related to the column: CODENIVEAU
	 * @param codeniveau the CODENIVEAU value
	 */
	public void setCodeniveau (hibernate.beans.Niveaux codeniveau) {
		this.codeniveau = codeniveau;
	}



	/**
	 * Return the value associated with the column: CODE_DIPLOME
	 */
	public hibernate.beans.Diplomes getCodeDiplome () {
		return codeDiplome;
	}

	/**
	 * Set the value related to the column: CODE_DIPLOME
	 * @param codeDiplome the CODE_DIPLOME value
	 */
	public void setCodeDiplome (hibernate.beans.Diplomes codeDiplome) {
		this.codeDiplome = codeDiplome;
	}



	/**
	 * Return the value associated with the column: CODEMATRIMONIALE
	 */
	public hibernate.beans.Matrimoniales getCodematrimoniale () {
		return codematrimoniale;
	}

	/**
	 * Set the value related to the column: CODEMATRIMONIALE
	 * @param codematrimoniale the CODEMATRIMONIALE value
	 */
	public void setCodematrimoniale (hibernate.beans.Matrimoniales codematrimoniale) {
		this.codematrimoniale = codematrimoniale;
	}



	/**
	 * Return the value associated with the column: CODE_ADRESSE
	 */
	public hibernate.beans.Adresses getCodeAdresse () {
		return codeAdresse;
	}

	/**
	 * Set the value related to the column: CODE_ADRESSE
	 * @param codeAdresse the CODE_ADRESSE value
	 */
	public void setCodeAdresse (hibernate.beans.Adresses codeAdresse) {
		this.codeAdresse = codeAdresse;
	}



	/**
	 * Return the value associated with the column: NUM_PERE
	 */
	public hibernate.beans.Peres getNumPere () {
		return numPere;
	}

	/**
	 * Set the value related to the column: NUM_PERE
	 * @param numPere the NUM_PERE value
	 */
	public void setNumPere (hibernate.beans.Peres numPere) {
		this.numPere = numPere;
	}



	/**
	 * Return the value associated with the column: Inscriptions
	 */
	public java.util.Set<hibernate.beans.Inscriptions> getInscriptions () {
		return inscriptions;
	}

	/**
	 * Set the value related to the column: Inscriptions
	 * @param inscriptions the Inscriptions value
	 */
	public void setInscriptions (java.util.Set<hibernate.beans.Inscriptions> inscriptions) {
		this.inscriptions = inscriptions;
	}

	public void addToInscriptions (hibernate.beans.Inscriptions inscriptions) {
		if (null == getInscriptions()) setInscriptions(new java.util.TreeSet<hibernate.beans.Inscriptions>());
		getInscriptions().add(inscriptions);
	}



	/**
	 * Return the value associated with the column: Scolarites
	 */
	public java.util.Set<hibernate.beans.Scolarites> getScolarites () {
		return scolarites;
	}

	/**
	 * Set the value related to the column: Scolarites
	 * @param scolarites the Scolarites value
	 */
	public void setScolarites (java.util.Set<hibernate.beans.Scolarites> scolarites) {
		this.scolarites = scolarites;
	}

	public void addToScolarites (hibernate.beans.Scolarites scolarites) {
		if (null == getScolarites()) setScolarites(new java.util.TreeSet<hibernate.beans.Scolarites>());
		getScolarites().add(scolarites);
	}



	/**
	 * Return the value associated with the column: Notexams
	 */
	public java.util.Set<hibernate.beans.Notexam> getNotexams () {
		return notexams;
	}

	/**
	 * Set the value related to the column: Notexams
	 * @param notexams the Notexams value
	 */
	public void setNotexams (java.util.Set<hibernate.beans.Notexam> notexams) {
		this.notexams = notexams;
	}

	public void addToNotexams (hibernate.beans.Notexam notexam) {
		if (null == getNotexams()) setNotexams(new java.util.TreeSet<hibernate.beans.Notexam>());
		getNotexams().add(notexam);
	}



	/**
	 * Return the value associated with the column: Absences
	 */
	public java.util.Set<hibernate.beans.Absence> getAbsences () {
		return absences;
	}

	/**
	 * Set the value related to the column: Absences
	 * @param absences the Absences value
	 */
	public void setAbsences (java.util.Set<hibernate.beans.Absence> absences) {
		this.absences = absences;
	}

	public void addToAbsences (hibernate.beans.Absence absence) {
		if (null == getAbsences()) setAbsences(new java.util.TreeSet<hibernate.beans.Absence>());
		getAbsences().add(absence);
	}



	/**
	 * Return the value associated with the column: Versements
	 */
	public java.util.Set<hibernate.beans.Versement> getVersements () {
		return versements;
	}

	/**
	 * Set the value related to the column: Versements
	 * @param versements the Versements value
	 */
	public void setVersements (java.util.Set<hibernate.beans.Versement> versements) {
		this.versements = versements;
	}

	public void addToVersements (hibernate.beans.Versement versement) {
		if (null == getVersements()) setVersements(new java.util.TreeSet<hibernate.beans.Versement>());
		getVersements().add(versement);
	}



	/**
	 * Return the value associated with the column: Notes
	 */
	public java.util.Set<hibernate.beans.Notes> getNotes () {
		return notes;
	}

	/**
	 * Set the value related to the column: Notes
	 * @param notes the Notes value
	 */
	public void setNotes (java.util.Set<hibernate.beans.Notes> notes) {
		this.notes = notes;
	}

	public void addToNotes (hibernate.beans.Notes notes) {
		if (null == getNotes()) setNotes(new java.util.TreeSet<hibernate.beans.Notes>());
		getNotes().add(notes);
	}



	/**
	 * Return the value associated with the column: Logements
	 */
	public java.util.Set<hibernate.beans.Logement> getLogements () {
		return logements;
	}

	/**
	 * Set the value related to the column: Logements
	 * @param logements the Logements value
	 */
	public void setLogements (java.util.Set<hibernate.beans.Logement> logements) {
		this.logements = logements;
	}

	public void addToLogements (hibernate.beans.Logement logement) {
		if (null == getLogements()) setLogements(new java.util.TreeSet<hibernate.beans.Logement>());
		getLogements().add(logement);
	}



	/**
	 * Return the value associated with the column: Candidatures
	 */
	public java.util.Set<hibernate.beans.Candidature> getCandidatures () {
		return candidatures;
	}

	/**
	 * Set the value related to the column: Candidatures
	 * @param candidatures the Candidatures value
	 */
	public void setCandidatures (java.util.Set<hibernate.beans.Candidature> candidatures) {
		this.candidatures = candidatures;
	}

	public void addToCandidatures (hibernate.beans.Candidature candidature) {
		if (null == getCandidatures()) setCandidatures(new java.util.TreeSet<hibernate.beans.Candidature>());
		getCandidatures().add(candidature);
	}



	/**
	 * Return the value associated with the column: Sexes
	 */
	public java.util.Set<hibernate.beans.Sexes> getSexes () {
		return sexes;
	}

	/**
	 * Set the value related to the column: Sexes
	 * @param sexes the Sexes value
	 */
	public void setSexes (java.util.Set<hibernate.beans.Sexes> sexes) {
		this.sexes = sexes;
	}

	public void addToSexes (hibernate.beans.Sexes sexes) {
		if (null == getSexes()) setSexes(new java.util.TreeSet<hibernate.beans.Sexes>());
		getSexes().add(sexes);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.Etudiants)) return false;
		else {
			hibernate.beans.Etudiants etudiants = (hibernate.beans.Etudiants) obj;
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