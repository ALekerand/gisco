package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the matrimoniales table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="matrimoniales"
 */

public abstract class BaseMatrimoniales  implements Serializable {

	public static String REF = "Matrimoniales";
	public static String PROP_LIBMATRIMONIALE = "Libmatrimoniale";
	public static String PROP_ID = "Id";


	// constructors
	public BaseMatrimoniales () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseMatrimoniales (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libmatrimoniale;

	// collections
	private java.util.Set<com.artm.hibernate.beans.Etudiants> etudiants;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODEMATRIMONIALE"
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
	 * Return the value associated with the column: LIBMATRIMONIALE
	 */
	public java.lang.String getLibmatrimoniale () {
		return libmatrimoniale;
	}

	/**
	 * Set the value related to the column: LIBMATRIMONIALE
	 * @param libmatrimoniale the LIBMATRIMONIALE value
	 */
	public void setLibmatrimoniale (java.lang.String libmatrimoniale) {
		this.libmatrimoniale = libmatrimoniale;
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
		if (!(obj instanceof com.artm.hibernate.beans.Matrimoniales)) return false;
		else {
			com.artm.hibernate.beans.Matrimoniales matrimoniales = (com.artm.hibernate.beans.Matrimoniales) obj;
			if (null == this.getId() || null == matrimoniales.getId()) return false;
			else return (this.getId().equals(matrimoniales.getId()));
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