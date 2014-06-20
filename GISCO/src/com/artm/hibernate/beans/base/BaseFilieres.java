package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the filieres table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="filieres"
 */

public abstract class BaseFilieres  implements Serializable {

	public static String REF = "Filieres";
	public static String PROP_ABREV_FILIERE = "AbrevFiliere";
	public static String PROP_NOM_FILIERE = "NomFiliere";
	public static String PROP_ID = "Id";
	public static String PROP_CODE_ECOLE = "CodeEcole";


	// constructors
	public BaseFilieres () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseFilieres (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseFilieres (
		java.lang.Integer id,
		com.artm.hibernate.beans.Ecole codeEcole) {

		this.setId(id);
		this.setCodeEcole(codeEcole);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String nomFiliere;
	private java.lang.String abrevFiliere;

	// many to one
	private com.artm.hibernate.beans.Ecole codeEcole;

	// collections
	private java.util.Set<com.artm.hibernate.beans.Section> sections;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_FILIERE"
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
	 * Return the value associated with the column: NOM_FILIERE
	 */
	public java.lang.String getNomFiliere () {
		return nomFiliere;
	}

	/**
	 * Set the value related to the column: NOM_FILIERE
	 * @param nomFiliere the NOM_FILIERE value
	 */
	public void setNomFiliere (java.lang.String nomFiliere) {
		this.nomFiliere = nomFiliere;
	}



	/**
	 * Return the value associated with the column: ABREV_FILIERE
	 */
	public java.lang.String getAbrevFiliere () {
		return abrevFiliere;
	}

	/**
	 * Set the value related to the column: ABREV_FILIERE
	 * @param abrevFiliere the ABREV_FILIERE value
	 */
	public void setAbrevFiliere (java.lang.String abrevFiliere) {
		this.abrevFiliere = abrevFiliere;
	}



	/**
	 * Return the value associated with the column: CODE_ECOLE
	 */
	public com.artm.hibernate.beans.Ecole getCodeEcole () {
		return codeEcole;
	}

	/**
	 * Set the value related to the column: CODE_ECOLE
	 * @param codeEcole the CODE_ECOLE value
	 */
	public void setCodeEcole (com.artm.hibernate.beans.Ecole codeEcole) {
		this.codeEcole = codeEcole;
	}



	/**
	 * Return the value associated with the column: Sections
	 */
	public java.util.Set<com.artm.hibernate.beans.Section> getSections () {
		return sections;
	}

	/**
	 * Set the value related to the column: Sections
	 * @param sections the Sections value
	 */
	public void setSections (java.util.Set<com.artm.hibernate.beans.Section> sections) {
		this.sections = sections;
	}

	public void addToSections (com.artm.hibernate.beans.Section section) {
		if (null == getSections()) setSections(new java.util.TreeSet<com.artm.hibernate.beans.Section>());
		getSections().add(section);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.Filieres)) return false;
		else {
			com.artm.hibernate.beans.Filieres filieres = (com.artm.hibernate.beans.Filieres) obj;
			if (null == this.getId() || null == filieres.getId()) return false;
			else return (this.getId().equals(filieres.getId()));
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