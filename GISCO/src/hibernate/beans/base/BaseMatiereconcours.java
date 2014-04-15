package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the matiereconcours table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="matiereconcours"
 */

public abstract class BaseMatiereconcours  implements Serializable {

	public static String REF = "Matiereconcours";
	public static String PROP_COEF_MATIERE_CONCOURS = "CoefMatiereConcours";
	public static String PROP_CODE_TYPE_MATIERE = "CodeTypeMatiere";
	public static String PROP_LIB_MATIERE_CONCOURS = "LibMatiereConcours";
	public static String PROP_CODE_CONCOURS = "CodeConcours";
	public static String PROP_ABREV_MATIERE_CONCOURS = "AbrevMatiereConcours";
	public static String PROP_ID = "Id";


	// constructors
	public BaseMatiereconcours () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseMatiereconcours (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseMatiereconcours (
		java.lang.Integer id,
		hibernate.beans.Typematiereconcours codeTypeMatiere,
		hibernate.beans.Concours codeConcours) {

		this.setId(id);
		this.setCodeTypeMatiere(codeTypeMatiere);
		this.setCodeConcours(codeConcours);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libMatiereConcours;
	private java.lang.String abrevMatiereConcours;
	private java.lang.Integer coefMatiereConcours;

	// many to one
	private hibernate.beans.Typematiereconcours codeTypeMatiere;
	private hibernate.beans.Concours codeConcours;

	// collections
	private java.util.Set<hibernate.beans.Noteconcours> noteconcours;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_MATIERE_CONCOURS"
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
	 * Return the value associated with the column: LIB_MATIERE_CONCOURS
	 */
	public java.lang.String getLibMatiereConcours () {
		return libMatiereConcours;
	}

	/**
	 * Set the value related to the column: LIB_MATIERE_CONCOURS
	 * @param libMatiereConcours the LIB_MATIERE_CONCOURS value
	 */
	public void setLibMatiereConcours (java.lang.String libMatiereConcours) {
		this.libMatiereConcours = libMatiereConcours;
	}



	/**
	 * Return the value associated with the column: ABREV_MATIERE_CONCOURS
	 */
	public java.lang.String getAbrevMatiereConcours () {
		return abrevMatiereConcours;
	}

	/**
	 * Set the value related to the column: ABREV_MATIERE_CONCOURS
	 * @param abrevMatiereConcours the ABREV_MATIERE_CONCOURS value
	 */
	public void setAbrevMatiereConcours (java.lang.String abrevMatiereConcours) {
		this.abrevMatiereConcours = abrevMatiereConcours;
	}



	/**
	 * Return the value associated with the column: COEF_MATIERE_CONCOURS
	 */
	public java.lang.Integer getCoefMatiereConcours () {
		return coefMatiereConcours;
	}

	/**
	 * Set the value related to the column: COEF_MATIERE_CONCOURS
	 * @param coefMatiereConcours the COEF_MATIERE_CONCOURS value
	 */
	public void setCoefMatiereConcours (java.lang.Integer coefMatiereConcours) {
		this.coefMatiereConcours = coefMatiereConcours;
	}



	/**
	 * Return the value associated with the column: CODE_TYPE_MATIERE
	 */
	public hibernate.beans.Typematiereconcours getCodeTypeMatiere () {
		return codeTypeMatiere;
	}

	/**
	 * Set the value related to the column: CODE_TYPE_MATIERE
	 * @param codeTypeMatiere the CODE_TYPE_MATIERE value
	 */
	public void setCodeTypeMatiere (hibernate.beans.Typematiereconcours codeTypeMatiere) {
		this.codeTypeMatiere = codeTypeMatiere;
	}



	/**
	 * Return the value associated with the column: CODE_CONCOURS
	 */
	public hibernate.beans.Concours getCodeConcours () {
		return codeConcours;
	}

	/**
	 * Set the value related to the column: CODE_CONCOURS
	 * @param codeConcours the CODE_CONCOURS value
	 */
	public void setCodeConcours (hibernate.beans.Concours codeConcours) {
		this.codeConcours = codeConcours;
	}



	/**
	 * Return the value associated with the column: Noteconcours
	 */
	public java.util.Set<hibernate.beans.Noteconcours> getNoteconcours () {
		return noteconcours;
	}

	/**
	 * Set the value related to the column: Noteconcours
	 * @param noteconcours the Noteconcours value
	 */
	public void setNoteconcours (java.util.Set<hibernate.beans.Noteconcours> noteconcours) {
		this.noteconcours = noteconcours;
	}

	public void addToNoteconcours (hibernate.beans.Noteconcours noteconcours) {
		if (null == getNoteconcours()) setNoteconcours(new java.util.TreeSet<hibernate.beans.Noteconcours>());
		getNoteconcours().add(noteconcours);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.Matiereconcours)) return false;
		else {
			hibernate.beans.Matiereconcours matiereconcours = (hibernate.beans.Matiereconcours) obj;
			if (null == this.getId() || null == matiereconcours.getId()) return false;
			else return (this.getId().equals(matiereconcours.getId()));
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