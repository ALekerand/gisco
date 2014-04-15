package hibernate.beans;

import hibernate.beans.base.BaseEtudiantCandidature;



public class EtudiantCandidature extends BaseEtudiantCandidature {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public EtudiantCandidature () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public EtudiantCandidature (hibernate.beans.EtudiantCandidaturePK id) {
		super(id);
	}

/*[CONSTRUCTOR MARKER END]*/


}