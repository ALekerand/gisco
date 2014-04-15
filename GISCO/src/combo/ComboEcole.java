package combo;

import hibernate.beans.Ecole;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import dao.Crud;

public class ComboEcole implements Converter {	
	private List<Ecole> listeEcole;
	private Crud monCrud = new Crud();

	public ComboEcole() {
		// TODO Auto-generated constructor stub
	}	
	
	@Override
	public Object getAsObject(FacesContext facesContext, UIComponent component, String submittedValue) {
		System.out.println("M�thode converter getAsObject �cole appel�e");//Clean After

		// TODO Auto-generated method stub
		if (submittedValue.trim().equals("")) {
    		System.out.println("**** Ecole non trouv�e:");//Clean After

            return null;
        } else {
            try {
            	
                for (Ecole ec : getListeEcole()) {
                    if (ec.getAbrevEcole().equalsIgnoreCase(submittedValue)) {
                		System.out.println("****Ecole:"+ec.getNomEcole());//Clean After
                        return ec;
                    }
                }
                
            } catch(Exception exception) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid Ecole"));
            }
        }
	return null;
	}

	@Override
	public String getAsString(FacesContext facesContext, UIComponent component, Object value) {
		// TODO Auto-generated method stub
		System.out.println("M�thode converter getAsString nationalit� appel�e");//Clean After
		 if (value == null || value.equals("")) {
	            return "";
	        } else {
	            return ((Ecole) value).getAbrevEcole();
	        }
	}
	
	
	//***********************************ACCESSEURS**********************************

	public List<Ecole> getListeEcole() {
		listeEcole = new ArrayList<>();
			for(Object ec:getMonCrud().getObjects("Ecole")){
				listeEcole.add((Ecole) ec);
			}
		
		return listeEcole;
	}

	public void setListeEcole(List<Ecole> listeEcole) {
		this.listeEcole = listeEcole;
	}

	public Crud getMonCrud() {
		return monCrud;
	}

	public void setMonCrud(Crud monCrud) {
		this.monCrud = monCrud;
	}

}
