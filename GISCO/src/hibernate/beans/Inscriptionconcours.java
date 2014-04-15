package hibernate.beans;

import hibernate.beans.base.BaseInscriptionconcours;



public class Inscriptionconcours extends BaseInscriptionconcours {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Inscriptionconcours () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Inscriptionconcours (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Inscriptionconcours (
		java.lang.Integer id,
		hibernate.beans.Anneeconcours codeAnneesConcours,
		hibernate.beans.Candidat numCandidat,
		hibernate.beans.Concours codeConcours) {

		super (
			id,
			codeAnneesConcours,
			numCandidat,
			codeConcours);
	}

/*[CONSTRUCTOR MARKER END]*/


}