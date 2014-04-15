package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the professions table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="professions"
 */

public abstract class BaseProfessions  implements Serializable {

	public static String REF = "Professions";
	public static String PROP_ID = "Id";
	public static String PROP_LIB_PROFESSION = "LibProfession";


	// constructors
	public BaseProfessions () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseProfessions (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libProfession;

	// collections
	private java.util.Set<hibernate.beans.Peres> peres;
	private java.util.Set<hibernate.beans.Meres> meres;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_PROFESSION"
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
	 * Return the value associated with the column: LIB_PROFESSION
	 */
	public java.lang.String getLibProfession () {
		return libProfession;
	}

	/**
	 * Set the value related to the column: LIB_PROFESSION
	 * @param libProfession the LIB_PROFESSION value
	 */
	public void setLibProfession (java.lang.String libProfession) {
		this.libProfession = libProfession;
	}



	/**
	 * Return the value associated with the column: Peres
	 */
	public java.util.Set<hibernate.beans.Peres> getPeres () {
		return peres;
	}

	/**
	 * Set the value related to the column: Peres
	 * @param peres the Peres value
	 */
	public void setPeres (java.util.Set<hibernate.beans.Peres> peres) {
		this.peres = peres;
	}

	public void addToPeres (hibernate.beans.Peres peres) {
		if (null == getPeres()) setPeres(new java.util.TreeSet<hibernate.beans.Peres>());
		getPeres().add(peres);
	}



	/**
	 * Return the value associated with the column: Meres
	 */
	public java.util.Set<hibernate.beans.Meres> getMeres () {
		return meres;
	}

	/**
	 * Set the value related to the column: Meres
	 * @param meres the Meres value
	 */
	public void setMeres (java.util.Set<hibernate.beans.Meres> meres) {
		this.meres = meres;
	}

	public void addToMeres (hibernate.beans.Meres meres) {
		if (null == getMeres()) setMeres(new java.util.TreeSet<hibernate.beans.Meres>());
		getMeres().add(meres);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.Professions)) return false;
		else {
			hibernate.beans.Professions professions = (hibernate.beans.Professions) obj;
			if (null == this.getId() || null == professions.getId()) return false;
			else return (this.getId().equals(professions.getId()));
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