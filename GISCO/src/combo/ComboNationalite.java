package combo;

import hibernate.beans.Nationalites;
import hibernate.beans.Pays;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import dao.Crud;

public class ComboNationalite implements Converter {
	private Crud monCrud = new Crud();
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
	
	public Crud getMonCrud() {
		return monCrud;
	}

	public void setMonCrud(Crud monCrud) {
		this.monCrud = monCrud;
	}

	public List<Nationalites> getListeNationalite() {
		listeNationalite = new ArrayList<Nationalites>();
		for(Object ec:getMonCrud().getObjects("Nationalites")){
			listeNationalite.add((Nationalites) ec);
		}
		return listeNationalite;
	}

	public void setListeNationalite(List<Nationalites> listeNationalite) {
		this.listeNationalite = listeNationalite;
	}

}
