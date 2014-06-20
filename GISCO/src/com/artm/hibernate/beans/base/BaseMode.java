package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the mode table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="mode"
 */

public abstract class BaseMode  implements Serializable {

	public static String REF = "Mode";
	public static String PROP_ID = "Id";
	public static String PROP_LIB_MODE = "LibMode";


	// constructors
	public BaseMode () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseMode (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libMode;

	// collections
	private java.util.Set<com.artm.hibernate.beans.Caisconcours> caisconcours;
	private java.util.Set<com.artm.hibernate.beans.Versement> versements;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_MODE"
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
	 * Return the value associated with the column: LIB_MODE
	 */
	public java.lang.String getLibMode () {
		return libMode;
	}

	/**
	 * Set the value related to the column: LIB_MODE
	 * @param libMode the LIB_MODE value
	 */
	public void setLibMode (java.lang.String libMode) {
		this.libMode = libMode;
	}



	/**
	 * Return the value associated with the column: Caisconcours
	 */
	public java.util.Set<com.artm.hibernate.beans.Caisconcours> getCaisconcours () {
		return caisconcours;
	}

	/**
	 * Set the value related to the column: Caisconcours
	 * @param caisconcours the Caisconcours value
	 */
	public void setCaisconcours (java.util.Set<com.artm.hibernate.beans.Caisconcours> caisconcours) {
		this.caisconcours = caisconcours;
	}

	public void addToCaisconcours (com.artm.hibernate.beans.Caisconcours caisconcours) {
		if (null == getCaisconcours()) setCaisconcours(new java.util.TreeSet<com.artm.hibernate.beans.Caisconcours>());
		getCaisconcours().add(caisconcours);
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
		if (!(obj instanceof com.artm.hibernate.beans.Mode)) return false;
		else {
			com.artm.hibernate.beans.Mode mode = (com.artm.hibernate.beans.Mode) obj;
			if (null == this.getId() || null == mode.getId()) return false;
			else return (this.getId().equals(mode.getId()));
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