package hibernate.beans;

import hibernate.beans.base.BaseCandidatSallePK;

public class CandidatSallePK extends BaseCandidatSallePK {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CandidatSallePK () {}
	
	public CandidatSallePK (
		hibernate.beans.Salles codeSalle,
		hibernate.beans.Candidat numCandidat) {

		super (
			codeSalle,
			numCandidat);
	}
/*[CONSTRUCTOR MARKER END]*/


}