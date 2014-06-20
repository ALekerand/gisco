package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the campus table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="campus"
 */

public abstract class BaseCampus  implements Serializable {

	public static String REF = "Campus";
	public static String PROP_LIB_CAMPUS = "LibCampus";
	public static String PROP_ID = "Id";


	// constructors
	public BaseCampus () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCampus (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libCampus;

	// collections
	private java.util.Set<com.artm.hibernate.beans.Detailcampus> detailcampus;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_CAMPUS"
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
	 * Return the value associated with the column: LIB_CAMPUS
	 */
	public java.lang.String getLibCampus () {
		return libCampus;
	}

	/**
	 * Set the value related to the column: LIB_CAMPUS
	 * @param libCampus the LIB_CAMPUS value
	 */
	public void setLibCampus (java.lang.String libCampus) {
		this.libCampus = libCampus;
	}



	/**
	 * Return the value associated with the column: Detailcampus
	 */
	public java.util.Set<com.artm.hibernate.beans.Detailcampus> getDetailcampus () {
		return detailcampus;
	}

	/**
	 * Set the value related to the column: Detailcampus
	 * @param detailcampus the Detailcampus value
	 */
	public void setDetailcampus (java.util.Set<com.artm.hibernate.beans.Detailcampus> detailcampus) {
		this.detailcampus = detailcampus;
	}

	public void addToDetailcampus (com.artm.hibernate.beans.Detailcampus detailcampus) {
		if (null == getDetailcampus()) setDetailcampus(new java.util.TreeSet<com.artm.hibernate.beans.Detailcampus>());
		getDetailcampus().add(detailcampus);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.Campus)) return false;
		else {
			com.artm.hibernate.beans.Campus campus = (com.artm.hibernate.beans.Campus) obj;
			if (null == this.getId() || null == campus.getId()) return false;
			else return (this.getId().equals(campus.getId()));
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