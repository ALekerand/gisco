package combo;

import hibernate.beans.Ecole;

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

import objetService.IService;

@Component
@Scope("session")

public class ComboEcole implements Converter {
	// Injection de Spring
	@Autowired
	IService service;
	
	private List<Ecole> listeEcole;

	public ComboEcole() {
		// TODO Auto-generated constructor stub
	}	
	
	@Override
	public Object getAsObject(FacesContext facesContext, UIComponent component, String submittedValue) {
		System.out.println("Méthode converter getAsObject école appelée");//Clean After

		// TODO Auto-generated method stub
		if (submittedValue.trim().equals("")) {
    		System.out.println("**** Ecole non trouvée:");//Clean After

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
		System.out.println("Méthode converter getAsString nationalité appelée");//Clean After
		 if (value == null || value.equals("")) {
	            return "";
	        } else {
	            return ((Ecole) value).getAbrevEcole();
	        }
	}
	
	
	//***********************************ACCESSEURS**********************************

	public List<Ecole> getListeEcole() {
		listeEcole = new ArrayList<>();
			for(Object ec:getService().getObjects("Ecole")){
				listeEcole.add((Ecole) ec);
			}
		
		return listeEcole;
	}

	public void setListeEcole(List<Ecole> listeEcole) {
		this.listeEcole = listeEcole;
	}

	public IService getService() {
		return service;
	}

	public void setService(IService service) {
		this.service = service;
	}

}
