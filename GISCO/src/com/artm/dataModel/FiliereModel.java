package com.artm.dataModel;

import java.io.Serializable;
import java.util.List;

import com.artm.hibernate.beans.Filieres;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

public class FiliereModel extends ListDataModel<Filieres> implements
		SelectableDataModel<Filieres>, Serializable {
	
	//CONSTRUCTEUR
	public FiliereModel(){
		
	}
	
	public FiliereModel(List<Filieres> data){
		super(data);
		
	}

	@Override
	public Filieres getRowData(String rowkey) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Filieres> listeFiliere=(List<Filieres>) getWrappedData();
		for(Filieres tata : listeFiliere){
			//if(tata.getId().equals(rowkey))
			if(tata.getId().toString().equals(rowkey))
				return tata;
		}
		return null;
	}

	@Override
	public Object getRowKey(Filieres tata) {
		// TODO Auto-generated method stub
		return tata.getId();
	}

}