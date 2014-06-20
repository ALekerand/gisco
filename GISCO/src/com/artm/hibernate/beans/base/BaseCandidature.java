package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the candidature table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="candidature"
 */

public abstract class BaseCandidature  implements Serializable {

	public static String REF = "Candidature";
	public static String PROP_LIB_CANDIDATURE = "LibCandidature";
	public static String PROP_ID = "Id";


	// constructors
	public BaseCandidature () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCandidature (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libCandidature;

	// collections
	private java.util.Set<com.artm.hibernate.beans.Etudiants> etudiants;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_CANDIDATURE"
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
	 * Return the value associated with the column: LIB_CANDIDATURE
	 */
	public java.lang.String getLibCandidature () {
		return libCandidature;
	}

	/**
	 * Set the value related to the column: LIB_CANDIDATURE
	 * @param libCandidature the LIB_CANDIDATURE value
	 */
	public void setLibCandidature (java.lang.String libCandidature) {
		this.libCandidature = libCandidature;
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
		if (!(obj instanceof com.artm.hibernate.beans.Candidature)) return false;
		else {
			com.artm.hibernate.beans.Candidature candidature = (com.artm.hibernate.beans.Candidature) obj;
			if (null == this.getId() || null == candidature.getId()) return false;
			else return (this.getId().equals(candidature.getId()));
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