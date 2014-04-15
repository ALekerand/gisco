package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the regime table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="regime"
 */

public abstract class BaseRegime  implements Serializable {

	public static String REF = "Regime";
	public static String PROP_LIB_REGIME = "LibRegime";
	public static String PROP_ID = "Id";


	// constructors
	public BaseRegime () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseRegime (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libRegime;

	// collections
	private java.util.Set<hibernate.beans.Inscriptions> inscriptions;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_REGIME"
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
	 * Return the value associated with the column: LIB_REGIME
	 */
	public java.lang.String getLibRegime () {
		return libRegime;
	}

	/**
	 * Set the value related to the column: LIB_REGIME
	 * @param libRegime the LIB_REGIME value
	 */
	public void setLibRegime (java.lang.String libRegime) {
		this.libRegime = libRegime;
	}



	/**
	 * Return the value associated with the column: Inscriptions
	 */
	public java.util.Set<hibernate.beans.Inscriptions> getInscriptions () {
		return inscriptions;
	}

	/**
	 * Set the value related to the column: Inscriptions
	 * @param inscriptions the Inscriptions value
	 */
	public void setInscriptions (java.util.Set<hibernate.beans.Inscriptions> inscriptions) {
		this.inscriptions = inscriptions;
	}

	public void addToInscriptions (hibernate.beans.Inscriptions inscriptions) {
		if (null == getInscriptions()) setInscriptions(new java.util.TreeSet<hibernate.beans.Inscriptions>());
		getInscriptions().add(inscriptions);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.Regime)) return false;
		else {
			hibernate.beans.Regime regime = (hibernate.beans.Regime) obj;
			if (null == this.getId() || null == regime.getId()) return false;
			else return (this.getId().equals(regime.getId()));
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