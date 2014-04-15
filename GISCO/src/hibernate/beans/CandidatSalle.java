package hibernate.beans;

import hibernate.beans.base.BaseCandidatSalle;



public class CandidatSalle extends BaseCandidatSalle {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CandidatSalle () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CandidatSalle (hibernate.beans.CandidatSallePK id) {
		super(id);
	}

/*[CONSTRUCTOR MARKER END]*/


}