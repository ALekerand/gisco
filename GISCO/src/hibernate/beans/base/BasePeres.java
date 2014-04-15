package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the peres table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="peres"
 */

public abstract class BasePeres  implements Serializable {

	public static String REF = "Peres";
	public static String PROP_CODE_PROFESSION = "CodeProfession";
	public static String PROP_NOM_PRENOMS_PERE = "NomPrenomsPere";
	public static String PROP_ID = "Id";
	public static String PROP_CODE_ADRESSE = "CodeAdresse";


	// constructors
	public BasePeres () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BasePeres (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String nomPrenomsPere;

	// many to one
	private hibernate.beans.Professions codeProfession;
	private hibernate.beans.Adresses codeAdresse;

	// collections
	private java.util.Set<hibernate.beans.Etudiants> etudiants;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="NUM_PERE"
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
	 * Return the value associated with the column: NOM_PRENOMS_PERE
	 */
	public java.lang.String getNomPrenomsPere () {
		return nomPrenomsPere;
	}

	/**
	 * Set the value related to the column: NOM_PRENOMS_PERE
	 * @param nomPrenomsPere the NOM_PRENOMS_PERE value
	 */
	public void setNomPrenomsPere (java.lang.String nomPrenomsPere) {
		this.nomPrenomsPere = nomPrenomsPere;
	}



	/**
	 * Return the value associated with the column: CODE_PROFESSION
	 */
	public hibernate.beans.Professions getCodeProfession () {
		return codeProfession;
	}

	/**
	 * Set the value related to the column: CODE_PROFESSION
	 * @param codeProfession the CODE_PROFESSION value
	 */
	public void setCodeProfession (hibernate.beans.Professions codeProfession) {
		this.codeProfession = codeProfession;
	}



	/**
	 * Return the value associated with the column: CODE_ADRESSE
	 */
	public hibernate.beans.Adresses getCodeAdresse () {
		return codeAdresse;
	}

	/**
	 * Set the value related to the column: CODE_ADRESSE
	 * @param codeAdresse the CODE_ADRESSE value
	 */
	public void setCodeAdresse (hibernate.beans.Adresses codeAdresse) {
		this.codeAdresse = codeAdresse;
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
		if (!(obj instanceof hibernate.beans.Peres)) return false;
		else {
			hibernate.beans.Peres peres = (hibernate.beans.Peres) obj;
			if (null == this.getId() || null == peres.getId()) return false;
			else return (this.getId().equals(peres.getId()));
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