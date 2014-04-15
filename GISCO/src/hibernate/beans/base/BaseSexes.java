package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the sexes table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="sexes"
 */

public abstract class BaseSexes  implements Serializable {

	public static String REF = "Sexes";
	public static String PROP_ID = "Id";
	public static String PROP_LIBSEXE = "Libsexe";


	// constructors
	public BaseSexes () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseSexes (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String libsexe;

	// collections
	private java.util.Set<hibernate.beans.Candidat> candidats;
	private java.util.Set<hibernate.beans.Etudiants> etudiants;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODESEXE"
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
	 * Return the value associated with the column: LIBSEXE
	 */
	public java.lang.String getLibsexe () {
		return libsexe;
	}

	/**
	 * Set the value related to the column: LIBSEXE
	 * @param libsexe the LIBSEXE value
	 */
	public void setLibsexe (java.lang.String libsexe) {
		this.libsexe = libsexe;
	}



	/**
	 * Return the value associated with the column: Candidats
	 */
	public java.util.Set<hibernate.beans.Candidat> getCandidats () {
		return candidats;
	}

	/**
	 * Set the value related to the column: Candidats
	 * @param candidats the Candidats value
	 */
	public void setCandidats (java.util.Set<hibernate.beans.Candidat> candidats) {
		this.candidats = candidats;
	}

	public void addToCandidats (hibernate.beans.Candidat candidat) {
		if (null == getCandidats()) setCandidats(new java.util.TreeSet<hibernate.beans.Candidat>());
		getCandidats().add(candidat);
	}



	/**
	 * Return the value associated with the column: Etudiants
	 */
	public java.util.Set<hibernate.beans.Etudiants> getEtudiants () {
		return etudiants;
	}

	/**
	 * Set the value related to the column: Etudiants
	 * @param etudiants the Etudiants value
	 */
	public void setEtudiants (java.util.Set<hibernate.beans.Etudiants> etudiants) {
		this.etudiants = etudiants;
	}

	public void addToEtudiants (hibernate.beans.Etudiants etudiants) {
		if (null == getEtudiants()) setEtudiants(new java.util.TreeSet<hibernate.beans.Etudiants>());
		getEtudiants().add(etudiants);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.Sexes)) return false;
		else {
			hibernate.beans.Sexes sexes = (hibernate.beans.Sexes) obj;
			if (null == this.getId() || null == sexes.getId()) return false;
			else return (this.getId().equals(sexes.getId()));
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