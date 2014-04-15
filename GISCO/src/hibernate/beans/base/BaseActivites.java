package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the activites table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="activites"
 */

public abstract class BaseActivites  implements Serializable {

	public static String REF = "Activites";
	public static String PROP_LIB_ACTIVITE = "LibActivite";
	public static String PROP_ID = "Id";


	// constructors
	public BaseActivites () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseActivites (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libActivite;

	// collections
	private java.util.Set<hibernate.beans.Versement> versements;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_ACTIVITE"
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
	 * Return the value associated with the column: LIB_ACTIVITE
	 */
	public java.lang.String getLibActivite () {
		return libActivite;
	}

	/**
	 * Set the value related to the column: LIB_ACTIVITE
	 * @param libActivite the LIB_ACTIVITE value
	 */
	public void setLibActivite (java.lang.String libActivite) {
		this.libActivite = libActivite;
	}



	/**
	 * Return the value associated with the column: Versements
	 */
	public java.util.Set<hibernate.beans.Versement> getVersements () {
		return versements;
	}

	/**
	 * Set the value related to the column: Versements
	 * @param versements the Versements value
	 */
	public void setVersements (java.util.Set<hibernate.beans.Versement> versements) {
		this.versements = versements;
	}

	public void addToVersements (hibernate.beans.Versement versement) {
		if (null == getVersements()) setVersements(new java.util.TreeSet<hibernate.beans.Versement>());
		getVersements().add(versement);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.Activites)) return false;
		else {
			hibernate.beans.Activites activites = (hibernate.beans.Activites) obj;
			if (null == this.getId() || null == activites.getId()) return false;
			else return (this.getId().equals(activites.getId()));
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