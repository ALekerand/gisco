package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the origine table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="origine"
 */

public abstract class BaseOrigine  implements Serializable {

	public static String REF = "Origine";
	public static String PROP_ID = "Id";
	public static String PROP_LIB_ORIGINE = "LibOrigine";


	// constructors
	public BaseOrigine () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseOrigine (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libOrigine;

	// collections
	private java.util.Set<com.artm.hibernate.beans.Versement> versements;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_ORIGINR"
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
	 * Return the value associated with the column: LIB_ORIGINE
	 */
	public java.lang.String getLibOrigine () {
		return libOrigine;
	}

	/**
	 * Set the value related to the column: LIB_ORIGINE
	 * @param libOrigine the LIB_ORIGINE value
	 */
	public void setLibOrigine (java.lang.String libOrigine) {
		this.libOrigine = libOrigine;
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.Origine)) return false;
		else {
			com.artm.hibernate.beans.Origine origine = (com.artm.hibernate.beans.Origine) obj;
			if (null == this.getId() || null == origine.getId()) return false;
			else return (this.getId().equals(origine.getId()));
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