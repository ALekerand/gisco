package hibernate.beans;

import hibernate.beans.base.BaseSection;



public class Section extends BaseSection {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Section () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Section (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Section (
		java.lang.Integer id,
		hibernate.beans.Filieres codeFiliere) {

		super (
			id,
			codeFiliere);
	}

/*[CONSTRUCTOR MARKER END]*/


}