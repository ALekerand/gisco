package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the ecolages table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="ecolages"
 */

public abstract class BaseEcolages  implements Serializable {

	public static String REF = "Ecolages";
	public static String PROP_MONTANT_ECOLAGE = "MontantEcolage";
	public static String PROP_CODE_SECTION = "CodeSection";
	public static String PROP_ID = "Id";


	// constructors
	public BaseEcolages () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseEcolages (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseEcolages (
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
	private java.math.BigDecimal montantEcolage;

	// many to one
	private hibernate.beans.Section codeSection;

	// collections
	private java.util.Set<hibernate.beans.Echeance> echeances;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_ECOLAGE"
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
	 * Return the value associated with the column: MONTANT_ECOLAGE
	 */
	public java.math.BigDecimal getMontantEcolage () {
		return montantEcolage;
	}

	/**
	 * Set the value related to the column: MONTANT_ECOLAGE
	 * @param montantEcolage the MONTANT_ECOLAGE value
	 */
	public void setMontantEcolage (java.math.BigDecimal montantEcolage) {
		this.montantEcolage = montantEcolage;
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
	 * Return the value associated with the column: Echeances
	 */
	public java.util.Set<hibernate.beans.Echeance> getEcheances () {
		return echeances;
	}

	/**
	 * Set the value related to the column: Echeances
	 * @param echeances the Echeances value
	 */
	public void setEcheances (java.util.Set<hibernate.beans.Echeance> echeances) {
		this.echeances = echeances;
	}

	public void addToEcheances (hibernate.beans.Echeance echeance) {
		if (null == getEcheances()) setEcheances(new java.util.TreeSet<hibernate.beans.Echeance>());
		getEcheances().add(echeance);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.Ecolages)) return false;
		else {
			hibernate.beans.Ecolages ecolages = (hibernate.beans.Ecolages) obj;
			if (null == this.getId() || null == ecolages.getId()) return false;
			else return (this.getId().equals(ecolages.getId()));
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