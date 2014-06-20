package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseCandidatSallePK;

public class CandidatSallePK extends BaseCandidatSallePK {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CandidatSallePK () {}
	
	public CandidatSallePK (
		com.artm.hibernate.beans.Salles codeSalle,
		com.artm.hibernate.beans.Candidat numCandidat) {

		super (
			codeSalle,
			numCandidat);
	}
/*[CONSTRUCTOR MARKER END]*/


}