package hibernate.beans;

import hibernate.beans.base.BaseParammatierexam;



public class Parammatierexam extends BaseParammatierexam {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Parammatierexam () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Parammatierexam (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Parammatierexam (
		java.lang.Integer id,
		hibernate.beans.Section codeSection,
		hibernate.beans.TypeMatiereExam codeTypeExam) {

		super (
			id,
			codeSection,
			codeTypeExam);
	}

/*[CONSTRUCTOR MARKER END]*/


}