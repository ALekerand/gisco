package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the matiere_exam table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="matiere_exam"
 */

public abstract class BaseMatiereExam  implements Serializable {

	public static String REF = "MatiereExam";
	public static String PROP_COEF_MATIERE_EXAM = "CoefMatiereExam";
	public static String PROP_CODE_SECTION = "CodeSection";
	public static String PROP_ABREV_MATIERE_EXAM = "AbrevMatiereExam";
	public static String PROP_LIB_MATIERE_EXAM = "LibMatiereExam";
	public static String PROP_ID = "Id";


	// constructors
	public BaseMatiereExam () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseMatiereExam (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseMatiereExam (
		java.lang.Integer id,
		hibernate.beans.Section codeSection) {

		this.setId(id);
		this.setCodeSection(codeSection);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libMatiereExam;
	private java.lang.String abrevMatiereExam;
	private java.lang.Integer coefMatiereExam;

	// many to one
	private hibernate.beans.Section codeSection;

	// collections
	private java.util.Set<hibernate.beans.Notexam> notexams;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_MATIERE_EXAM"
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
	 * Return the value associated with the column: LIB_MATIERE_EXAM
	 */
	public java.lang.String getLibMatiereExam () {
		return libMatiereExam;
	}

	/**
	 * Set the value related to the column: LIB_MATIERE_EXAM
	 * @param libMatiereExam the LIB_MATIERE_EXAM value
	 */
	public void setLibMatiereExam (java.lang.String libMatiereExam) {
		this.libMatiereExam = libMatiereExam;
	}



	/**
	 * Return the value associated with the column: ABREV_MATIERE_EXAM
	 */
	public java.lang.String getAbrevMatiereExam () {
		return abrevMatiereExam;
	}

	/**
	 * Set the value related to the column: ABREV_MATIERE_EXAM
	 * @param abrevMatiereExam the ABREV_MATIERE_EXAM value
	 */
	public void setAbrevMatiereExam (java.lang.String abrevMatiereExam) {
		this.abrevMatiereExam = abrevMatiereExam;
	}



	/**
	 * Return the value associated with the column: COEF_MATIERE_EXAM
	 */
	public java.lang.Integer getCoefMatiereExam () {
		return coefMatiereExam;
	}

	/**
	 * Set the value related to the column: COEF_MATIERE_EXAM
	 * @param coefMatiereExam the COEF_MATIERE_EXAM value
	 */
	public void setCoefMatiereExam (java.lang.Integer coefMatiereExam) {
		this.coefMatiereExam = coefMatiereExam;
	}



	/**
	 * Return the value associated with the column: CODE_SECTION
	 */
	public hibernate.beans.Section getCodeSection () {
		return codeSection;
	}

	/**
	 * Set the value related to the column: CODE_SECTION
	 * @param codeSection the CODE_SECTION value
	 */
	public void setCodeSection (hibernate.beans.Section codeSection) {
		this.codeSection = codeSection;
	}



	/**
	 * Return the value associated with the column: Notexams
	 */
	public java.util.Set<hibernate.beans.Notexam> getNotexams () {
		return notexams;
	}

	/**
	 * Set the value related to the column: Notexams
	 * @param notexams the Notexams value
	 */
	public void setNotexams (java.util.Set<hibernate.beans.Notexam> notexams) {
		this.notexams = notexams;
	}

	public void addToNotexams (hibernate.beans.Notexam notexam) {
		if (null == getNotexams()) setNotexams(new java.util.TreeSet<hibernate.beans.Notexam>());
		getNotexams().add(notexam);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.MatiereExam)) return false;
		else {
			hibernate.beans.MatiereExam matiereExam = (hibernate.beans.MatiereExam) obj;
			if (null == this.getId() || null == matiereExam.getId()) return false;
			else return (this.getId().equals(matiereExam.getId()));
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