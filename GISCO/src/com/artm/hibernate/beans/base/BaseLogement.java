package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the logement table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="logement"
 */

public abstract class BaseLogement  implements Serializable {

	public static String REF = "Logement";
	public static String PROP_ABREV_AMPUS_LOGE = "AbrevAmpusLoge";
	public static String PROP_ID = "Id";
	public static String PROP_LIB_DETAIL_CAMPUS_LOGE = "LibDetailCampusLoge";
	public static String PROP_LIB_CAMPUS_LOGE = "LibCampusLoge";


	// constructors
	public BaseLogement () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseLogement (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libCampusLoge;
	private java.lang.String libDetailCampusLoge;
	private java.lang.String abrevAmpusLoge;

	// collections
	private java.util.Set<com.artm.hibernate.beans.Etudiants> etudiants;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_LOGE"
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
	 * Return the value associated with the column: LIB_CAMPUS_LOGE
	 */
	public java.lang.String getLibCampusLoge () {
		return libCampusLoge;
	}

	/**
	 * Set the value related to the column: LIB_CAMPUS_LOGE
	 * @param libCampusLoge the LIB_CAMPUS_LOGE value
	 */
	public void setLibCampusLoge (java.lang.String libCampusLoge) {
		this.libCampusLoge = libCampusLoge;
	}



	/**
	 * Return the value associated with the column: LIB_DETAIL_CAMPUS_LOGE
	 */
	public java.lang.String getLibDetailCampusLoge () {
		return libDetailCampusLoge;
	}

	/**
	 * Set the value related to the column: LIB_DETAIL_CAMPUS_LOGE
	 * @param libDetailCampusLoge the LIB_DETAIL_CAMPUS_LOGE value
	 */
	public void setLibDetailCampusLoge (java.lang.String libDetailCampusLoge) {
		this.libDetailCampusLoge = libDetailCampusLoge;
	}



	/**
	 * Return the value associated with the column: ABREV_AMPUS_LOGE
	 */
	public java.lang.String getAbrevAmpusLoge () {
		return abrevAmpusLoge;
	}

	/**
	 * Set the value related to the column: ABREV_AMPUS_LOGE
	 * @param abrevAmpusLoge the ABREV_AMPUS_LOGE value
	 */
	public void setAbrevAmpusLoge (java.lang.String abrevAmpusLoge) {
		this.abrevAmpusLoge = abrevAmpusLoge;
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
		if (!(obj instanceof com.artm.hibernate.beans.Logement)) return false;
		else {
			com.artm.hibernate.beans.Logement logement = (com.artm.hibernate.beans.Logement) obj;
			if (null == this.getId() || null == logement.getId()) return false;
			else return (this.getId().equals(logement.getId()));
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