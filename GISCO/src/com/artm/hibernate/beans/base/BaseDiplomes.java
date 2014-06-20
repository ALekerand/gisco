package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the diplomes table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="diplomes"
 */

public abstract class BaseDiplomes  implements Serializable {

	public static String REF = "Diplomes";
	public static String PROP_ABREV_DIPLOME = "AbrevDiplome";
	public static String PROP_ID = "Id";
	public static String PROP_LIB_DIPLOME = "LibDiplome";


	// constructors
	public BaseDiplomes () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseDiplomes (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libDiplome;
	private java.lang.String abrevDiplome;

	// collections
	private java.util.Set<com.artm.hibernate.beans.Candidat> candidats;
	private java.util.Set<com.artm.hibernate.beans.Etudiants> etudiants;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_DIPLOME"
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
	 * Return the value associated with the column: LIB_DIPLOME
	 */
	public java.lang.String getLibDiplome () {
		return libDiplome;
	}

	/**
	 * Set the value related to the column: LIB_DIPLOME
	 * @param libDiplome the LIB_DIPLOME value
	 */
	public void setLibDiplome (java.lang.String libDiplome) {
		this.libDiplome = libDiplome;
	}



	/**
	 * Return the value associated with the column: ABREV_DIPLOME
	 */
	public java.lang.String getAbrevDiplome () {
		return abrevDiplome;
	}

	/**
	 * Set the value related to the column: ABREV_DIPLOME
	 * @param abrevDiplome the ABREV_DIPLOME value
	 */
	public void setAbrevDiplome (java.lang.String abrevDiplome) {
		this.abrevDiplome = abrevDiplome;
	}



	/**
	 * Return the value associated with the column: Candidats
	 */
	public java.util.Set<com.artm.hibernate.beans.Candidat> getCandidats () {
		return candidats;
	}

	/**
	 * Set the value related to the column: Candidats
	 * @param candidats the Candidats value
	 */
	public void setCandidats (java.util.Set<com.artm.hibernate.beans.Candidat> candidats) {
		this.candidats = candidats;
	}

	public void addToCandidats (com.artm.hibernate.beans.Candidat candidat) {
		if (null == getCandidats()) setCandidats(new java.util.TreeSet<com.artm.hibernate.beans.Candidat>());
		getCandidats().add(candidat);
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
		if (!(obj instanceof com.artm.hibernate.beans.Diplomes)) return false;
		else {
			com.artm.hibernate.beans.Diplomes diplomes = (com.artm.hibernate.beans.Diplomes) obj;
			if (null == this.getId() || null == diplomes.getId()) return false;
			else return (this.getId().equals(diplomes.getId()));
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