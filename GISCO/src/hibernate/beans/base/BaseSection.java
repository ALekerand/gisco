package hibernate.beans.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the section table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="section"
 */

public abstract class BaseSection  implements Serializable {

	public static String REF = "Section";
	public static String PROP_NOM_SECTION = "NomSection";
	public static String PROP_SECTION_EXAM = "SectionExam";
	public static String PROP_ID = "Id";
	public static String PROP_ABREV_SECTION = "AbrevSection";
	public static String PROP_CODE_FILIERE = "CodeFiliere";


	// constructors
	public BaseSection () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseSection (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseSection (
		java.lang.Integer id,
		hibernate.beans.Filieres codeFiliere) {

		this.setId(id);
		this.setCodeFiliere(codeFiliere);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String nomSection;
	private java.lang.String abrevSection;
	private boolean sectionExam;

	// many to one
	private hibernate.beans.Filieres codeFiliere;

	// collections
	private java.util.Set<hibernate.beans.Matiere> matieres;
	private java.util.Set<hibernate.beans.Ecolages> ecolages;
	private java.util.Set<hibernate.beans.Inscriptions> inscriptions;
	private java.util.Set<hibernate.beans.MatiereExam> matiereExams;
	private java.util.Set<hibernate.beans.Parammatierexam> parammatierexams;
	private java.util.Set<hibernate.beans.Parammatiere> parammatieres;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.IncrementGenerator"
     *  column="CODE_SECTION"
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
	 * Return the value associated with the column: NOM_SECTION
	 */
	public java.lang.String getNomSection () {
		return nomSection;
	}

	/**
	 * Set the value related to the column: NOM_SECTION
	 * @param nomSection the NOM_SECTION value
	 */
	public void setNomSection (java.lang.String nomSection) {
		this.nomSection = nomSection;
	}



	/**
	 * Return the value associated with the column: ABREV_SECTION
	 */
	public java.lang.String getAbrevSection () {
		return abrevSection;
	}

	/**
	 * Set the value related to the column: ABREV_SECTION
	 * @param abrevSection the ABREV_SECTION value
	 */
	public void setAbrevSection (java.lang.String abrevSection) {
		this.abrevSection = abrevSection;
	}



	/**
	 * Return the value associated with the column: SECTION_EXAM
	 */
	public boolean isSectionExam () {
		return sectionExam;
	}

	/**
	 * Set the value related to the column: SECTION_EXAM
	 * @param sectionExam the SECTION_EXAM value
	 */
	public void setSectionExam (boolean sectionExam) {
		this.sectionExam = sectionExam;
	}



	/**
	 * Return the value associated with the column: CODE_FILIERE
	 */
	public hibernate.beans.Filieres getCodeFiliere () {
		return codeFiliere;
	}

	/**
	 * Set the value related to the column: CODE_FILIERE
	 * @param codeFiliere the CODE_FILIERE value
	 */
	public void setCodeFiliere (hibernate.beans.Filieres codeFiliere) {
		this.codeFiliere = codeFiliere;
	}



	/**
	 * Return the value associated with the column: Matieres
	 */
	public java.util.Set<hibernate.beans.Matiere> getMatieres () {
		return matieres;
	}

	/**
	 * Set the value related to the column: Matieres
	 * @param matieres the Matieres value
	 */
	public void setMatieres (java.util.Set<hibernate.beans.Matiere> matieres) {
		this.matieres = matieres;
	}

	public void addToMatieres (hibernate.beans.Matiere matiere) {
		if (null == getMatieres()) setMatieres(new java.util.TreeSet<hibernate.beans.Matiere>());
		getMatieres().add(matiere);
	}



	/**
	 * Return the value associated with the column: Ecolages
	 */
	public java.util.Set<hibernate.beans.Ecolages> getEcolages () {
		return ecolages;
	}

	/**
	 * Set the value related to the column: Ecolages
	 * @param ecolages the Ecolages value
	 */
	public void setEcolages (java.util.Set<hibernate.beans.Ecolages> ecolages) {
		this.ecolages = ecolages;
	}

	public void addToEcolages (hibernate.beans.Ecolages ecolages) {
		if (null == getEcolages()) setEcolages(new java.util.TreeSet<hibernate.beans.Ecolages>());
		getEcolages().add(ecolages);
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



	/**
	 * Return the value associated with the column: MatiereExams
	 */
	public java.util.Set<hibernate.beans.MatiereExam> getMatiereExams () {
		return matiereExams;
	}

	/**
	 * Set the value related to the column: MatiereExams
	 * @param matiereExams the MatiereExams value
	 */
	public void setMatiereExams (java.util.Set<hibernate.beans.MatiereExam> matiereExams) {
		this.matiereExams = matiereExams;
	}

	public void addToMatiereExams (hibernate.beans.MatiereExam matiereExam) {
		if (null == getMatiereExams()) setMatiereExams(new java.util.TreeSet<hibernate.beans.MatiereExam>());
		getMatiereExams().add(matiereExam);
	}



	/**
	 * Return the value associated with the column: Parammatierexams
	 */
	public java.util.Set<hibernate.beans.Parammatierexam> getParammatierexams () {
		return parammatierexams;
	}

	/**
	 * Set the value related to the column: Parammatierexams
	 * @param parammatierexams the Parammatierexams value
	 */
	public void setParammatierexams (java.util.Set<hibernate.beans.Parammatierexam> parammatierexams) {
		this.parammatierexams = parammatierexams;
	}

	public void addToParammatierexams (hibernate.beans.Parammatierexam parammatierexam) {
		if (null == getParammatierexams()) setParammatierexams(new java.util.TreeSet<hibernate.beans.Parammatierexam>());
		getParammatierexams().add(parammatierexam);
	}



	/**
	 * Return the value associated with the column: Parammatieres
	 */
	public java.util.Set<hibernate.beans.Parammatiere> getParammatieres () {
		return parammatieres;
	}

	/**
	 * Set the value related to the column: Parammatieres
	 * @param parammatieres the Parammatieres value
	 */
	public void setParammatieres (java.util.Set<hibernate.beans.Parammatiere> parammatieres) {
		this.parammatieres = parammatieres;
	}

	public void addToParammatieres (hibernate.beans.Parammatiere parammatiere) {
		if (null == getParammatieres()) setParammatieres(new java.util.TreeSet<hibernate.beans.Parammatiere>());
		getParammatieres().add(parammatiere);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.beans.Section)) return false;
		else {
			hibernate.beans.Section section = (hibernate.beans.Section) obj;
			if (null == this.getId() || null == section.getId()) return false;
			else return (this.getId().equals(section.getId()));
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