package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the anneeconcours table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="anneeconcours"
 */

public abstract class BaseAnneeconcours  implements Serializable {

	public static String REF = "Anneeconcours";
	public static String PROP_NBREPLACES_CONCOURS = "NbreplacesConcours";
	public static String PROP_CODEPAYS = "Codepays";
	public static String PROP_CODE_CONCOURS = "CodeConcours";
	public static String PROP_DROIT_VISITE = "DroitVisite";
	public static String PROP_LIB_ANNEE_CONCOURS = "LibAnneeConcours";
	public static String PROP_DROIT_CONCOURS = "DroitConcours";
	public static String PROP_ID = "Id";
	public static String PROP_DATE_COMPOSITION = "DateComposition";
	public static String PROP_ANNEE_CONCOURS_FIN = "AnneeConcoursFin";
	public static String PROP_ANNEE_CONCOURS_DEBUT = "AnneeConcoursDebut";


	// constructors
	public BaseAnneeconcours () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseAnneeconcours (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseAnneeconcours (
		java.lang.Integer id,
		com.artm.hibernate.beans.Pays codepays,
		com.artm.hibernate.beans.Concours codeConcours) {

		this.setId(id);
		this.setCodepays(codepays);
		this.setCodeConcours(codeConcours);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.Integer anneeConcoursDebut;
	private java.lang.Integer anneeConcoursFin;
	private java.lang.String libAnneeConcours;
	private java.util.Date dateComposition;
	private java.math.BigDecimal droitConcours;
	private java.math.BigDecimal droitVisite;
	private java.lang.Integer nbreplacesConcours;

	// many to one
	private com.artm.hibernate.beans.Pays codepays;
	private com.artm.hibernate.beans.Concours codeConcours;

	// collections
	private java.util.Set<com.artm.hibernate.beans.Inscriptionconcours> inscriptionconcours;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_ANNEES_CONCOURS"
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
	 * Return the value associated with the column: ANNEE_CONCOURS_DEBUT
	 */
	public java.lang.Integer getAnneeConcoursDebut () {
		return anneeConcoursDebut;
	}

	/**
	 * Set the value related to the column: ANNEE_CONCOURS_DEBUT
	 * @param anneeConcoursDebut the ANNEE_CONCOURS_DEBUT value
	 */
	public void setAnneeConcoursDebut (java.lang.Integer anneeConcoursDebut) {
		this.anneeConcoursDebut = anneeConcoursDebut;
	}



	/**
	 * Return the value associated with the column: ANNEE_CONCOURS_FIN
	 */
	public java.lang.Integer getAnneeConcoursFin () {
		return anneeConcoursFin;
	}

	/**
	 * Set the value related to the column: ANNEE_CONCOURS_FIN
	 * @param anneeConcoursFin the ANNEE_CONCOURS_FIN value
	 */
	public void setAnneeConcoursFin (java.lang.Integer anneeConcoursFin) {
		this.anneeConcoursFin = anneeConcoursFin;
	}



	/**
	 * Return the value associated with the column: LIB_ANNEE_CONCOURS
	 */
	public java.lang.String getLibAnneeConcours () {
		return libAnneeConcours;
	}

	/**
	 * Set the value related to the column: LIB_ANNEE_CONCOURS
	 * @param libAnneeConcours the LIB_ANNEE_CONCOURS value
	 */
	public void setLibAnneeConcours (java.lang.String libAnneeConcours) {
		this.libAnneeConcours = libAnneeConcours;
	}



	/**
	 * Return the value associated with the column: DATE_COMPOSITION
	 */
	public java.util.Date getDateComposition () {
		return dateComposition;
	}

	/**
	 * Set the value related to the column: DATE_COMPOSITION
	 * @param dateComposition the DATE_COMPOSITION value
	 */
	public void setDateComposition (java.util.Date dateComposition) {
		this.dateComposition = dateComposition;
	}



	/**
	 * Return the value associated with the column: DROIT_CONCOURS
	 */
	public java.math.BigDecimal getDroitConcours () {
		return droitConcours;
	}

	/**
	 * Set the value related to the column: DROIT_CONCOURS
	 * @param droitConcours the DROIT_CONCOURS value
	 */
	public void setDroitConcours (java.math.BigDecimal droitConcours) {
		this.droitConcours = droitConcours;
	}



	/**
	 * Return the value associated with the column: DROIT_VISITE
	 */
	public java.math.BigDecimal getDroitVisite () {
		return droitVisite;
	}

	/**
	 * Set the value related to the column: DROIT_VISITE
	 * @param droitVisite the DROIT_VISITE value
	 */
	public void setDroitVisite (java.math.BigDecimal droitVisite) {
		this.droitVisite = droitVisite;
	}



	/**
	 * Return the value associated with the column: NBREPLACES_CONCOURS
	 */
	public java.lang.Integer getNbreplacesConcours () {
		return nbreplacesConcours;
	}

	/**
	 * Set the value related to the column: NBREPLACES_CONCOURS
	 * @param nbreplacesConcours the NBREPLACES_CONCOURS value
	 */
	public void setNbreplacesConcours (java.lang.Integer nbreplacesConcours) {
		this.nbreplacesConcours = nbreplacesConcours;
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
	 * Return the value associated with the column: CODE_CONCOURS
	 */
	public com.artm.hibernate.beans.Concours getCodeConcours () {
		return codeConcours;
	}

	/**
	 * Set the value related to the column: CODE_CONCOURS
	 * @param codeConcours the CODE_CONCOURS value
	 */
	public void setCodeConcours (com.artm.hibernate.beans.Concours codeConcours) {
		this.codeConcours = codeConcours;
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.Anneeconcours)) return false;
		else {
			com.artm.hibernate.beans.Anneeconcours anneeconcours = (com.artm.hibernate.beans.Anneeconcours) obj;
			if (null == this.getId() || null == anneeconcours.getId()) return false;
			else return (this.getId().equals(anneeconcours.getId()));
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