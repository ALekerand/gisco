package com.artm.managedBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.artm.dataModel.SexeModel;
import com.artm.hibernate.beans.Sexes;
import com.artm.objetService.IService;

@Component
@Scope("session")
public class manageSexe implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Injection de Spring
	@Autowired
	IService service;
	
	private Sexes monSexe = new Sexes();
	private SexeModel monSexeModel;
	private List listeSexe = new ArrayList<>();

	
	public void enregistrerSexe(){
		getService().saveObject(monSexe);
		
		
	}
	
	
	public List chargerToutSexe(){
		setListeSexe(getService().getObjects("Sexe"));
		return listeSexe;
	}
// geters et seters

	public Sexes getMonSexe() {
		return monSexe;
	}


	public void setMonSexe(Sexes monSexe) {
		this.monSexe = monSexe;
	}

	public List getListeSexe() {
		return listeSexe;
	}

	public void setListeSexe(List listeSexe) {
		this.listeSexe = listeSexe;
	}

	public SexeModel getMonSexeModel() {
		monSexeModel = new SexeModel();
		return monSexeModel;
	}

	public void setMonSexeModel(SexeModel monSexeModel) {
		this.monSexeModel = monSexeModel;
	}


	public IService getService() {
		return service;
	}


	public void setService(IService service) {
		this.service = service;
	}

}
