/**
 * 
 */
package com.artm.managedBeans;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.artm.hibernate.beans.Ecole;
import com.artm.hibernate.beans.Filieres;
import com.artm.objetService.IService;

/**
 * @author NGORAN
 *
 */
@Component
@Scope("session")
public class ManageFiliere implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private static  Logger logger=Logger.getLogger(ManageEcole.class);
	
	//Injection de Spring
	@Autowired
	IService service;
	
	private Ecole selectedEcole = new Ecole();
	private Filieres maFiliere = new Filieres();
	
	public void enregistrerFiliere(){
		
	}
	
	
	// getters and Setters

	public Ecole getSelectedEcole() {
		return selectedEcole;
	}

	public void setSelectedEcole(Ecole selectedEcole) {
		this.selectedEcole = selectedEcole;
	}


	public Filieres getMaFiliere() {
		return maFiliere;
	}


	public void setMaFiliere(Filieres maFiliere) {
		this.maFiliere = maFiliere;
	}
	

}
