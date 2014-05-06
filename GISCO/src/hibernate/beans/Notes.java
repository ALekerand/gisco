package hibernate.beans;

import hibernate.beans.base.BaseNotes;



public class Notes extends BaseNotes {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Notes () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Notes (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Notes (
		java.lang.Integer id,
		hibernate.beans.Semestre codeSemestre,
		hibernate.beans.Etudiants numetudiant,
		hibernate.beans.Annees codeAnnees,
		hibernate.beans.Matiere codeMatiere) {

		super (
			id,
			codeSemestre,
			numetudiant,
			codeAnnees,
			codeMatiere);
	}

/*[CONSTRUCTOR MARKER END]*/


}