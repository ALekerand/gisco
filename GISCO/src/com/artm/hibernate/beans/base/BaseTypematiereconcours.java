package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the typematiereconcours table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="typematiereconcours"
 */

public abstract class BaseTypematiereconcours  implements Serializable {

	public static String REF = "Typematiereconcours";
	public static String PROP_ID = "Id";
	public static String PROP_TYPE_MATIERE_CONCOURS = "TypeMatiereConcours";


	// constructors
	public BaseTypematiereconcours () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseTypematiereconcours (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String typeMatiereConcours;

	// collections
	private java.util.Set<com.artm.hibernate.beans.Matiereconcours> matiereconcours;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_TYPE_MATIERE"
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
	 * Return the value associated with the column: TYPE_MATIERE_CONCOURS
	 */
	public java.lang.String getTypeMatiereConcours () {
		return typeMatiereConcours;
	}

	/**
	 * Set the value related to the column: TYPE_MATIERE_CONCOURS
	 * @param typeMatiereConcours the TYPE_MATIERE_CONCOURS value
	 */
	public void setTypeMatiereConcours (java.lang.String typeMatiereConcours) {
		this.typeMatiereConcours = typeMatiereConcours;
	}



	/**
	 * Return the value associated with the column: Matiereconcours
	 */
	public java.util.Set<com.artm.hibernate.beans.Matiereconcours> getMatiereconcours () {
		return matiereconcours;
	}

	/**
	 * Set the value related to the column: Matiereconcours
	 * @param matiereconcours the Matiereconcours value
	 */
	public void setMatiereconcours (java.util.Set<com.artm.hibernate.beans.Matiereconcours> matiereconcours) {
		this.matiereconcours = matiereconcours;
	}

	public void addToMatiereconcours (com.artm.hibernate.beans.Matiereconcours matiereconcours) {
		if (null == getMatiereconcours()) setMatiereconcours(new java.util.TreeSet<com.artm.hibernate.beans.Matiereconcours>());
		getMatiereconcours().add(matiereconcours);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.Typematiereconcours)) return false;
		else {
			com.artm.hibernate.beans.Typematiereconcours typematiereconcours = (com.artm.hibernate.beans.Typematiereconcours) obj;
			if (null == this.getId() || null == typematiereconcours.getId()) return false;
			else return (this.getId().equals(typematiereconcours.getId()));
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