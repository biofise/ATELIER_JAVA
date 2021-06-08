package fr.epsi.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.epsi.entites.Commande;



@Repository
public interface ICommandeRespository extends CrudRepository<Commande, Long> {
	
	
	/*
	 * @Query(value =
	 * "UPDATE commande SET date = ?, montant = ? , client = ? WHERE id = ?")
	 * //requète à affiner public void modifierCommandet(Long id);
	 */

}
