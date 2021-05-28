package fr.epsi.entites;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("PAR")
public class ClientParticulier extends Client {
	
	private Gender gender;
	private String nom;
	private String prenom;
	
	
	
	
	//getters & setters
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	//Constructeurs
	public ClientParticulier() {
		super();
	}
	
	
	public ClientParticulier(Adresse adresse, String telephone, Collection<Commande> commandes, Gender gender,
			String nom, String prenom) {
		super(adresse, telephone, commandes);  //constructeur avec parametres de la classe parent
		setGender(gender);
		setNom(nom);
		setPrenom(prenom);
	}
	
	
	@Override
	public String toString() {
		return "ClientParticulier [gender=" + gender + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
