package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the detailcampus table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="detailcampus"
 */

public abstract class BaseDetailcampus  implements Serializable {

	public static String REF = "Detailcampus";
	public static String PROP_CODE_CAMPUS = "CodeCampus";
	public static String PROP_ID = "Id";
	public static String PROP_LIB_DETAIL_CAMPUS = "LibDetailCampus";
	public static String PROP_ABREV_CAMPUS = "AbrevCampus";


	// constructors
	public BaseDetailcampus () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseDetailcampus (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseDetailcampus (
		java.lang.Integer id,
		com.artm.hibernate.beans.Campus codeCampus) {

		this.setId(id);
		this.setCodeCampus(codeCampus);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libDetailCampus;
	private java.lang.String abrevCampus;

	// many to one
	private com.artm.hibernate.beans.Campus codeCampus;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_DETAIL_CAMPUS"
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
	 * Return the value associated with the column: LIB_DETAIL_CAMPUS
	 */
	public java.lang.String getLibDetailCampus () {
		return libDetailCampus;
	}

	/**
	 * Set the value related to the column: LIB_DETAIL_CAMPUS
	 * @param libDetailCampus the LIB_DETAIL_CAMPUS value
	 */
	public void setLibDetailCampus (java.lang.String libDetailCampus) {
		this.libDetailCampus = libDetailCampus;
	}



	/**
	 * Return the value associated with the column: ABREV_CAMPUS
	 */
	public java.lang.String getAbrevCampus () {
		return abrevCampus;
	}

	/**
	 * Set the value related to the column: ABREV_CAMPUS
	 * @param abrevCampus the ABREV_CAMPUS value
	 */
	public void setAbrevCampus (java.lang.String abrevCampus) {
		this.abrevCampus = abrevCampus;
	}



	/**
	 * Return the value associated with the column: CODE_CAMPUS
	 */
	public com.artm.hibernate.beans.Campus getCodeCampus () {
		return codeCampus;
	}

	/**
	 * Set the value related to the column: CODE_CAMPUS
	 * @param codeCampus the CODE_CAMPUS value
	 */
	public void setCodeCampus (com.artm.hibernate.beans.Campus codeCampus) {
		this.codeCampus = codeCampus;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.Detailcampus)) return false;
		else {
			com.artm.hibernate.beans.Detailcampus detailcampus = (com.artm.hibernate.beans.Detailcampus) obj;
			if (null == this.getId() || null == detailcampus.getId()) return false;
			else return (this.getId().equals(detailcampus.getId()));
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