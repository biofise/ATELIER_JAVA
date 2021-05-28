package fr.epsi.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.epsi.entites.Client;
import fr.epsi.entites.Commande;
import fr.epsi.entites.Produit;
import fr.epsi.repository.IClientRepository;
import fr.epsi.repository.ICommandeRespository;
import fr.epsi.repository.IProduitRepository;


@Service
@Transactional
public class ApplicationServiceImpl implements IApplicationService {
	
	private IClientRepository clientRepository;
	private ICommandeRespository commandeRepository;
	private IProduitRepository produitRepository;
	
	
	@Autowired
	public ApplicationServiceImpl(IClientRepository clientRepository, ICommandeRespository commandeRepository,
			IProduitRepository produitRepository) {
		super();
		this.clientRepository = clientRepository;
		this.commandeRepository = commandeRepository;
		this.produitRepository = produitRepository;
	}


	@Override
	public Collection<Client> listerClients() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void ajouterClient(Client client) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Client updateClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteClient(Client client) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Collection<Produit> listerProduits() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void ajouterProduit(Produit produit) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Client updateProduit(Produit produit) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteProduit(Produit produit) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Collection<Commande> listerCommandes() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void ajouterCommande(Commande commande) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Commande updateCommande(Commande commande) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteCommande(Commande commande) {
		// TODO Auto-generated method stub
		
	}
	
	
}


	
	



	