package fr.epsi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.epsi.entites.Adresse;
import fr.epsi.entites.ClientParticulier;
import fr.epsi.repository.IAdresseRepository;
import fr.epsi.repository.IClientRepository;
import fr.epsi.repository.ICommandeRespository;
import fr.epsi.repository.IProduitRepository;


@SpringBootApplication
public class Application  implements CommandLineRunner{
	
	@Autowired
	private IAdresseRepository adresseRepository;
	
	@Autowired
	private IClientRepository clientRepository;
	
	@Autowired
	private ICommandeRespository commandeRepository;
	
	@Autowired
	private IProduitRepository produitRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//RelationalDataAccessApplication.class
	}

	
	  @Override public void run(String... args) throws Exception {
		  
		  Adresse ad1 = adresseRepository.save(new Adresse(136,  "Gobelet", "44000", "Nantes"));
		  Adresse ad2 = adresseRepository.save(new Adresse(12,  "Sarkozy", "75000", "Paris"));
		  
		  //Client c1 = clientRepository.save(new ClientParticulier(ad1, , gender, nom, prenom)
	  
	  }
	 

}
