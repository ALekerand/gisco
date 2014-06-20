package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the loger table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="loger"
 */

public abstract class BaseLoger  implements Serializable {

	public static String REF = "Loger";
	public static String PROP_ID = "Id";
	public static String PROP_ANNEE_LOGEMENT = "AnneeLogement";


	// constructors
	public BaseLoger () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseLoger (com.artm.hibernate.beans.LogerPK id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private com.artm.hibernate.beans.LogerPK id;

	// fields
	private java.lang.String anneeLogement;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     */
	public com.artm.hibernate.beans.LogerPK getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (com.artm.hibernate.beans.LogerPK id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: ANNEE_LOGEMENT
	 */
	public java.lang.String getAnneeLogement () {
		return anneeLogement;
	}

	/**
	 * Set the value related to the column: ANNEE_LOGEMENT
	 * @param anneeLogement the ANNEE_LOGEMENT value
	 */
	public void setAnneeLogement (java.lang.String anneeLogement) {
		this.anneeLogement = anneeLogement;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.Loger)) return false;
		else {
			com.artm.hibernate.beans.Loger loger = (com.artm.hibernate.beans.Loger) obj;
			if (null == this.getId() || null == loger.getId()) return false;
			else return (this.getId().equals(loger.getId()));
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