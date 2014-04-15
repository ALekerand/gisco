package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the parammatiere table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="parammatiere"
 */

public abstract class BaseParammatiere  implements Serializable {

	public static String REF = "Parammatiere";
	public static String PROP_CODE_TYPE = "CodeType";
	public static String PROP_CODE_SECTION = "CodeSection";
	public static String PROP_ID = "Id";
	public static String PROP_COEF_PARAMMATIERE = "CoefParammatiere";
	public static String PROP_ABREV_PARAMMATIERE = "AbrevParammatiere";
	public static String PROP_LIB_PARAMMATIRE = "LibParammatire";


	// constructors
	public BaseParammatiere () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseParammatiere (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseParammatiere (
		java.lang.Integer id,
		hibernate.beans.Section codeSection,
		hibernate.beans.TypeMatiere codeType) {

		this.setId(id);
		this.setCodeSection(codeSection);
		this.setCodeType(codeType);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libParammatire;
	private java.lang.String abrevParammatiere;
	private java.lang.Integer coefParammatiere;

	// many to one
	private hibernate.beans.Section codeSection;
	private hibernate.beans.TypeMatiere codeType;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_PARAMMATIERE"
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
	 * Return the value associated with the column: LIB_PARAMMATIRE
	 */
	public java.lang.String getLibParammatire () {
		return libParammatire;
	}

	/**
	 * Set the value related to the column: LIB_PARAMMATIRE
	 * @param libParammatire the LIB_PARAMMATIRE value
	 */
	public void setLibParammatire (java.lang.String libParammatire) {
		this.libParammatire = libParammatire;
	}



	/**
	 * Return the value associated with the column: ABREV_PARAMMATIERE
	 */
	public java.lang.String getAbrevParammatiere () {
		return abrevParammatiere;
	}

	/**
	 * Set the value related to the column: ABREV_PARAMMATIERE
	 * @param abrevParammatiere the ABREV_PARAMMATIERE value
	 */
	public void setAbrevParammatiere (java.lang.String abrevParammatiere) {
		this.abrevParammatiere = abrevParammatiere;
	}



	/**
	 * Return the value associated with the column: COEF_PARAMMATIERE
	 */
	public java.lang.Integer getCoefParammatiere () {
		return coefParammatiere;
	}

	/**
	 * Set the value related to the column: COEF_PARAMMATIERE
	 * @param coefParammatiere the COEF_PARAMMATIERE value
	 */
	public void setCoefParammatiere (java.lang.Integer coefParammatiere) {
		this.coefParammatiere = coefParammatiere;
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
	 * Return the value associated with the column: CODE_TYPE
	 */
	public hibernate.beans.TypeMatiere getCodeType () {
		return codeType;
	}

	/**
	 * Set the value related to the column: CODE_TYPE
	 * @param codeType the CODE_TYPE value
	 */
	public void setCodeType (hibernate.beans.TypeMatiere codeType) {
		this.codeType = codeType;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.Parammatiere)) return false;
		else {
			hibernate.beans.Parammatiere parammatiere = (hibernate.beans.Parammatiere) obj;
			if (null == this.getId() || null == parammatiere.getId()) return false;
			else return (this.getId().equals(parammatiere.getId()));
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