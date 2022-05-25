package one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
	
			Pan pan = new Pan();
			
			pan.setPannumber(7687834);
			pan.setAddress("Bangalore");
			
			Person person = new Person();
			person.setName("Priya");
			person.setEmail("priiya@gmail.com");
			
			person.setPan(pan);
			pan.setPerson(person);//automatic generate pan_ id
			entityTransaction.begin();
			entityManager.persist(person);
			entityManager.persist(pan);
			entityTransaction.commit();
	
		
	}

}
