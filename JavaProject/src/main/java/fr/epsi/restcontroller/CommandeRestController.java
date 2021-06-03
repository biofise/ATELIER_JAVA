package fr.epsi.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import fr.epsi.service.ICommandeService;

@Controller
public class CommandeRestController {
	
	
	@Autowired
	ICommandeService commandeService;

}
