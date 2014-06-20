package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the correspondre table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="correspondre"
 */

public abstract class BaseCorrespondre  implements Serializable {

	public static String REF = "Correspondre";
	public static String PROP_DATE_MATIERE = "DateMatiere";
	public static String PROP_ID = "Id";
	public static String PROP_ANNEE_MATIERE_SEMESTRE = "AnneeMatiereSemestre";


	// constructors
	public BaseCorrespondre () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCorrespondre (com.artm.hibernate.beans.CorrespondrePK id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private com.artm.hibernate.beans.CorrespondrePK id;

	// fields
	private java.lang.String anneeMatiereSemestre;
	private java.util.Date dateMatiere;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     */
	public com.artm.hibernate.beans.CorrespondrePK getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (com.artm.hibernate.beans.CorrespondrePK id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: ANNEE_MATIERE_SEMESTRE
	 */
	public java.lang.String getAnneeMatiereSemestre () {
		return anneeMatiereSemestre;
	}

	/**
	 * Set the value related to the column: ANNEE_MATIERE_SEMESTRE
	 * @param anneeMatiereSemestre the ANNEE_MATIERE_SEMESTRE value
	 */
	public void setAnneeMatiereSemestre (java.lang.String anneeMatiereSemestre) {
		this.anneeMatiereSemestre = anneeMatiereSemestre;
	}



	/**
	 * Return the value associated with the column: DATE_MATIERE
	 */
	public java.util.Date getDateMatiere () {
		return dateMatiere;
	}

	/**
	 * Set the value related to the column: DATE_MATIERE
	 * @param dateMatiere the DATE_MATIERE value
	 */
	public void setDateMatiere (java.util.Date dateMatiere) {
		this.dateMatiere = dateMatiere;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.Correspondre)) return false;
		else {
			com.artm.hibernate.beans.Correspondre correspondre = (com.artm.hibernate.beans.Correspondre) obj;
			if (null == this.getId() || null == correspondre.getId()) return false;
			else return (this.getId().equals(correspondre.getId()));
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