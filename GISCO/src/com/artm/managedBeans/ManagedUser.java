package com.artm.managedBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.artm.hibernate.beans.Users;
import com.artm.requetes.RequeteUtilisateur;

@Component
@Scope("session")
public class ManagedUser {
	
	//Injection par Spring
	@Autowired
	RequeteUtilisateur requeteUtilisateur;
	
	private Users utilisateur = new Users();
	private boolean submenu_10 = true;
	private boolean menuItem_101 = true;
	private String menuPersonnalise = "OK";
	
	
	
	
	public String gestionMenu(){
		setUtilisateur(getRequeteUtilisateur().RecupererUtilisateurCourrant());
		System.out.println("-------->>> Login Utilisateur: "+utilisateur.getUserName());
		if (!(utilisateur.isSubmenu10())) {
		setSubmenu_10(false);
			System.out.println("----->> Desactivation sbmenu10:");
		}
		
		if (!(utilisateur.isMenuitem101())) {
			setMenuItem_101(false);
				System.out.println("----->> Desactivation itemmenu10:");
			}
		
		return "menu_principal";
		
	}



//**********************************  ACCESSEURS*************************************//
	
	public RequeteUtilisateur getRequeteUtilisateur() {
		return requeteUtilisateur;
	}



	public void setRequeteUtilisateur(RequeteUtilisateur requeteUtilisateur) {
		this.requeteUtilisateur = requeteUtilisateur;
	}



	public Users getUtilisateur() {
		return utilisateur;
	}



	public void setUtilisateur(Users utilisateur) {
		this.utilisateur = utilisateur;
	}



	public boolean isSubmenu_10() {
		return submenu_10;
	}



	public void setSubmenu_10(boolean submenu_10) {
		this.submenu_10 = submenu_10;
	}



	public boolean isMenuItem_101() {
		return menuItem_101;
	}



	public void setMenuItem_101(boolean menuItem_101) {
		this.menuItem_101 = menuItem_101;
	}



	public String getMenuPersonnalise() {
		gestionMenu();
		return menuPersonnalise;
	}



	public void setMenuPersonnalise(String menuPersonnalise) {
		this.menuPersonnalise = menuPersonnalise;
	}
}
