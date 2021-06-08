package fr.epsi.entites;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_CLIENT" , discriminatorType = DiscriminatorType.STRING , length = 3)

@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,include=JsonTypeInfo.As.PROPERTY,
property = "type")
@JsonSubTypes({
	@Type(name = "PAR" , value = ClientParticulier.class),
	@Type(name = "PRO" , value = ClientProfessionnel.class) })
public abstract class Client implements Serializable {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Adresse adresse;
	
	private String telephone;
	
	@OneToMany(mappedBy = "client")
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
