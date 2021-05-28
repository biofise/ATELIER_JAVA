package fr.epsi.service;

import java.util.Collection;

import fr.epsi.entites.Client;
import fr.epsi.entites.Commande;
import fr.epsi.entites.Produit;

public interface IApplicationService {
	
	
	//Clients
	
	public Collection<Client> listerClients();  //lister les clients
	public void ajouterClient(Client client);  //ajouter un client
	public Client updateClient(Client client);  //modifier un client....
	public void deleteClient(Client client);    //supprimer un client
	
	//Produits
	
	public Collection<Produit> listerProduits();   //lister les produits..
	public void ajouterProduit(Produit produit);  //ajouter un produit
	public Client updateProduit(Produit produit);  //modifier un produit
	public void deleteProduit(Produit produit);    //supprimer un produit
	
	//
	//
	
	
	//Commandes
	
	public Collection<Commande> listerCommandes();  //lister les commandes
	public void ajouterCommande(Commande commande);  //ajouter une commande
	public Commande updateCommande(Commande commande);  //modifier une commande
	public void deleteCommande(Commande commande);    //supprimer une commande
	

}
