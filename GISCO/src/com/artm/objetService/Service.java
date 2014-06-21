package com.artm.objetService;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.artm.objetDao.IDao;

@Transactional(readOnly=true)
public class Service implements IService {
 IDao dao;
 
 
	@Override
	@Transactional(readOnly=false)
	public void saveObject(Object objet) {
		
		// TODO Auto-generated method stub
		getDao().saveObject(objet);
	}

	@Override
	public Object getObject(int id, String objet) {
		// TODO Auto-generated method stub
	return	getDao().getObject(id, objet);
		 
	}

	@Override
	public Object getObject(String id, String objet) {
		// TODO Auto-generated method stub
		return getDao().getObject(id, objet);
		 
	}
	
	
	@Transactional(readOnly=false)
	@Override
	public void updateObject(Object objet) {
		// TODO Auto-generated method stub
		getDao().updateObject(objet);
	}
	
	@Transactional(readOnly=false)
	@Override
	public void deleteObject(Object objet) {
		// TODO Auto-generated method stub
		getDao().deleteObject(objet);
	}

	@Override
	public List getObjects(String objet) {
		// TODO Auto-generated method stub
	return	getDao().getObjects(objet);
		 
	}

	@Override
	public List<Object> getojects(Object object) {
		// TODO Auto-generated method stub
	return	getDao().getojects(object);
		 
	}

	//getter et setter de Idao qui a été injecté
	
	public IDao getDao() {
		return dao;
		}
	
	public void setDao(IDao dao) {
		this.dao = dao;
	}

}
