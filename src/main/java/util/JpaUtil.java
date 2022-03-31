package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("crudSobremesaPU");
	
	public static EntityManager criarEntityManager() {
		return emf.createEntityManager();
	}
	
	
	
	

}
