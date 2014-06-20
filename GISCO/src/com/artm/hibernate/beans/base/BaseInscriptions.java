package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the inscriptions table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="inscriptions"
 */

public abstract class BaseInscriptions  implements Serializable {

	public static String REF = "Inscriptions";
	public static String PROP_CODE_ANNEES = "CodeAnnees";
	public static String PROP_CODE_REGIME = "CodeRegime";
	public static String PROP_CODE_SECTION = "CodeSection";
	public static String PROP_NUMETUDIANT = "Numetudiant";
	public static String PROP_DATE_INSCRIPTION = "DateInscription";
	public static String PROP_ID = "Id";


	// constructors
	public BaseInscriptions () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseInscriptions (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseInscriptions (
		java.lang.Integer id,
		com.artm.hibernate.beans.Regime codeRegime,
		com.artm.hibernate.beans.Section codeSection,
		com.artm.hibernate.beans.Etudiants numetudiant,
		com.artm.hibernate.beans.Annees codeAnnees) {

		this.setId(id);
		this.setCodeRegime(codeRegime);
		this.setCodeSection(codeSection);
		this.setNumetudiant(numetudiant);
		this.setCodeAnnees(codeAnnees);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.util.Date dateInscription;

	// many to one
	private com.artm.hibernate.beans.Regime codeRegime;
	private com.artm.hibernate.beans.Section codeSection;
	private com.artm.hibernate.beans.Etudiants numetudiant;
	private com.artm.hibernate.beans.Annees codeAnnees;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_INSCRIPTION"
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
	 * Return the value associated with the column: DATE_INSCRIPTION
	 */
	public java.util.Date getDateInscription () {
		return dateInscription;
	}

	/**
	 * Set the value related to the column: DATE_INSCRIPTION
	 * @param dateInscription the DATE_INSCRIPTION value
	 */
	public void setDateInscription (java.util.Date dateInscription) {
		this.dateInscription = dateInscription;
	}



	/**
	 * Return the value associated with the column: CODE_REGIME
	 */
	public com.artm.hibernate.beans.Regime getCodeRegime () {
		return codeRegime;
	}

	/**
	 * Set the value related to the column: CODE_REGIME
	 * @param codeRegime the CODE_REGIME value
	 */
	public void setCodeRegime (com.artm.hibernate.beans.Regime codeRegime) {
		this.codeRegime = codeRegime;
	}



	/**
	 * Return the value associated with the column: CODE_SECTION
	 */
	public com.artm.hibernate.beans.Section getCodeSection () {
		return codeSection;
	}

	/**
	 * Set the value related to the column: CODE_SECTION
	 * @param codeSection the CODE_SECTION value
	 */
	public void setCodeSection (com.artm.hibernate.beans.Section codeSection) {
		this.codeSection = codeSection;
	}



	/**
	 * Return the value associated with the column: NUMETUDIANT
	 */
	public com.artm.hibernate.beans.Etudiants getNumetudiant () {
		return numetudiant;
	}

	/**
	 * Set the value related to the column: NUMETUDIANT
	 * @param numetudiant the NUMETUDIANT value
	 */
	public void setNumetudiant (com.artm.hibernate.beans.Etudiants numetudiant) {
		this.numetudiant = numetudiant;
	}



	/**
	 * Return the value associated with the column: CODE_ANNEES
	 */
	public com.artm.hibernate.beans.Annees getCodeAnnees () {
		return codeAnnees;
	}

	/**
	 * Set the value related to the column: CODE_ANNEES
	 * @param codeAnnees the CODE_ANNEES value
	 */
	public void setCodeAnnees (com.artm.hibernate.beans.Annees codeAnnees) {
		this.codeAnnees = codeAnnees;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.Inscriptions)) return false;
		else {
			com.artm.hibernate.beans.Inscriptions inscriptions = (com.artm.hibernate.beans.Inscriptions) obj;
			if (null == this.getId() || null == inscriptions.getId()) return false;
			else return (this.getId().equals(inscriptions.getId()));
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