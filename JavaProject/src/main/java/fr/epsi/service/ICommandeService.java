package fr.epsi.service;

import java.util.Collection;

import fr.epsi.entites.Commande;

public interface ICommandeService {
	
	
	public Collection<Commande> listerCommandes();  //lister les commandes
	public Commande ajouterCommande(Commande commande);  //ajouter une commande
	public Commande updateCommande(Commande commande);  //modifier une commande
	public void deleteCommande(Commande commande);    //supprimer une commande
	

}
