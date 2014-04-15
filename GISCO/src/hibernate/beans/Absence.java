package hibernate.beans;

import hibernate.beans.base.BaseAbsence;



public class Absence extends BaseAbsence {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Absence () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Absence (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Absence (
		java.lang.Integer id,
		hibernate.beans.Semestre codeSemestre,
		hibernate.beans.Etudiants numetudiant,
		hibernate.beans.Nature codeNature,
		hibernate.beans.Annees codeAnnees,
		hibernate.beans.Motif codeMotif) {

		super (
			id,
			codeSemestre,
			numetudiant,
			codeNature,
			codeAnnees,
			codeMotif);
	}

/*[CONSTRUCTOR MARKER END]*/


}