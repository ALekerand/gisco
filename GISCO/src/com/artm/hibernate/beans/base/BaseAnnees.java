package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the annees table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="annees"
 */

public abstract class BaseAnnees  implements Serializable {

	public static String REF = "Annees";
	public static String PROP_LIB_ANNEE_SCOLAIRE = "LibAnneeScolaire";
	public static String PROP_SESSION_EXAMEN = "SessionExamen";
	public static String PROP_ANNEES_DEBUT = "AnneesDebut";
	public static String PROP_ID = "Id";
	public static String PROP_ANNEES_FIN = "AnneesFin";
	public static String PROP_DATE_COMMISSION = "DateCommission";


	// constructors
	public BaseAnnees () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseAnnees (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.Integer anneesDebut;
	private java.lang.Integer anneesFin;
	private java.lang.String sessionExamen;
	private java.util.Date dateCommission;
	private java.lang.String libAnneeScolaire;

	// collections
	private java.util.Set<com.artm.hibernate.beans.Inscriptions> inscriptions;
	private java.util.Set<com.artm.hibernate.beans.Scolarites> scolarites;
	private java.util.Set<com.artm.hibernate.beans.Absence> absences;
	private java.util.Set<com.artm.hibernate.beans.Versement> versements;
	private java.util.Set<com.artm.hibernate.beans.Notes> notes;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_ANNEES"
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
	 * Return the value associated with the column: ANNEES_DEBUT
	 */
	public java.lang.Integer getAnneesDebut () {
		return anneesDebut;
	}

	/**
	 * Set the value related to the column: ANNEES_DEBUT
	 * @param anneesDebut the ANNEES_DEBUT value
	 */
	public void setAnneesDebut (java.lang.Integer anneesDebut) {
		this.anneesDebut = anneesDebut;
	}



	/**
	 * Return the value associated with the column: ANNEES_FIN
	 */
	public java.lang.Integer getAnneesFin () {
		return anneesFin;
	}

	/**
	 * Set the value related to the column: ANNEES_FIN
	 * @param anneesFin the ANNEES_FIN value
	 */
	public void setAnneesFin (java.lang.Integer anneesFin) {
		this.anneesFin = anneesFin;
	}



	/**
	 * Return the value associated with the column: SESSION_EXAMEN
	 */
	public java.lang.String getSessionExamen () {
		return sessionExamen;
	}

	/**
	 * Set the value related to the column: SESSION_EXAMEN
	 * @param sessionExamen the SESSION_EXAMEN value
	 */
	public void setSessionExamen (java.lang.String sessionExamen) {
		this.sessionExamen = sessionExamen;
	}



	/**
	 * Return the value associated with the column: DATE_COMMISSION
	 */
	public java.util.Date getDateCommission () {
		return dateCommission;
	}

	/**
	 * Set the value related to the column: DATE_COMMISSION
	 * @param dateCommission the DATE_COMMISSION value
	 */
	public void setDateCommission (java.util.Date dateCommission) {
		this.dateCommission = dateCommission;
	}



	/**
	 * Return the value associated with the column: LIB_ANNEE_SCOLAIRE
	 */
	public java.lang.String getLibAnneeScolaire () {
		return libAnneeScolaire;
	}

	/**
	 * Set the value related to the column: LIB_ANNEE_SCOLAIRE
	 * @param libAnneeScolaire the LIB_ANNEE_SCOLAIRE value
	 */
	public void setLibAnneeScolaire (java.lang.String libAnneeScolaire) {
		this.libAnneeScolaire = libAnneeScolaire;
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.Annees)) return false;
		else {
			com.artm.hibernate.beans.Annees annees = (com.artm.hibernate.beans.Annees) obj;
			if (null == this.getId() || null == annees.getId()) return false;
			else return (this.getId().equals(annees.getId()));
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