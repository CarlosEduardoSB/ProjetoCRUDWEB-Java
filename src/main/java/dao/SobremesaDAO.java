package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

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
	
	public static List<Sobremesa> listar(){
		EntityManager em  =  JpaUtil.criarEntityManager();
		em.getTransaction().begin();
		Query query = em.createQuery("SELECT sobremesa FROM Sobremesa sobremesa");
		List<Sobremesa> listaSobremesas = query.getResultList();
		em.getTransaction().commit();
		em.close();
		return listaSobremesas;
	
	}
	
	
	public static Long contar() {
		EntityManager em = JpaUtil.criarEntityManager();
		em.getTransaction().begin();
		Long contador = (Long) em.createQuery("SELECT COUNT(*) FROM Sobremesa").getSingleResult();
		em.getTransaction().commit();
		em.close();
		return contador;
	}

}