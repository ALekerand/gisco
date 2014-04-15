package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the parammatierexam table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="parammatierexam"
 */

public abstract class BaseParammatierexam  implements Serializable {

	public static String REF = "Parammatierexam";
	public static String PROP_LIB_PARAMMATIERE_EXAM = "LibParammatiereExam";
	public static String PROP_CODE_TYPE_EXAM = "CodeTypeExam";
	public static String PROP_CODE_SECTION = "CodeSection";
	public static String PROP_ABREV_PARAMMATIERE_EXAM = "AbrevParammatiereExam";
	public static String PROP_ID = "Id";
	public static String PROP_COEF_PARAMMATIERE_EXAM = "CoefParammatiereExam";


	// constructors
	public BaseParammatierexam () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseParammatierexam (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseParammatierexam (
		java.lang.Integer id,
		hibernate.beans.Section codeSection,
		hibernate.beans.TypeMatiereExam codeTypeExam) {

		this.setId(id);
		this.setCodeSection(codeSection);
		this.setCodeTypeExam(codeTypeExam);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libParammatiereExam;
	private java.lang.String abrevParammatiereExam;
	private java.lang.Integer coefParammatiereExam;

	// many to one
	private hibernate.beans.Section codeSection;
	private hibernate.beans.TypeMatiereExam codeTypeExam;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_PARAMMATIERE_EXAM"
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
	 * Return the value associated with the column: LIB_PARAMMATIERE_EXAM
	 */
	public java.lang.String getLibParammatiereExam () {
		return libParammatiereExam;
	}

	/**
	 * Set the value related to the column: LIB_PARAMMATIERE_EXAM
	 * @param libParammatiereExam the LIB_PARAMMATIERE_EXAM value
	 */
	public void setLibParammatiereExam (java.lang.String libParammatiereExam) {
		this.libParammatiereExam = libParammatiereExam;
	}



	/**
	 * Return the value associated with the column: ABREV_PARAMMATIERE_EXAM
	 */
	public java.lang.String getAbrevParammatiereExam () {
		return abrevParammatiereExam;
	}

	/**
	 * Set the value related to the column: ABREV_PARAMMATIERE_EXAM
	 * @param abrevParammatiereExam the ABREV_PARAMMATIERE_EXAM value
	 */
	public void setAbrevParammatiereExam (java.lang.String abrevParammatiereExam) {
		this.abrevParammatiereExam = abrevParammatiereExam;
	}



	/**
	 * Return the value associated with the column: COEF_PARAMMATIERE_EXAM
	 */
	public java.lang.Integer getCoefParammatiereExam () {
		return coefParammatiereExam;
	}

	/**
	 * Set the value related to the column: COEF_PARAMMATIERE_EXAM
	 * @param coefParammatiereExam the COEF_PARAMMATIERE_EXAM value
	 */
	public void setCoefParammatiereExam (java.lang.Integer coefParammatiereExam) {
		this.coefParammatiereExam = coefParammatiereExam;
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
	 * Return the value associated with the column: CODE_TYPE_EXAM
	 */
	public hibernate.beans.TypeMatiereExam getCodeTypeExam () {
		return codeTypeExam;
	}

	/**
	 * Set the value related to the column: CODE_TYPE_EXAM
	 * @param codeTypeExam the CODE_TYPE_EXAM value
	 */
	public void setCodeTypeExam (hibernate.beans.TypeMatiereExam codeTypeExam) {
		this.codeTypeExam = codeTypeExam;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.Parammatierexam)) return false;
		else {
			hibernate.beans.Parammatierexam parammatierexam = (hibernate.beans.Parammatierexam) obj;
			if (null == this.getId() || null == parammatierexam.getId()) return false;
			else return (this.getId().equals(parammatierexam.getId()));
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