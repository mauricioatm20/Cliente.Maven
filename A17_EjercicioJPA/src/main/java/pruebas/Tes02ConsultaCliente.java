package pruebas;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import es.cursogetafe.ejerciciojpa.modelo.Cliente;
import util.EMF;

public class Tes02ConsultaCliente {

	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
//		todos los objetos cliente registrado
		
		
//		String jpql ="select c from Cliente c";
//		
//		TypedQuery<Cliente> q = em.createQuery(jpql, Cliente.class);
//		
//		List<Cliente> clientes = q.getResultList();
//		
//		for(Cliente cliente : clientes ) {
//			System.out.println(cliente);
//		}
		
//		todos los clientes cuya categoria sea "esporadico"
		
		String jpql2 = "select c from Cliente c where c.categoria = 'ESPORADICO'";
		
		TypedQuery<Cliente> q2 = em.createQuery(jpql2, Cliente.class);
		
		List<Cliente> clientes = q2.getResultList();
		
		for(Cliente cliente : clientes ) {
			System.out.println(cliente);
		}
	
		em.close();
	}
}
