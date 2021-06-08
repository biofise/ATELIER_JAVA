package fr.epsi.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.epsi.entites.Client;


@Repository
public interface IClientRepository extends CrudRepository<Client, Long> {
	
	
	 

}
