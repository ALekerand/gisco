package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the adresses table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="adresses"
 */

public abstract class BaseAdresses  implements Serializable {

	public static String REF = "Adresses";
	public static String PROP_EMAIL = "Email";
	public static String PROP_ID = "Id";
	public static String PROP_TEL1 = "Tel1";
	public static String PROP_TEL2 = "Tel2";
	public static String PROP_BOITE_POSTALE = "BoitePostale";


	// constructors
	public BaseAdresses () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseAdresses (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String boitePostale;
	private java.lang.String email;
	private java.lang.String tel1;
	private java.lang.String tel2;

	// collections
	private java.util.Set<com.artm.hibernate.beans.Tuteurs> tuteurs;
	private java.util.Set<com.artm.hibernate.beans.Peres> peres;
	private java.util.Set<com.artm.hibernate.beans.Meres> meres;
	private java.util.Set<com.artm.hibernate.beans.Etudiants> etudiants;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_ADRESSE"
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
	 * Return the value associated with the column: BOITE_POSTALE
	 */
	public java.lang.String getBoitePostale () {
		return boitePostale;
	}

	/**
	 * Set the value related to the column: BOITE_POSTALE
	 * @param boitePostale the BOITE_POSTALE value
	 */
	public void setBoitePostale (java.lang.String boitePostale) {
		this.boitePostale = boitePostale;
	}



	/**
	 * Return the value associated with the column: EMAIL
	 */
	public java.lang.String getEmail () {
		return email;
	}

	/**
	 * Set the value related to the column: EMAIL
	 * @param email the EMAIL value
	 */
	public void setEmail (java.lang.String email) {
		this.email = email;
	}



	/**
	 * Return the value associated with the column: TEL1
	 */
	public java.lang.String getTel1 () {
		return tel1;
	}

	/**
	 * Set the value related to the column: TEL1
	 * @param tel1 the TEL1 value
	 */
	public void setTel1 (java.lang.String tel1) {
		this.tel1 = tel1;
	}



	/**
	 * Return the value associated with the column: TEL2
	 */
	public java.lang.String getTel2 () {
		return tel2;
	}

	/**
	 * Set the value related to the column: TEL2
	 * @param tel2 the TEL2 value
	 */
	public void setTel2 (java.lang.String tel2) {
		this.tel2 = tel2;
	}



	/**
	 * Return the value associated with the column: Tuteurs
	 */
	public java.util.Set<com.artm.hibernate.beans.Tuteurs> getTuteurs () {
		return tuteurs;
	}

	/**
	 * Set the value related to the column: Tuteurs
	 * @param tuteurs the Tuteurs value
	 */
	public void setTuteurs (java.util.Set<com.artm.hibernate.beans.Tuteurs> tuteurs) {
		this.tuteurs = tuteurs;
	}

	public void addToTuteurs (com.artm.hibernate.beans.Tuteurs tuteurs) {
		if (null == getTuteurs()) setTuteurs(new java.util.TreeSet<com.artm.hibernate.beans.Tuteurs>());
		getTuteurs().add(tuteurs);
	}



	/**
	 * Return the value associated with the column: Peres
	 */
	public java.util.Set<com.artm.hibernate.beans.Peres> getPeres () {
		return peres;
	}

	/**
	 * Set the value related to the column: Peres
	 * @param peres the Peres value
	 */
	public void setPeres (java.util.Set<com.artm.hibernate.beans.Peres> peres) {
		this.peres = peres;
	}

	public void addToPeres (com.artm.hibernate.beans.Peres peres) {
		if (null == getPeres()) setPeres(new java.util.TreeSet<com.artm.hibernate.beans.Peres>());
		getPeres().add(peres);
	}



	/**
	 * Return the value associated with the column: Meres
	 */
	public java.util.Set<com.artm.hibernate.beans.Meres> getMeres () {
		return meres;
	}

	/**
	 * Set the value related to the column: Meres
	 * @param meres the Meres value
	 */
	public void setMeres (java.util.Set<com.artm.hibernate.beans.Meres> meres) {
		this.meres = meres;
	}

	public void addToMeres (com.artm.hibernate.beans.Meres meres) {
		if (null == getMeres()) setMeres(new java.util.TreeSet<com.artm.hibernate.beans.Meres>());
		getMeres().add(meres);
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
		if (!(obj instanceof com.artm.hibernate.beans.Adresses)) return false;
		else {
			com.artm.hibernate.beans.Adresses adresses = (com.artm.hibernate.beans.Adresses) obj;
			if (null == this.getId() || null == adresses.getId()) return false;
			else return (this.getId().equals(adresses.getId()));
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