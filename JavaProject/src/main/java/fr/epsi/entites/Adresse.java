package fr.epsi.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Adresse implements Serializable{
	
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	private int numero;
	private String libelle;
	private String zipCode;
	private String ville;
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Client client;
	
	
	
	//getters & setters
	
	public Long getId() {
		return id;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	
	//constructeurs
	public Adresse() {
		
		super();
		
	}
	public Adresse(int numero, String libelle, String zipCode, String ville) {
		setNumero(numero);
		setLibelle(libelle);
		setZipCode(zipCode);
		setVille(ville);
		//setClient(client);
	}
	
	
	
	

}
