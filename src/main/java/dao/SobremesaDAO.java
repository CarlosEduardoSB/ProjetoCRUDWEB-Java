package dao;

import javax.persistence.EntityManager;
import entidade.Sobremesa;
import util.JpaUtil;

public class SobremesaDAO {

	public static void salvar(Sobremesa s) {
		EntityManager em  =  JpaUtil.criarEntityManager(); 
		em.getTransaction().begin(); 
		em.persist(s); 
		em.getTransaction().commit();
		em.close();
	}
	
	public static Sobremesa acharPorId (Integer id) {
		EntityManager em  = JpaUtil.criarEntityManager();
		Sobremesa s = em.find(Sobremesa.class, id);
		em.close();
		return s;
	}
	
	public static void editar(Sobremesa s) {
		EntityManager em  =  JpaUtil.criarEntityManager();
		em.getTransaction().begin(); 
		em.merge(s); 
		em.getTransaction().commit();
		em.close();
	}
	
	public static void excluir(Sobremesa s) {
		EntityManager em  =  JpaUtil.criarEntityManager();
		em.getTransaction().begin(); 
		em.remove(s); 
		em.getTransaction().commit();
		em.close();
	
	}
	

}