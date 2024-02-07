package pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import es.cursogetafe.ejerciciojpa.modelo.Cliente;
import util.EMF;

public class Tes05ConsultaFech {

	public static void main(String[] args) {
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
		String jpql = "select c from Cliente c left join fetch c.productos";
		
		TypedQuery<Cliente> q = em.createQuery(jpql, Cliente.class);
		List<Cliente> cliente = q.getResultList();
		
		System.out.println();
		
		em.close();
		
		System.out.println("***********************************************************************");
		
		for(Cliente cli : cliente) {
			System.out.println(cli);
			System.out.println(cli.getProductos());
		}
	}
}
