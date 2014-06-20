package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the tuteurs table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="tuteurs"
 */

public abstract class BaseTuteurs  implements Serializable {

	public static String REF = "Tuteurs";
	public static String PROP_NOM_PRENOMS_TUTEUR = "NomPrenomsTuteur";
	public static String PROP_ID = "Id";
	public static String PROP_CODE_ADRESSE = "CodeAdresse";


	// constructors
	public BaseTuteurs () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseTuteurs (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String nomPrenomsTuteur;

	// many to one
	private com.artm.hibernate.beans.Adresses codeAdresse;

	// collections
	private java.util.Set<com.artm.hibernate.beans.Etudiants> etudiants;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="NUMMERE2"
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
	 * Return the value associated with the column: CODE_ADRESSE
	 */
	public com.artm.hibernate.beans.Adresses getCodeAdresse () {
		return codeAdresse;
	}

	/**
	 * Set the value related to the column: CODE_ADRESSE
	 * @param codeAdresse the CODE_ADRESSE value
	 */
	public void setCodeAdresse (com.artm.hibernate.beans.Adresses codeAdresse) {
		this.codeAdresse = codeAdresse;
	}



	/**
	 * Return the value associated with the column: Etudiants
	 */
	public java.util.Set<com.artm.hibernate.beans.Etudiants> getEtudiants () {
		return etudiants;
	}

	/**
	 * Set the value related to the column: Etudiants
	 * @param etudiants the Etudiants value
	 */
	public void setEtudiants (java.util.Set<com.artm.hibernate.beans.Etudiants> etudiants) {
		this.etudiants = etudiants;
	}

	public void addToEtudiants (com.artm.hibernate.beans.Etudiants etudiants) {
		if (null == getEtudiants()) setEtudiants(new java.util.TreeSet<com.artm.hibernate.beans.Etudiants>());
		getEtudiants().add(etudiants);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.Tuteurs)) return false;
		else {
			com.artm.hibernate.beans.Tuteurs tuteurs = (com.artm.hibernate.beans.Tuteurs) obj;
			if (null == this.getId() || null == tuteurs.getId()) return false;
			else return (this.getId().equals(tuteurs.getId()));
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