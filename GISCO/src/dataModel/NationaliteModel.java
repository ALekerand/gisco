package dataModel;

import hibernate.beans.Nationalites;
import hibernate.beans.Pays;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

@SuppressWarnings("unused")
public class NationaliteModel extends ListDataModel<Nationalites> implements
SelectableDataModel<Nationalites> {

//CONSTRUCTEUR
public NationaliteModel(){

}

public NationaliteModel(List<Nationalites> data){
super(data);

}

@Override
public Nationalites getRowData(String rowkey) {
// TODO Auto-generated method stub
List<Nationalites> listeNationalite=(List<Nationalites>) getWrappedData();
for(Nationalites tata : listeNationalite){
	//if(tata.getId().equals(rowkey))
	if(tata.getId().toString().equals(rowkey))
		return tata;
}
return null;
}

@Override
public Object getRowKey(Nationalites tata) {
// TODO Auto-generated method stub
return tata.getId();
}
	

}
