package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the candidat table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="candidat"
 */

public abstract class BaseCandidat  implements Serializable {

	public static String REF = "Candidat";
	public static String PROP_CODESEXE = "Codesexe";
	public static String PROP_DATE_DIPLOME = "DateDiplome";
	public static String PROP_DATE_NAISSANCE = "DateNaissance";
	public static String PROP_CODENIVEAU = "Codeniveau";
	public static String PROP_NUM_VISTE = "NumViste";
	public static String PROP_CODE_DIPLOME = "CodeDiplome";
	public static String PROP_NOM_CANDIDAT = "NomCandidat";
	public static String PROP_CODEPAYS = "Codepays";
	public static String PROP_PRENOMS_CANDIDAT = "PrenomsCandidat";
	public static String PROP_PHOTO_CANDIDAT = "PhotoCandidat";
	public static String PROP_ID = "Id";
	public static String PROP_LIEU_NAISSANCE = "LieuNaissance";
	public static String PROP_CODENATIONALITE = "Codenationalite";


	// constructors
	public BaseCandidat () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCandidat (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCandidat (
		java.lang.Integer id,
		com.artm.hibernate.beans.Nationalites codenationalite,
		com.artm.hibernate.beans.Pays codepays,
		com.artm.hibernate.beans.Sexes codesexe,
		com.artm.hibernate.beans.Niveaux codeniveau,
		com.artm.hibernate.beans.Diplomes codeDiplome) {

		this.setId(id);
		this.setCodenationalite(codenationalite);
		this.setCodepays(codepays);
		this.setCodesexe(codesexe);
		this.setCodeniveau(codeniveau);
		this.setCodeDiplome(codeDiplome);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String nomCandidat;
	private java.lang.String prenomsCandidat;
	private java.util.Date dateNaissance;
	private java.lang.String lieuNaissance;
	private java.util.Date dateDiplome;
	private java.lang.String photoCandidat;

	// many to one
	private com.artm.hibernate.beans.Nationalites codenationalite;
	private com.artm.hibernate.beans.Visite numViste;
	private com.artm.hibernate.beans.Pays codepays;
	private com.artm.hibernate.beans.Sexes codesexe;
	private com.artm.hibernate.beans.Niveaux codeniveau;
	private com.artm.hibernate.beans.Diplomes codeDiplome;

	// collections
	private java.util.Set<com.artm.hibernate.beans.Visite> visites;
	private java.util.Set<com.artm.hibernate.beans.Inscriptionconcours> inscriptionconcours;
	private java.util.Set<com.artm.hibernate.beans.Noteconcours> noteconcours;
	private java.util.Set<com.artm.hibernate.beans.Salles> salles;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="NUM_CANDIDAT"
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
	 * Return the value associated with the column: NOM_CANDIDAT
	 */
	public java.lang.String getNomCandidat () {
		return nomCandidat;
	}

	/**
	 * Set the value related to the column: NOM_CANDIDAT
	 * @param nomCandidat the NOM_CANDIDAT value
	 */
	public void setNomCandidat (java.lang.String nomCandidat) {
		this.nomCandidat = nomCandidat;
	}



	/**
	 * Return the value associated with the column: PRENOMS_CANDIDAT
	 */
	public java.lang.String getPrenomsCandidat () {
		return prenomsCandidat;
	}

	/**
	 * Set the value related to the column: PRENOMS_CANDIDAT
	 * @param prenomsCandidat the PRENOMS_CANDIDAT value
	 */
	public void setPrenomsCandidat (java.lang.String prenomsCandidat) {
		this.prenomsCandidat = prenomsCandidat;
	}



	/**
	 * Return the value associated with the column: DATE_NAISSANCE
	 */
	public java.util.Date getDateNaissance () {
		return dateNaissance;
	}

	/**
	 * Set the value related to the column: DATE_NAISSANCE
	 * @param dateNaissance the DATE_NAISSANCE value
	 */
	public void setDateNaissance (java.util.Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}



	/**
	 * Return the value associated with the column: LIEU_NAISSANCE
	 */
	public java.lang.String getLieuNaissance () {
		return lieuNaissance;
	}

	/**
	 * Set the value related to the column: LIEU_NAISSANCE
	 * @param lieuNaissance the LIEU_NAISSANCE value
	 */
	public void setLieuNaissance (java.lang.String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}



	/**
	 * Return the value associated with the column: DATE_DIPLOME
	 */
	public java.util.Date getDateDiplome () {
		return dateDiplome;
	}

	/**
	 * Set the value related to the column: DATE_DIPLOME
	 * @param dateDiplome the DATE_DIPLOME value
	 */
	public void setDateDiplome (java.util.Date dateDiplome) {
		this.dateDiplome = dateDiplome;
	}



	/**
	 * Return the value associated with the column: PHOTO_CANDIDAT
	 */
	public java.lang.String getPhotoCandidat () {
		return photoCandidat;
	}

	/**
	 * Set the value related to the column: PHOTO_CANDIDAT
	 * @param photoCandidat the PHOTO_CANDIDAT value
	 */
	public void setPhotoCandidat (java.lang.String photoCandidat) {
		this.photoCandidat = photoCandidat;
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
	 * Return the value associated with the column: NUM_VISTE
	 */
	public com.artm.hibernate.beans.Visite getNumViste () {
		return numViste;
	}

	/**
	 * Set the value related to the column: NUM_VISTE
	 * @param numViste the NUM_VISTE value
	 */
	public void setNumViste (com.artm.hibernate.beans.Visite numViste) {
		this.numViste = numViste;
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
	 * Return the value associated with the column: CODESEXE
	 */
	public com.artm.hibernate.beans.Sexes getCodesexe () {
		return codesexe;
	}

	/**
	 * Set the value related to the column: CODESEXE
	 * @param codesexe the CODESEXE value
	 */
	public void setCodesexe (com.artm.hibernate.beans.Sexes codesexe) {
		this.codesexe = codesexe;
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
	 * Return the value associated with the column: Visites
	 */
	public java.util.Set<com.artm.hibernate.beans.Visite> getVisites () {
		return visites;
	}

	/**
	 * Set the value related to the column: Visites
	 * @param visites the Visites value
	 */
	public void setVisites (java.util.Set<com.artm.hibernate.beans.Visite> visites) {
		this.visites = visites;
	}

	public void addToVisites (com.artm.hibernate.beans.Visite visite) {
		if (null == getVisites()) setVisites(new java.util.TreeSet<com.artm.hibernate.beans.Visite>());
		getVisites().add(visite);
	}



	/**
	 * Return the value associated with the column: Inscriptionconcours
	 */
	public java.util.Set<com.artm.hibernate.beans.Inscriptionconcours> getInscriptionconcours () {
		return inscriptionconcours;
	}

	/**
	 * Set the value related to the column: Inscriptionconcours
	 * @param inscriptionconcours the Inscriptionconcours value
	 */
	public void setInscriptionconcours (java.util.Set<com.artm.hibernate.beans.Inscriptionconcours> inscriptionconcours) {
		this.inscriptionconcours = inscriptionconcours;
	}

	public void addToInscriptionconcours (com.artm.hibernate.beans.Inscriptionconcours inscriptionconcours) {
		if (null == getInscriptionconcours()) setInscriptionconcours(new java.util.TreeSet<com.artm.hibernate.beans.Inscriptionconcours>());
		getInscriptionconcours().add(inscriptionconcours);
	}



	/**
	 * Return the value associated with the column: Noteconcours
	 */
	public java.util.Set<com.artm.hibernate.beans.Noteconcours> getNoteconcours () {
		return noteconcours;
	}

	/**
	 * Set the value related to the column: Noteconcours
	 * @param noteconcours the Noteconcours value
	 */
	public void setNoteconcours (java.util.Set<com.artm.hibernate.beans.Noteconcours> noteconcours) {
		this.noteconcours = noteconcours;
	}

	public void addToNoteconcours (com.artm.hibernate.beans.Noteconcours noteconcours) {
		if (null == getNoteconcours()) setNoteconcours(new java.util.TreeSet<com.artm.hibernate.beans.Noteconcours>());
		getNoteconcours().add(noteconcours);
	}



	/**
	 * Return the value associated with the column: Salles
	 */
	public java.util.Set<com.artm.hibernate.beans.Salles> getSalles () {
		return salles;
	}

	/**
	 * Set the value related to the column: Salles
	 * @param salles the Salles value
	 */
	public void setSalles (java.util.Set<com.artm.hibernate.beans.Salles> salles) {
		this.salles = salles;
	}

	public void addToSalles (com.artm.hibernate.beans.Salles salles) {
		if (null == getSalles()) setSalles(new java.util.TreeSet<com.artm.hibernate.beans.Salles>());
		getSalles().add(salles);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.Candidat)) return false;
		else {
			com.artm.hibernate.beans.Candidat candidat = (com.artm.hibernate.beans.Candidat) obj;
			if (null == this.getId() || null == candidat.getId()) return false;
			else return (this.getId().equals(candidat.getId()));
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