package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the matiere table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="matiere"
 */

public abstract class BaseMatiere  implements Serializable {

	public static String REF = "Matiere";
	public static String PROP_ABREV_MATIERE = "AbrevMatiere";
	public static String PROP_CODE_SECTION = "CodeSection";
	public static String PROP_LIB_MATIERE = "LibMatiere";
	public static String PROP_ID = "Id";
	public static String PROP_COEF_MATIERE = "CoefMatiere";


	// constructors
	public BaseMatiere () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseMatiere (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseMatiere (
		java.lang.Integer id,
		com.artm.hibernate.beans.Section codeSection) {

		this.setId(id);
		this.setCodeSection(codeSection);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libMatiere;
	private java.lang.String abrevMatiere;
	private java.lang.Integer coefMatiere;

	// many to one
	private com.artm.hibernate.beans.Section codeSection;

	// collections
	private java.util.Set<com.artm.hibernate.beans.Notes> notes;
	private java.util.Set<com.artm.hibernate.beans.Semestre> semestres;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_MATIERE"
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
	 * Return the value associated with the column: LIB_MATIERE
	 */
	public java.lang.String getLibMatiere () {
		return libMatiere;
	}

	/**
	 * Set the value related to the column: LIB_MATIERE
	 * @param libMatiere the LIB_MATIERE value
	 */
	public void setLibMatiere (java.lang.String libMatiere) {
		this.libMatiere = libMatiere;
	}



	/**
	 * Return the value associated with the column: ABREV_MATIERE
	 */
	public java.lang.String getAbrevMatiere () {
		return abrevMatiere;
	}

	/**
	 * Set the value related to the column: ABREV_MATIERE
	 * @param abrevMatiere the ABREV_MATIERE value
	 */
	public void setAbrevMatiere (java.lang.String abrevMatiere) {
		this.abrevMatiere = abrevMatiere;
	}



	/**
	 * Return the value associated with the column: COEF_MATIERE
	 */
	public java.lang.Integer getCoefMatiere () {
		return coefMatiere;
	}

	/**
	 * Set the value related to the column: COEF_MATIERE
	 * @param coefMatiere the COEF_MATIERE value
	 */
	public void setCoefMatiere (java.lang.Integer coefMatiere) {
		this.coefMatiere = coefMatiere;
	}



	/**
	 * Return the value associated with the column: CODE_SECTION
	 */
	public com.artm.hibernate.beans.Section getCodeSection () {
		return codeSection;
	}

	/**
	 * Set the value related to the column: CODE_SECTION
	 * @param codeSection the CODE_SECTION value
	 */
	public void setCodeSection (com.artm.hibernate.beans.Section codeSection) {
		this.codeSection = codeSection;
	}



	/**
	 * Return the value associated with the column: Notes
	 */
	public java.util.Set<com.artm.hibernate.beans.Notes> getNotes () {
		return notes;
	}

	/**
	 * Set the value related to the column: Notes
	 * @param notes the Notes value
	 */
	public void setNotes (java.util.Set<com.artm.hibernate.beans.Notes> notes) {
		this.notes = notes;
	}

	public void addToNotes (com.artm.hibernate.beans.Notes notes) {
		if (null == getNotes()) setNotes(new java.util.TreeSet<com.artm.hibernate.beans.Notes>());
		getNotes().add(notes);
	}



	/**
	 * Return the value associated with the column: Semestres
	 */
	public java.util.Set<com.artm.hibernate.beans.Semestre> getSemestres () {
		return semestres;
	}

	/**
	 * Set the value related to the column: Semestres
	 * @param semestres the Semestres value
	 */
	public void setSemestres (java.util.Set<com.artm.hibernate.beans.Semestre> semestres) {
		this.semestres = semestres;
	}

	public void addToSemestres (com.artm.hibernate.beans.Semestre semestre) {
		if (null == getSemestres()) setSemestres(new java.util.TreeSet<com.artm.hibernate.beans.Semestre>());
		getSemestres().add(semestre);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.Matiere)) return false;
		else {
			com.artm.hibernate.beans.Matiere matiere = (com.artm.hibernate.beans.Matiere) obj;
			if (null == this.getId() || null == matiere.getId()) return false;
			else return (this.getId().equals(matiere.getId()));
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