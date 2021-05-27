package fr.epsi.entites;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Commande  implements Serializable{
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	private Date date;
	private double montant;
	
	private Collection<Produit> produits;
	
	@OneToMany(mappedBy = "commande")
	private Collection<CommandeProduit> commandeProduit;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Client client;
	
	
	
	
	//getters & setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	
	public Collection<CommandeProduit> getCommandeProduit() {
		return commandeProduit;
	}
	public void setCommandeProduit(Collection<CommandeProduit> commandeProduit) {
		this.commandeProduit = commandeProduit;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	
	//constructeurs
	public Commande() {
		
		super();
		
	}
	public Commande(Long id, Date date, double montant, Collection<CommandeProduit> commandeProduit , Client client) {
		setId(id);
		setDate(date);
		setMontant(montant);
		setCommandeProduit(commandeProduit);;
		setClient(client);
	}
	
	
	
	

}
