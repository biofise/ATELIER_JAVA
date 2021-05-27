package fr.epsi.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CommandeProduit  implements Serializable {
	
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	private String nom;
	private int quantite;
	private double montant;
	
	
	@ManyToOne
	@JoinColumn(name = "commande_id")
	private Commande commande;
	
	@ManyToOne
	@JoinColumn(name = "produit_id")
	private Produit produit;
	

	
	

}
