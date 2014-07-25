package com.artm.managedBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.artm.hibernate.beans.Anneeconcours;
import com.artm.hibernate.beans.Pays;
import com.artm.objetService.IService;
import com.artm.requetes.ReqAnneeConcours;

@Component
@Scope("session")
public class ManageJonctionPhoto implements Serializable {
	
	private static final long serialVersionUID=1L;
	
	// Injection de spring
	@Autowired
	IService  service;
	@Autowired
	ReqAnneeConcours reqAnneeConcours;
	
	
	
	private Anneeconcours monObjetAnneeconcours = new Anneeconcours();
	private List<Pays> listePays = new ArrayList<>();
	private Pays selectedPay = new Pays();
	

	
	public List recuperPays(){
		List<Anneeconcours> listeAnnecours = new ArrayList<>();
		listeAnnecours = getReqAnneeConcours().recupererAnneeConcours(monObjetAnneeconcours.getLibAnneeConcours());
		for (Anneeconcours anneeconcours : listeAnnecours ) {
			listePays.add(anneeconcours.getCodepays());
		}
		return listePays;
		
	}
	
	
	
	
// ******************* Getters and Setters ******************

	public Anneeconcours getMonObjetAnneeconcours() {
		setMonObjetAnneeconcours(reqAnneeConcours.recupererDernierAnneeConcours().get(0));
		return monObjetAnneeconcours;
	}



	public void setMonObjetAnneeconcours(Anneeconcours monObjetAnneeconcours) {
		this.monObjetAnneeconcours = monObjetAnneeconcours;
	}



	public IService getService() {
		return service;
	}



	public void setService(IService service) {
		this.service = service;
	}



	public ReqAnneeConcours getReqAnneeConcours() {
		return reqAnneeConcours;
	}



	public void setReqAnneeConcours(ReqAnneeConcours reqAnneeConcours) {
		this.reqAnneeConcours = reqAnneeConcours;
	}




	public List<Pays> getListePays() {
		recuperPays();
		System.out.println("------taille de la liste"+listePays.size()); //clean afteer
		return listePays;
	}




	public void setListePays(List<Pays> listePays) {
		this.listePays = listePays;
	}




	public Pays getSelectedPay() {
		return selectedPay;
	}




	public void setSelectedPay(Pays selectedPay) {
		this.selectedPay = selectedPay;
	}
	
	
	
	
	

}
