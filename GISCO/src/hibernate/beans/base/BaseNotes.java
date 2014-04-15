package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the notes table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="notes"
 */

public abstract class BaseNotes  implements Serializable {

	public static String REF = "Notes";
	public static String PROP_CODE_ANNEES = "CodeAnnees";
	public static String PROP_MOYENNE = "Moyenne";
	public static String PROP_CODE_SEMESTRE = "CodeSemestre";
	public static String PROP_NUMETUDIANT = "Numetudiant";
	public static String PROP_ID = "Id";
	public static String PROP_CODE_MATIERE = "CodeMatiere";
	public static String PROP_DATE_NOTE = "DateNote";


	// constructors
	public BaseNotes () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseNotes (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseNotes (
		java.lang.Integer id,
		hibernate.beans.Semestre codeSemestre,
		hibernate.beans.Etudiants numetudiant,
		hibernate.beans.Annees codeAnnees,
		hibernate.beans.Matiere codeMatiere) {

		this.setId(id);
		this.setCodeSemestre(codeSemestre);
		this.setNumetudiant(numetudiant);
		this.setCodeAnnees(codeAnnees);
		this.setCodeMatiere(codeMatiere);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.math.BigDecimal moyenne;
	private java.util.Date dateNote;

	// many to one
	private hibernate.beans.Semestre codeSemestre;
	private hibernate.beans.Etudiants numetudiant;
	private hibernate.beans.Annees codeAnnees;
	private hibernate.beans.Matiere codeMatiere;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_NOTE"
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
	 * Return the value associated with the column: MOYENNE
	 */
	public java.math.BigDecimal getMoyenne () {
		return moyenne;
	}

	/**
	 * Set the value related to the column: MOYENNE
	 * @param moyenne the MOYENNE value
	 */
	public void setMoyenne (java.math.BigDecimal moyenne) {
		this.moyenne = moyenne;
	}



	/**
	 * Return the value associated with the column: DATE_NOTE
	 */
	public java.util.Date getDateNote () {
		return dateNote;
	}

	/**
	 * Set the value related to the column: DATE_NOTE
	 * @param dateNote the DATE_NOTE value
	 */
	public void setDateNote (java.util.Date dateNote) {
		this.dateNote = dateNote;
	}



	/**
	 * Return the value associated with the column: CODE_SEMESTRE
	 */
	public hibernate.beans.Semestre getCodeSemestre () {
		return codeSemestre;
	}

	/**
	 * Set the value related to the column: CODE_SEMESTRE
	 * @param codeSemestre the CODE_SEMESTRE value
	 */
	public void setCodeSemestre (hibernate.beans.Semestre codeSemestre) {
		this.codeSemestre = codeSemestre;
	}



	/**
	 * Return the value associated with the column: NUMETUDIANT
	 */
	public hibernate.beans.Etudiants getNumetudiant () {
		return numetudiant;
	}

	/**
	 * Set the value related to the column: NUMETUDIANT
	 * @param numetudiant the NUMETUDIANT value
	 */
	public void setNumetudiant (hibernate.beans.Etudiants numetudiant) {
		this.numetudiant = numetudiant;
	}



	/**
	 * Return the value associated with the column: CODE_ANNEES
	 */
	public hibernate.beans.Annees getCodeAnnees () {
		return codeAnnees;
	}

	/**
	 * Set the value related to the column: CODE_ANNEES
	 * @param codeAnnees the CODE_ANNEES value
	 */
	public void setCodeAnnees (hibernate.beans.Annees codeAnnees) {
		this.codeAnnees = codeAnnees;
	}



	/**
	 * Return the value associated with the column: CODE_MATIERE
	 */
	public hibernate.beans.Matiere getCodeMatiere () {
		return codeMatiere;
	}

	/**
	 * Set the value related to the column: CODE_MATIERE
	 * @param codeMatiere the CODE_MATIERE value
	 */
	public void setCodeMatiere (hibernate.beans.Matiere codeMatiere) {
		this.codeMatiere = codeMatiere;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.Notes)) return false;
		else {
			hibernate.beans.Notes notes = (hibernate.beans.Notes) obj;
			if (null == this.getId() || null == notes.getId()) return false;
			else return (this.getId().equals(notes.getId()));
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