package com.artm.hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the notexam table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="notexam"
 */

public abstract class BaseNotexam  implements Serializable {

	public static String REF = "Notexam";
	public static String PROP_ANNEE_EXAM = "AnneeExam";
	public static String PROP_DATE_NOTE_EXAM = "DateNoteExam";
	public static String PROP_CODE_MATIERE_EXAM = "CodeMatiereExam";
	public static String PROP_NUMETUDIANT = "Numetudiant";
	public static String PROP_NOTE_EXAM = "NoteExam";
	public static String PROP_ID = "Id";


	// constructors
	public BaseNotexam () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseNotexam (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseNotexam (
		java.lang.Integer id,
		com.artm.hibernate.beans.Etudiants numetudiant,
		com.artm.hibernate.beans.MatiereExam codeMatiereExam) {

		this.setId(id);
		this.setNumetudiant(numetudiant);
		this.setCodeMatiereExam(codeMatiereExam);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.math.BigDecimal noteExam;
	private java.lang.String anneeExam;
	private java.util.Date dateNoteExam;

	// many to one
	private com.artm.hibernate.beans.Etudiants numetudiant;
	private com.artm.hibernate.beans.MatiereExam codeMatiereExam;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_NOTEXAM"
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
	 * Return the value associated with the column: NOTE_EXAM
	 */
	public java.math.BigDecimal getNoteExam () {
		return noteExam;
	}

	/**
	 * Set the value related to the column: NOTE_EXAM
	 * @param noteExam the NOTE_EXAM value
	 */
	public void setNoteExam (java.math.BigDecimal noteExam) {
		this.noteExam = noteExam;
	}



	/**
	 * Return the value associated with the column: ANNEE_EXAM
	 */
	public java.lang.String getAnneeExam () {
		return anneeExam;
	}

	/**
	 * Set the value related to the column: ANNEE_EXAM
	 * @param anneeExam the ANNEE_EXAM value
	 */
	public void setAnneeExam (java.lang.String anneeExam) {
		this.anneeExam = anneeExam;
	}



	/**
	 * Return the value associated with the column: DATE_NOTE_EXAM
	 */
	public java.util.Date getDateNoteExam () {
		return dateNoteExam;
	}

	/**
	 * Set the value related to the column: DATE_NOTE_EXAM
	 * @param dateNoteExam the DATE_NOTE_EXAM value
	 */
	public void setDateNoteExam (java.util.Date dateNoteExam) {
		this.dateNoteExam = dateNoteExam;
	}



	/**
	 * Return the value associated with the column: NUMETUDIANT
	 */
	public com.artm.hibernate.beans.Etudiants getNumetudiant () {
		return numetudiant;
	}

	/**
	 * Set the value related to the column: NUMETUDIANT
	 * @param numetudiant the NUMETUDIANT value
	 */
	public void setNumetudiant (com.artm.hibernate.beans.Etudiants numetudiant) {
		this.numetudiant = numetudiant;
	}



	/**
	 * Return the value associated with the column: CODE_MATIERE_EXAM
	 */
	public com.artm.hibernate.beans.MatiereExam getCodeMatiereExam () {
		return codeMatiereExam;
	}

	/**
	 * Set the value related to the column: CODE_MATIERE_EXAM
	 * @param codeMatiereExam the CODE_MATIERE_EXAM value
	 */
	public void setCodeMatiereExam (com.artm.hibernate.beans.MatiereExam codeMatiereExam) {
		this.codeMatiereExam = codeMatiereExam;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.artm.hibernate.beans.Notexam)) return false;
		else {
			com.artm.hibernate.beans.Notexam notexam = (com.artm.hibernate.beans.Notexam) obj;
			if (null == this.getId() || null == notexam.getId()) return false;
			else return (this.getId().equals(notexam.getId()));
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