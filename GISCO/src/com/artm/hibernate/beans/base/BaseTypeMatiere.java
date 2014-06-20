package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the type_matiere table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="type_matiere"
 */

public abstract class BaseTypeMatiere  implements Serializable {

	public static String REF = "TypeMatiere";
	public static String PROP_ID = "Id";
	public static String PROP_LIB_TYPE = "LibType";


	// constructors
	public BaseTypeMatiere () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseTypeMatiere (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libType;

	// collections
	private java.util.Set<com.artm.hibernate.beans.Parammatiere> parammatieres;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_TYPE"
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
	 * Return the value associated with the column: LIB_TYPE
	 */
	public java.lang.String getLibType () {
		return libType;
	}

	/**
	 * Set the value related to the column: LIB_TYPE
	 * @param libType the LIB_TYPE value
	 */
	public void setLibType (java.lang.String libType) {
		this.libType = libType;
	}



	/**
	 * Return the value associated with the column: Parammatieres
	 */
	public java.util.Set<com.artm.hibernate.beans.Parammatiere> getParammatieres () {
		return parammatieres;
	}

	/**
	 * Set the value related to the column: Parammatieres
	 * @param parammatieres the Parammatieres value
	 */
	public void setParammatieres (java.util.Set<com.artm.hibernate.beans.Parammatiere> parammatieres) {
		this.parammatieres = parammatieres;
	}

	public void addToParammatieres (com.artm.hibernate.beans.Parammatiere parammatiere) {
		if (null == getParammatieres()) setParammatieres(new java.util.TreeSet<com.artm.hibernate.beans.Parammatiere>());
		getParammatieres().add(parammatiere);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.TypeMatiere)) return false;
		else {
			com.artm.hibernate.beans.TypeMatiere typeMatiere = (com.artm.hibernate.beans.TypeMatiere) obj;
			if (null == this.getId() || null == typeMatiere.getId()) return false;
			else return (this.getId().equals(typeMatiere.getId()));
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