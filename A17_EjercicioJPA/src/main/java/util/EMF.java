package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMF {

		private static EntityManagerFactory emf;//metodo singleton
		
		private EMF() {}
		
		public static EntityManagerFactory getInstance() {
			
			if(emf == null) {
				emf = Persistence.createEntityManagerFactory("JPA");
			}
			
			return emf;
		
	}
}
