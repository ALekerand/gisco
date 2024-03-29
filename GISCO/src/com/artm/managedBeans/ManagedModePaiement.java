package com.artm.managedBeans;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.artm.hibernate.beans.Mode;
import com.artm.objetService.IService;

@Component
@Scope("request")
public class ManagedModePaiement implements Serializable {
	// injection de Spring
	@Autowired
	IService service;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Attribut d'instance
	private Mode mode = new Mode();
	private List<Mode> listModes;
	
	
	public void enregistrerMode() {
		getService().saveObject(mode);
		viderPage();
	}
	
	public void viderPage() {
		mode.setLibMode("");
	}
	

	//***************************ACCESSEURS**********************************//
	
	public Mode getMode() {
		return mode;
	}
	public void setMode(Mode mode) {
		this.mode = mode;
	}

	public List<Mode> getListModes() {
		listModes = getService().getObjects("Mode");
		return listModes;
	}

	public void setListModes(List<Mode> listModes) {
		this.listModes = listModes;
	}

	public IService getService() {
		return service;
	}

	public void setService(IService service) {
		this.service = service;
	}
	

}
