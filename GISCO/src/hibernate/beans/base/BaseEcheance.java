package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the echeance table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="echeance"
 */

public abstract class BaseEcheance  implements Serializable {

	public static String REF = "Echeance";
	public static String PROP_MONTANT_ECHANCE = "MontantEchance";
	public static String PROP_LIB_ECHEANCE = "LibEcheance";
	public static String PROP_DATE_ECHANCE = "DateEchance";
	public static String PROP_CODE_ECOLAGE = "CodeEcolage";
	public static String PROP_ID = "Id";


	// constructors
	public BaseEcheance () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseEcheance (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseEcheance (
		java.lang.Integer id,
		hibernate.beans.Ecolages codeEcolage) {

		this.setId(id);
		this.setCodeEcolage(codeEcolage);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.math.BigDecimal montantEchance;
	private java.util.Date dateEchance;
	private java.lang.String libEcheance;

	// many to one
	private hibernate.beans.Ecolages codeEcolage;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_ECHEANCE"
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
	 * Return the value associated with the column: MONTANT_ECHANCE
	 */
	public java.math.BigDecimal getMontantEchance () {
		return montantEchance;
	}

	/**
	 * Set the value related to the column: MONTANT_ECHANCE
	 * @param montantEchance the MONTANT_ECHANCE value
	 */
	public void setMontantEchance (java.math.BigDecimal montantEchance) {
		this.montantEchance = montantEchance;
	}



	/**
	 * Return the value associated with the column: DATE_ECHANCE
	 */
	public java.util.Date getDateEchance () {
		return dateEchance;
	}

	/**
	 * Set the value related to the column: DATE_ECHANCE
	 * @param dateEchance the DATE_ECHANCE value
	 */
	public void setDateEchance (java.util.Date dateEchance) {
		this.dateEchance = dateEchance;
	}



	/**
	 * Return the value associated with the column: LIB_ECHEANCE
	 */
	public java.lang.String getLibEcheance () {
		return libEcheance;
	}

	/**
	 * Set the value related to the column: LIB_ECHEANCE
	 * @param libEcheance the LIB_ECHEANCE value
	 */
	public void setLibEcheance (java.lang.String libEcheance) {
		this.libEcheance = libEcheance;
	}



	/**
	 * Return the value associated with the column: CODE_ECOLAGE
	 */
	public hibernate.beans.Ecolages getCodeEcolage () {
		return codeEcolage;
	}

	/**
	 * Set the value related to the column: CODE_ECOLAGE
	 * @param codeEcolage the CODE_ECOLAGE value
	 */
	public void setCodeEcolage (hibernate.beans.Ecolages codeEcolage) {
		this.codeEcolage = codeEcolage;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.Echeance)) return false;
		else {
			hibernate.beans.Echeance echeance = (hibernate.beans.Echeance) obj;
			if (null == this.getId() || null == echeance.getId()) return false;
			else return (this.getId().equals(echeance.getId()));
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