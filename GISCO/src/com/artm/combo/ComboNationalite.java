package com.artm.combo;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.artm.hibernate.beans.Nationalites;
import com.artm.objetService.IService;

@Component
@Scope("session")

public class ComboNationalite implements Converter {
	
	// Injection de Spring
	@Autowired
	IService service;
	private List<Nationalites> listeNationalite;

	public ComboNationalite() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String comboValue) {
		// TODO Auto-generated method stub
		if(comboValue.trim().equals("")){
			return null;
		}else{
			for(Nationalites ec:listeNationalite){
				if(ec.getLibnationalite().equals(comboValue))
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

	
	//****************Accesseurs******************

	public List<Nationalites> getListeNationalite() {
		listeNationalite = new ArrayList<Nationalites>();
		for(Object ec:getService().getObjects("Nationalites")){
			listeNationalite.add((Nationalites) ec);
		}
		return listeNationalite;
	}

	public void setListeNationalite(List<Nationalites> listeNationalite) {
		this.listeNationalite = listeNationalite;
	}

	public IService getService() {
		return service;
	}

	public void setService(IService service) {
		this.service = service;
	}

}
