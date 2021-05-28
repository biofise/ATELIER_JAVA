package fr.epsi.entites;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("PRO")
public class ClientProfessionnel extends Client{
	
	private String raisonSociale;
	private String siret;
	
	
	
	//getters & setters
	public String getRaisonSociale() {
		return raisonSociale;
	}
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}
	public String getSiret() {
		return siret;
	}
	public void setSiret(String siret) {
		this.siret = siret;
	}
	
	
	//constructeurs
	public ClientProfessionnel() {
		super();
	}
	
	
	public ClientProfessionnel(Adresse adresse, String telephone,Collection<Commande> commandes,
			String raisonSociale, String siret) {
		super(adresse, telephone,commandes);//constructeur avec parametres de la classe parent
		setRaisonSociale(raisonSociale);
		setSiret(siret);
	}
	
	@Override
	public String toString() {
		return "ClientProfessionnel [raison sociale=" + raisonSociale + ", siret=" + siret + "]";
	}
	
	
	
	

}
