package com.artm.combo;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.artm.hibernate.beans.Sexes;
import com.artm.objetService.IService;

@Component
@Scope("session")

public class comboSexe implements Converter {
	//Injection de Spring
	@Autowired
	IService service;
	private List<Sexes> listeSexe;

	public comboSexe() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String comboValue) {
		// TODO Auto-generated method stub
		if(comboValue.trim().equals("")){
			return null;
		}else{
			for(Sexes ec:listeSexe){
				if(ec.getLibsexe().equals(comboValue))
					return ec;
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		
		
		return null;
	}
	
	//Getters and Setters
	public List getListeSexe() {
		listeSexe = new ArrayList<Sexes>();
		for(Object ec:getService().getObjects("Sexes")){
			listeSexe.add((Sexes) ec);
		}
		return listeSexe;
	}

	public void setListeSexe(List listeSexe) {
		this.listeSexe = listeSexe;
	}

	public IService getService() {
		return service;
	}

	public void setService(IService service) {
		this.service = service;
	}

}
