package com.artm.dataModel;

import java.util.List;

import com.artm.hibernate.beans.Niveaux;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

public class NiveauModel extends ListDataModel<Niveaux> implements
		SelectableDataModel<Niveaux> {
	
	public NiveauModel(){
		
	}
	
	public NiveauModel(List<Niveaux> data){
		super (data);
		
	}

	@Override
	public Niveaux getRowData(String rowkey) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Niveaux> listeNiveau = (List<Niveaux>) getWrappedData();
		for(Niveaux tata : listeNiveau){
			//if(tata.getId().equals(rowkey))
			if(tata.getId().toString().equals(rowkey))
		return tata;
	}
		return null;
	}

	@Override
	public Object getRowKey(Niveaux tata) {
		// TODO Auto-generated method stub
		return tata.getId();
	}

}
