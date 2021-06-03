package fr.epsi.service;

import java.util.Collection;

import fr.epsi.entites.Client;

public interface IClientService {
	
	
	//Clients
	
		public Collection<Client> listerClients();  //lister les clients
		public Client ajouterClient(Client client);  //ajouter un client
		public Client updateClient(Client client);  //modifier un client....
		public void deleteClient(Client client);    //supprimer un client

}
