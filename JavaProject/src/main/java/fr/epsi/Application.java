package fr.epsi;

import fr.epsi.entites.*;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.epsi.repository.IAdresseRepository;
import fr.epsi.repository.IClientRepository;
import fr.epsi.repository.ICommandeProduitRepository;
import fr.epsi.repository.ICommandeRespository;
import fr.epsi.repository.IProduitRepository;


@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private IAdresseRepository adresseRepository;

    @Autowired
    private IClientRepository clientRepository;

    @Autowired
    private ICommandeRespository commandeRepository;

    @Autowired
    private IProduitRepository produitRepository;
    
    @Autowired
    private ICommandeProduitRepository commandeProduitRepository;


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        //RelationalDataAccessApplication.class
    }


    @Override
    public void run(String... args) throws Exception {


    	//Adresse
        Adresse ad1 = new Adresse(136, "Gobelet", "44000", "Nantes");
        Adresse ad2 = new Adresse(12, "Sarkozy", "75000", "Paris");
        
        //Clients
        Client c1 = new ClientParticulier(ad1,"23", Gender.HOMME,"SYLLA","Sega");
        clientRepository.save(c1);
        Client c2 = new ClientProfessionnel(ad2, "123", "EPSI", "123CV46");
        
        //Produits
        Produit p1 = produitRepository.save( new Produit("ordianateur", 630.0) );
        Produit p2 = produitRepository.save( new Produit("telephone", 330.0) );
        
		
		/*
		 * //Commandes Commande com1 = commandeRepository.save( new Commande(new
		 * Date(),630.0, c1)) ; Commande com2 = commandeRepository.save( new
		 * Commande(new Date(), 330.0, c2)) ;
		 */
		  
		 /* // CommandeProduit CommandeProduit comProd1 =
		  commandeProduitRepository.save(new CommandeProduit(1,630.0,com1, p1));
		  CommandeProduit comProd2 = commandeProduitRepository.save(new
		  CommandeProduit(1,330.0,com2, p2));
		 */
        
        

    }


}
