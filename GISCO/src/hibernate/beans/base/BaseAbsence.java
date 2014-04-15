package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the absence table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="absence"
 */

public abstract class BaseAbsence  implements Serializable {

	public static String REF = "Absence";
	public static String PROP_HEURE_FIN = "HeureFin";
	public static String PROP_DATE_SAISIE = "DateSaisie";
	public static String PROP_CODE_ANNEES = "CodeAnnees";
	public static String PROP_DATE_ABSENCE = "DateAbsence";
	public static String PROP_CODE_NATURE = "CodeNature";
	public static String PROP_CODE_SEMESTRE = "CodeSemestre";
	public static String PROP_NUMETUDIANT = "Numetudiant";
	public static String PROP_CODE_MOTIF = "CodeMotif";
	public static String PROP_HEURE_DEBUT = "HeureDebut";
	public static String PROP_ID = "Id";


	// constructors
	public BaseAbsence () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseAbsence (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseAbsence (
		java.lang.Integer id,
		hibernate.beans.Semestre codeSemestre,
		hibernate.beans.Etudiants numetudiant,
		hibernate.beans.Nature codeNature,
		hibernate.beans.Annees codeAnnees,
		hibernate.beans.Motif codeMotif) {

		this.setId(id);
		this.setCodeSemestre(codeSemestre);
		this.setNumetudiant(numetudiant);
		this.setCodeNature(codeNature);
		this.setCodeAnnees(codeAnnees);
		this.setCodeMotif(codeMotif);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.util.Date dateSaisie;
	private java.util.Date dateAbsence;
	private java.util.Date heureDebut;
	private java.util.Date heureFin;

	// many to one
	private hibernate.beans.Semestre codeSemestre;
	private hibernate.beans.Etudiants numetudiant;
	private hibernate.beans.Nature codeNature;
	private hibernate.beans.Annees codeAnnees;
	private hibernate.beans.Motif codeMotif;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_ABSENCE"
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
	 * Return the value associated with the column: DATE_SAISIE
	 */
	public java.util.Date getDateSaisie () {
		return dateSaisie;
	}

	/**
	 * Set the value related to the column: DATE_SAISIE
	 * @param dateSaisie the DATE_SAISIE value
	 */
	public void setDateSaisie (java.util.Date dateSaisie) {
		this.dateSaisie = dateSaisie;
	}



	/**
	 * Return the value associated with the column: DATE_ABSENCE
	 */
	public java.util.Date getDateAbsence () {
		return dateAbsence;
	}

	/**
	 * Set the value related to the column: DATE_ABSENCE
	 * @param dateAbsence the DATE_ABSENCE value
	 */
	public void setDateAbsence (java.util.Date dateAbsence) {
		this.dateAbsence = dateAbsence;
	}



	/**
	 * Return the value associated with the column: HEURE_DEBUT
	 */
	public java.util.Date getHeureDebut () {
		return heureDebut;
	}

	/**
	 * Set the value related to the column: HEURE_DEBUT
	 * @param heureDebut the HEURE_DEBUT value
	 */
	public void setHeureDebut (java.util.Date heureDebut) {
		this.heureDebut = heureDebut;
	}



	/**
	 * Return the value associated with the column: HEURE_FIN
	 */
	public java.util.Date getHeureFin () {
		return heureFin;
	}

	/**
	 * Set the value related to the column: HEURE_FIN
	 * @param heureFin the HEURE_FIN value
	 */
	public void setHeureFin (java.util.Date heureFin) {
		this.heureFin = heureFin;
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
	 * Return the value associated with the column: CODE_NATURE
	 */
	public hibernate.beans.Nature getCodeNature () {
		return codeNature;
	}

	/**
	 * Set the value related to the column: CODE_NATURE
	 * @param codeNature the CODE_NATURE value
	 */
	public void setCodeNature (hibernate.beans.Nature codeNature) {
		this.codeNature = codeNature;
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
	 * Return the value associated with the column: CODE_MOTIF
	 */
	public hibernate.beans.Motif getCodeMotif () {
		return codeMotif;
	}

	/**
	 * Set the value related to the column: CODE_MOTIF
	 * @param codeMotif the CODE_MOTIF value
	 */
	public void setCodeMotif (hibernate.beans.Motif codeMotif) {
		this.codeMotif = codeMotif;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.Absence)) return false;
		else {
			hibernate.beans.Absence absence = (hibernate.beans.Absence) obj;
			if (null == this.getId() || null == absence.getId()) return false;
			else return (this.getId().equals(absence.getId()));
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