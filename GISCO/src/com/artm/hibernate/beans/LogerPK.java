package com.artm.hibernate.beans;

import com.artm.hibernate.beans.base.BaseLogerPK;

public class LogerPK extends BaseLogerPK {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public LogerPK () {}
	
	public LogerPK (
		com.artm.hibernate.beans.Etudiants numetudiant,
		com.artm.hibernate.beans.Logement codeLoge) {

		super (
			numetudiant,
			codeLoge);
	}
/*[CONSTRUCTOR MARKER END]*/


}