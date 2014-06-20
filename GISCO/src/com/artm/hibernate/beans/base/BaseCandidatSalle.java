package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the candidat_salle table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="candidat_salle"
 */

public abstract class BaseCandidatSalle  implements Serializable {

	public static String REF = "CandidatSalle";
	public static String PROP_ID = "Id";
	public static String PROP_DATE_CANDIDAT_SALLE = "DateCandidatSalle";


	// constructors
	public BaseCandidatSalle () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCandidatSalle (com.artm.hibernate.beans.CandidatSallePK id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private com.artm.hibernate.beans.CandidatSallePK id;

	// fields
	private java.util.Date dateCandidatSalle;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     */
	public com.artm.hibernate.beans.CandidatSallePK getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (com.artm.hibernate.beans.CandidatSallePK id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: DATE_CANDIDAT_SALLE
	 */
	public java.util.Date getDateCandidatSalle () {
		return dateCandidatSalle;
	}

	/**
	 * Set the value related to the column: DATE_CANDIDAT_SALLE
	 * @param dateCandidatSalle the DATE_CANDIDAT_SALLE value
	 */
	public void setDateCandidatSalle (java.util.Date dateCandidatSalle) {
		this.dateCandidatSalle = dateCandidatSalle;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.CandidatSalle)) return false;
		else {
			com.artm.hibernate.beans.CandidatSalle candidatSalle = (com.artm.hibernate.beans.CandidatSalle) obj;
			if (null == this.getId() || null == candidatSalle.getId()) return false;
			else return (this.getId().equals(candidatSalle.getId()));
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