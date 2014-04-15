package hibernate.beans;

import hibernate.beans.base.BaseDetailcampus;



public class Detailcampus extends BaseDetailcampus {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Detailcampus () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Detailcampus (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Detailcampus (
		java.lang.Integer id,
		hibernate.beans.Campus codeCampus) {

		super (
			id,
			codeCampus);
	}

/*[CONSTRUCTOR MARKER END]*/


}