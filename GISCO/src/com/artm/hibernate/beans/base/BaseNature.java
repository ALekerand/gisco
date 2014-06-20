package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the nature table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="nature"
 */

public abstract class BaseNature  implements Serializable {

	public static String REF = "Nature";
	public static String PROP_LIB_NATURE = "LibNature";
	public static String PROP_ID = "Id";


	// constructors
	public BaseNature () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseNature (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libNature;

	// collections
	private java.util.Set<com.artm.hibernate.beans.Absence> absences;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_NATURE"
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
	 * Return the value associated with the column: LIB_NATURE
	 */
	public java.lang.String getLibNature () {
		return libNature;
	}

	/**
	 * Set the value related to the column: LIB_NATURE
	 * @param libNature the LIB_NATURE value
	 */
	public void setLibNature (java.lang.String libNature) {
		this.libNature = libNature;
	}



	/**
	 * Return the value associated with the column: Absences
	 */
	public java.util.Set<com.artm.hibernate.beans.Absence> getAbsences () {
		return absences;
	}

	/**
	 * Set the value related to the column: Absences
	 * @param absences the Absences value
	 */
	public void setAbsences (java.util.Set<com.artm.hibernate.beans.Absence> absences) {
		this.absences = absences;
	}

	public void addToAbsences (com.artm.hibernate.beans.Absence absence) {
		if (null == getAbsences()) setAbsences(new java.util.TreeSet<com.artm.hibernate.beans.Absence>());
		getAbsences().add(absence);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.Nature)) return false;
		else {
			com.artm.hibernate.beans.Nature nature = (com.artm.hibernate.beans.Nature) obj;
			if (null == this.getId() || null == nature.getId()) return false;
			else return (this.getId().equals(nature.getId()));
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