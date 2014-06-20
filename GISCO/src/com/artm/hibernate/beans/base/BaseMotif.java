package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the motif table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="motif"
 */

public abstract class BaseMotif  implements Serializable {

	public static String REF = "Motif";
	public static String PROP_ID = "Id";
	public static String PROP_LIB_MOTIF = "LibMotif";


	// constructors
	public BaseMotif () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseMotif (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libMotif;

	// collections
	private java.util.Set<com.artm.hibernate.beans.Absence> absences;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_MOTIF"
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
	 * Return the value associated with the column: LIB_MOTIF
	 */
	public java.lang.String getLibMotif () {
		return libMotif;
	}

	/**
	 * Set the value related to the column: LIB_MOTIF
	 * @param libMotif the LIB_MOTIF value
	 */
	public void setLibMotif (java.lang.String libMotif) {
		this.libMotif = libMotif;
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
		if (!(obj instanceof com.artm.hibernate.beans.Motif)) return false;
		else {
			com.artm.hibernate.beans.Motif motif = (com.artm.hibernate.beans.Motif) obj;
			if (null == this.getId() || null == motif.getId()) return false;
			else return (this.getId().equals(motif.getId()));
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