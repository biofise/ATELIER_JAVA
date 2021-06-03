package fr.epsi.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.epsi.entites.Client;
import fr.epsi.repository.IClientRepository;


@Service
public class ClientServiceImpl implements IClientService {
	
	
	@Autowired
	IClientRepository clientRepository;

	@Override
	public Collection<Client> listerClients() {
	
		return (Collection<Client>) clientRepository.findAll();
	}

	@Override
	public Client ajouterClient(Client client) {
		return clientRepository.save(client);
		

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

}
