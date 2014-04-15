package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the utilisateurs table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="utilisateurs"
 */

public abstract class BaseUtilisateurs  implements Serializable {

	public static String REF = "Utilisateurs";
	public static String PROP_MOT_DE_PASSE = "MotDePasse";
	public static String PROP_NOM_UTILISATEUR = "NomUtilisateur";
	public static String PROP_ID = "Id";


	// constructors
	public BaseUtilisateurs () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseUtilisateurs (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String nomUtilisateur;
	private java.lang.String motDePasse;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_UTILISATEUR"
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
	 * Return the value associated with the column: NOM_UTILISATEUR
	 */
	public java.lang.String getNomUtilisateur () {
		return nomUtilisateur;
	}

	/**
	 * Set the value related to the column: NOM_UTILISATEUR
	 * @param nomUtilisateur the NOM_UTILISATEUR value
	 */
	public void setNomUtilisateur (java.lang.String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}



	/**
	 * Return the value associated with the column: MOT_DE_PASSE
	 */
	public java.lang.String getMotDePasse () {
		return motDePasse;
	}

	/**
	 * Set the value related to the column: MOT_DE_PASSE
	 * @param motDePasse the MOT_DE_PASSE value
	 */
	public void setMotDePasse (java.lang.String motDePasse) {
		this.motDePasse = motDePasse;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.Utilisateurs)) return false;
		else {
			hibernate.beans.Utilisateurs utilisateurs = (hibernate.beans.Utilisateurs) obj;
			if (null == this.getId() || null == utilisateurs.getId()) return false;
			else return (this.getId().equals(utilisateurs.getId()));
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