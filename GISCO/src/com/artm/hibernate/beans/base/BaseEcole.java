package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the ecole table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="ecole"
 */

public abstract class BaseEcole  implements Serializable {

	public static String REF = "Ecole";
	public static String PROP_NOM_ECOLE = "NomEcole";
	public static String PROP_ABREV_ECOLE = "AbrevEcole";
	public static String PROP_ID = "Id";


	// constructors
	public BaseEcole () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseEcole (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String nomEcole;
	private java.lang.String abrevEcole;

	// collections
	private java.util.Set<com.artm.hibernate.beans.Filieres> filieres;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_ECOLE"
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
	 * Return the value associated with the column: NOM_ECOLE
	 */
	public java.lang.String getNomEcole () {
		return nomEcole;
	}

	/**
	 * Set the value related to the column: NOM_ECOLE
	 * @param nomEcole the NOM_ECOLE value
	 */
	public void setNomEcole (java.lang.String nomEcole) {
		this.nomEcole = nomEcole;
	}



	/**
	 * Return the value associated with the column: ABREV_ECOLE
	 */
	public java.lang.String getAbrevEcole () {
		return abrevEcole;
	}

	/**
	 * Set the value related to the column: ABREV_ECOLE
	 * @param abrevEcole the ABREV_ECOLE value
	 */
	public void setAbrevEcole (java.lang.String abrevEcole) {
		this.abrevEcole = abrevEcole;
	}



	/**
	 * Return the value associated with the column: Filieres
	 */
	public java.util.Set<com.artm.hibernate.beans.Filieres> getFilieres () {
		return filieres;
	}

	/**
	 * Set the value related to the column: Filieres
	 * @param filieres the Filieres value
	 */
	public void setFilieres (java.util.Set<com.artm.hibernate.beans.Filieres> filieres) {
		this.filieres = filieres;
	}

	public void addToFilieres (com.artm.hibernate.beans.Filieres filieres) {
		if (null == getFilieres()) setFilieres(new java.util.TreeSet<com.artm.hibernate.beans.Filieres>());
		getFilieres().add(filieres);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.Ecole)) return false;
		else {
			com.artm.hibernate.beans.Ecole ecole = (com.artm.hibernate.beans.Ecole) obj;
			if (null == this.getId() || null == ecole.getId()) return false;
			else return (this.getId().equals(ecole.getId()));
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