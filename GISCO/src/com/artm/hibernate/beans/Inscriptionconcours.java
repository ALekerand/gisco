package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseInscriptionconcours;



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
		com.artm.hibernate.beans.Anneeconcours codeAnneesConcours,
		com.artm.hibernate.beans.Candidat numCandidat,
		com.artm.hibernate.beans.Concours codeConcours) {

		super (
			id,
			codeAnneesConcours,
			numCandidat,
			codeConcours);
	}

/*[CONSTRUCTOR MARKER END]*/


}