package pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import es.cursogetafe.ejerciciojpa.modelo.Cliente;
import util.EMF;

public class Test04ConsultaClientesProductos {

	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		String jpql = "select c from Cliente c";
		
//		los clientes que han comprado algun producto con precio mayor 500		
		jpql ="select c from Cliente c join c.productos p where p.precio > :precio";
	
		TypedQuery<Cliente> q = em.createQuery(jpql, Cliente.class);
		q.setParameter("precio",500.0);
		
		
//		los clientes que han comprado algun disco
		jpql ="select c from Cliente c join c.productos p where p.producto like :prod";
		q = em.createQuery(jpql, Cliente.class);
		q.setParameter("prod", "%disco%");
		
		
		List<Cliente> cli = q.getResultList();
		for(Cliente cliente : cli) {
			System.out.println(cliente);
			System.out.println(cliente.getProductos());
		}
		em.close();
	}
}
