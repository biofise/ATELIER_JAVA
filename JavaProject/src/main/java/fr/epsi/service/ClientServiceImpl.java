package fr.epsi.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.epsi.entites.Adresse;
import fr.epsi.entites.Client;
import fr.epsi.repository.IClientRepository;


@Service
@Transactional
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
		
		clientRepository.save(client);
		 
		return client;
	}

	
	@Override
	public void deleteClient(Long id) {
		if( clientRepository.existsById(id)) {
			
			clientRepository.deleteById(id);;
		}
		else {
			throw new RuntimeException(" Client inexistant");
		}
		
		
	}

}
