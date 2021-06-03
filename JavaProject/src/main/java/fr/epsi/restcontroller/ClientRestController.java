package fr.epsi.restcontroller;




import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import fr.epsi.entites.Client;
import fr.epsi.service.IClientService;

@Controller
//@RestController
//@RequestMapping("client")
public class ClientRestController {
	
	
	@Autowired
	IClientService clientService;
	
	//GetMapping
	public Collection<Client> listerClients() {
		return clientService.listerClients();
	}

	//PostMapping
	public Client ajouterClient(Client client) {
		return clientService.ajouterClient(client);
	}

	//PUT
	public Client updateClient(Client client) {
		return clientService.updateClient(client);
	}

	//DELETE
	public void deleteClient(Client client) {
		clientService.deleteClient(client);
	}

	

}
