package dataModel;

import java.util.List;

import hibernate.beans.Ecole;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

public class EcoleModel extends ListDataModel<Ecole> implements
		SelectableDataModel<Ecole> {
	
	//CONSTRUCTEUR
	public EcoleModel(){
		
	}
	
	public EcoleModel(List<Ecole> data){
		super(data);
		
	}

	@Override
	public Ecole getRowData(String rowkey) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Ecole> listeEcole=(List<Ecole>) getWrappedData();
		for(Ecole tata : listeEcole){
			//if(tata.getId().equals(rowkey))
			if(tata.getId().toString().equals(rowkey))
				return tata;
		}
		return null;
	}

	@Override
	public Object getRowKey(Ecole tata) {
		// TODO Auto-generated method stub
		return tata.getId();
	}

}
