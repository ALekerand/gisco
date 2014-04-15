package combo;

import hibernate.beans.Niveaux;

import java.util.ArrayList;
import java.util.List;


import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import dao.Crud;

public class ComboNiveau implements Converter {
	private Crud monCrud = new Crud();
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

	
	
	public Crud getMonCrud() {
		return monCrud;
	}

	public void setMonCrud(Crud monCrud) {
		this.monCrud = monCrud;
	}

	

	public List<Niveaux> getListNiveaux() {
		listNiveaux = new ArrayList();
		for(Object nv :getMonCrud().getObjects("Niveaux"))
			listNiveaux.add((Niveaux) nv);
		return listNiveaux;
	}

	public void setListNiveaux(List<Niveaux> listNiveaux) {
		this.listNiveaux = listNiveaux;
	}
	
	
	
	
	//******************************ACCESSEURS*****************************************//
	
}
