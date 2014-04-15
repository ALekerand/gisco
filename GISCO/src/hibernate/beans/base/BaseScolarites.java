package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the scolarites table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="scolarites"
 */

public abstract class BaseScolarites  implements Serializable {

	public static String REF = "Scolarites";
	public static String PROP_FRAIS_EXAMEN = "FraisExamen";
	public static String PROP_FRAIS_ANNEXE = "FraisAnnexe";
	public static String PROP_FRAIS_ASSURANCE = "FraisAssurance";
	public static String PROP_CODE_ANNEES = "CodeAnnees";
	public static String PROP_FRAIS_TENUE_COMPLET = "FraisTenueComplet";
	public static String PROP_NUMETUDIANT = "Numetudiant";
	public static String PROP_FRAIS_INSCRIPTION = "FraisInscription";
	public static String PROP_ID = "Id";
	public static String PROP_MT_ECOLAGE = "MtEcolage";
	public static String PROP_FRAIS_RESTAURATION = "FraisRestauration";
	public static String PROP_FRAIS_CAMPUS = "FraisCampus";
	public static String PROP_FRAIS_TENUE_SPORT = "FraisTenueSport";


	// constructors
	public BaseScolarites () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseScolarites (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseScolarites (
		java.lang.Integer id,
		hibernate.beans.Etudiants numetudiant,
		hibernate.beans.Annees codeAnnees) {

		this.setId(id);
		this.setNumetudiant(numetudiant);
		this.setCodeAnnees(codeAnnees);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.math.BigDecimal fraisInscription;
	private java.math.BigDecimal fraisAssurance;
	private java.math.BigDecimal fraisTenueComplet;
	private java.math.BigDecimal fraisCampus;
	private java.math.BigDecimal fraisTenueSport;
	private java.math.BigDecimal mtEcolage;
	private java.math.BigDecimal fraisAnnexe;
	private java.math.BigDecimal fraisRestauration;
	private java.math.BigDecimal fraisExamen;

	// many to one
	private hibernate.beans.Etudiants numetudiant;
	private hibernate.beans.Annees codeAnnees;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_SCOLARITE"
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
	 * Return the value associated with the column: FRAIS_INSCRIPTION
	 */
	public java.math.BigDecimal getFraisInscription () {
		return fraisInscription;
	}

	/**
	 * Set the value related to the column: FRAIS_INSCRIPTION
	 * @param fraisInscription the FRAIS_INSCRIPTION value
	 */
	public void setFraisInscription (java.math.BigDecimal fraisInscription) {
		this.fraisInscription = fraisInscription;
	}



	/**
	 * Return the value associated with the column: FRAIS_ASSURANCE
	 */
	public java.math.BigDecimal getFraisAssurance () {
		return fraisAssurance;
	}

	/**
	 * Set the value related to the column: FRAIS_ASSURANCE
	 * @param fraisAssurance the FRAIS_ASSURANCE value
	 */
	public void setFraisAssurance (java.math.BigDecimal fraisAssurance) {
		this.fraisAssurance = fraisAssurance;
	}



	/**
	 * Return the value associated with the column: FRAIS_TENUE_COMPLET
	 */
	public java.math.BigDecimal getFraisTenueComplet () {
		return fraisTenueComplet;
	}

	/**
	 * Set the value related to the column: FRAIS_TENUE_COMPLET
	 * @param fraisTenueComplet the FRAIS_TENUE_COMPLET value
	 */
	public void setFraisTenueComplet (java.math.BigDecimal fraisTenueComplet) {
		this.fraisTenueComplet = fraisTenueComplet;
	}



	/**
	 * Return the value associated with the column: FRAIS_CAMPUS
	 */
	public java.math.BigDecimal getFraisCampus () {
		return fraisCampus;
	}

	/**
	 * Set the value related to the column: FRAIS_CAMPUS
	 * @param fraisCampus the FRAIS_CAMPUS value
	 */
	public void setFraisCampus (java.math.BigDecimal fraisCampus) {
		this.fraisCampus = fraisCampus;
	}



	/**
	 * Return the value associated with the column: FRAIS_TENUE_SPORT
	 */
	public java.math.BigDecimal getFraisTenueSport () {
		return fraisTenueSport;
	}

	/**
	 * Set the value related to the column: FRAIS_TENUE_SPORT
	 * @param fraisTenueSport the FRAIS_TENUE_SPORT value
	 */
	public void setFraisTenueSport (java.math.BigDecimal fraisTenueSport) {
		this.fraisTenueSport = fraisTenueSport;
	}



	/**
	 * Return the value associated with the column: MT_ECOLAGE
	 */
	public java.math.BigDecimal getMtEcolage () {
		return mtEcolage;
	}

	/**
	 * Set the value related to the column: MT_ECOLAGE
	 * @param mtEcolage the MT_ECOLAGE value
	 */
	public void setMtEcolage (java.math.BigDecimal mtEcolage) {
		this.mtEcolage = mtEcolage;
	}



	/**
	 * Return the value associated with the column: FRAIS_ANNEXE
	 */
	public java.math.BigDecimal getFraisAnnexe () {
		return fraisAnnexe;
	}

	/**
	 * Set the value related to the column: FRAIS_ANNEXE
	 * @param fraisAnnexe the FRAIS_ANNEXE value
	 */
	public void setFraisAnnexe (java.math.BigDecimal fraisAnnexe) {
		this.fraisAnnexe = fraisAnnexe;
	}



	/**
	 * Return the value associated with the column: FRAIS_RESTAURATION
	 */
	public java.math.BigDecimal getFraisRestauration () {
		return fraisRestauration;
	}

	/**
	 * Set the value related to the column: FRAIS_RESTAURATION
	 * @param fraisRestauration the FRAIS_RESTAURATION value
	 */
	public void setFraisRestauration (java.math.BigDecimal fraisRestauration) {
		this.fraisRestauration = fraisRestauration;
	}



	/**
	 * Return the value associated with the column: FRAIS_EXAMEN
	 */
	public java.math.BigDecimal getFraisExamen () {
		return fraisExamen;
	}

	/**
	 * Set the value related to the column: FRAIS_EXAMEN
	 * @param fraisExamen the FRAIS_EXAMEN value
	 */
	public void setFraisExamen (java.math.BigDecimal fraisExamen) {
		this.fraisExamen = fraisExamen;
	}



	/**
	 * Return the value associated with the column: NUMETUDIANT
	 */
	public hibernate.beans.Etudiants getNumetudiant () {
		return numetudiant;
	}

	/**
	 * Set the value related to the column: NUMETUDIANT
	 * @param numetudiant the NUMETUDIANT value
	 */
	public void setNumetudiant (hibernate.beans.Etudiants numetudiant) {
		this.numetudiant = numetudiant;
	}



	/**
	 * Return the value associated with the column: CODE_ANNEES
	 */
	public hibernate.beans.Annees getCodeAnnees () {
		return codeAnnees;
	}

	/**
	 * Set the value related to the column: CODE_ANNEES
	 * @param codeAnnees the CODE_ANNEES value
	 */
	public void setCodeAnnees (hibernate.beans.Annees codeAnnees) {
		this.codeAnnees = codeAnnees;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.Scolarites)) return false;
		else {
			hibernate.beans.Scolarites scolarites = (hibernate.beans.Scolarites) obj;
			if (null == this.getId() || null == scolarites.getId()) return false;
			else return (this.getId().equals(scolarites.getId()));
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