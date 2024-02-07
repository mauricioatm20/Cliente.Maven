package pruebas;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import es.cursogetafe.ejerciciojpa.modelo.Empleado;
import util.EMF;

public class Test02ConsultaEmpleado {

	
	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		String jpql = "select e from Empleado e";
		

		jpql = "select e from Empleado e where e.categoria.categoria = 'JEFE SERVICIO'";
		
//		empleados de la categoria 2
		jpql = "select e from Empleado e where e.categoria.idCategoria = 2";
		
//		los empleados de la categoria 4 cuyo apellido es Bustamante
		
		jpql = "select e from Empleado e where e.categoria.idCategoria =  :cat and  e.persona.apellidos = :ape";

		TypedQuery<Empleado> e = em.createQuery(jpql, Empleado.class);
		
		e.setParameter("cat" ,4);
		e.setParameter("ape", "Bustamante");
		
		List<Empleado> empleados = e.getResultList();
		for(Empleado empleado : empleados) {
			System.out.println(empleado);
		}
		
		em.close();
	}
}
