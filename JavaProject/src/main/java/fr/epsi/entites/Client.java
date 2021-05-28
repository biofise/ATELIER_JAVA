package fr.epsi.entites;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_CLIENT" , discriminatorType = DiscriminatorType.STRING , length = 3)
public abstract class Client implements Serializable {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Adresse adresse;
	
	private String telephone;
	
	@OneToMany(mappedBy = "client" , fetch = FetchType.LAZY)
	private Collection<Commande> commande;
	
	
	//getters & setters
	public Long getId() {
		return id;
	}
	
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	public Collection<Commande> getCommande() {
		return commande;
	}
	public void setCommande(Collection<Commande> commande) {
		this.commande = commande;
	}
	
	//Constructeurs
	public Client() {
		super();
	}
	public Client(Adresse adresse, String telephone) {
		setAdresse(adresse);
		setTelephone(telephone);
		//setCommande(commandes);
	}
	
	
	public abstract String toString();
	
	
	
	
	

}
