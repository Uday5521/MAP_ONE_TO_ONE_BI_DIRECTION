package one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveGst {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
	
		Company company = new Company();
		company.setName("TOM");
		company.setPhone(43676756);
		company.setWeb("awjfoweajroeawfojaeer");
		
		Gst gst = new Gst();
		gst.setGstnumber(34354354);
		gst.setState("KArntaka");
        gst.setCountry("india");		
		company.setGst(gst);
		gst.setCompany(company);
		
		entityTransaction.begin();
		entityManager.persist(gst);
		entityManager.persist(company);
		entityTransaction.commit();

		
	}
}
