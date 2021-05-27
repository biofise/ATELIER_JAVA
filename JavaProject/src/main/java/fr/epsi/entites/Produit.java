package fr.epsi.entites;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Produit implements Serializable {
	
	
	@Id()
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	private String nom;
	private double prix;
	private Commande commande;
	
	@OneToMany(mappedBy = "produit")
	private Collection<CommandeProduit> commandeProduit;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
	public Collection<CommandeProduit> getCommandeProduit() {
		return commandeProduit;
	}
	public void setCommandeProduit(Collection<CommandeProduit> commandeProduit) {
		this.commandeProduit = commandeProduit;
	}
	public Produit() {
	
	}
	public Produit(Long id, String nom, double prix) {
		setId(id);
		setNom(nom);
		setPrix(prix);
	}
	
	
	
	
	
	

}
