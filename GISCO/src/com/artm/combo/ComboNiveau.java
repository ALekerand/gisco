package com.artm.combo;

import com.artm.hibernate.beans.Niveaux;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.artm.objetService.IService;

@Component
@Scope("session")
public class ComboNiveau implements Converter {
	
	// Injection de Spring
	@Autowired
	IService service;
	private List<Niveaux> listNiveaux;

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String submittedValue) {
		// TODO Stub de la méthode généré automatiquement
		if (submittedValue.trim().equals("")) {
        	
            return null;
        } else {
            try {

                for (Niveaux nv : getListNiveaux() ) {
                    if (nv.getLibNiveau().equals(submittedValue)) {
                        return nv;
                    }
                }
                
            } catch(Exception exception) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid Profession"));
            }
        }
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		// TODO Stub de la méthode généré automatiquement
		if (value == null || value.equals("")) {
            return "";
        } else {
        	return ((Niveaux) value).getLibNiveau();
        }
	}

	public List<Niveaux> getListNiveaux() {
		listNiveaux = new ArrayList();
		for(Object nv :getService().getObjects("Niveaux"))
			listNiveaux.add((Niveaux) nv);
		return listNiveaux;
	}

	public void setListNiveaux(List<Niveaux> listNiveaux) {
		this.listNiveaux = listNiveaux;
	}

	public IService getService() {
		return service;
	}

	public void setService(IService service) {
		this.service = service;
	}
	
	
	
	
	//******************************ACCESSEURS*****************************************//
	
}
