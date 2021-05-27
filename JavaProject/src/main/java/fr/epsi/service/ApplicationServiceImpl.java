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
	
	
	/*
	 * Implémentation des
	 * Méthodes métier pour les clients
	 */

	@Override
	public Collection<Client> listerClients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterClient() {
		// TODO Auto-generated method stub

	}

	@Override
	public Client updateClient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteClient() {
		// TODO Auto-generated method stub

	}
	
	
	
	/*
	 * Implémentation des
	 * Méthodes métier pour les produits
	 */

	@Override
	public Collection<Produit> listerProduits() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterProduit() {
		// TODO Auto-generated method stub

	}

	@Override
	public Client updateProduit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduit() {
		// TODO Auto-generated method stub

	}
	
	
	/*
	 * Implémentation des
	 * Méthodes métier pour les commandes
	 */

	@Override
	public Collection<Commande> listerCommandes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterCommande() {
		// TODO Auto-generated method stub

	}

	@Override
	public Client updateCommande() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCommande() {
		// TODO Auto-generated method stub

	}

}
