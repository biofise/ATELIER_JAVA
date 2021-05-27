package fr.epsi.service;

import java.util.Collection;

import fr.epsi.entites.Client;
import fr.epsi.entites.Commande;
import fr.epsi.entites.Produit;

public interface IApplicationService {
	
	
	//Clients
	
	public Collection<Client> listerClients();  //lister les clients
	public void ajouterClient();  //ajouter un client
	public Client updateClient();  //modifier un client....
	public void deleteClient();    //supprimer un client
	
	//Produits
	
	public Collection<Produit> listerProduits();   //lister les produits..
	public void ajouterProduit();  //ajouter un produit
	public Client updateProduit();  //modifier un produit
	public void deleteProduit();    //supprimer un produit
	
	//
	//
	
	
	//Commandes
	
	public Collection<Commande> listerCommandes();  //lister les commandes
	public void ajouterCommande();  //ajouter une commande
	public Client updateCommande();  //modifier une commande
	public void deleteCommande();    //supprimer une commande
	

}
