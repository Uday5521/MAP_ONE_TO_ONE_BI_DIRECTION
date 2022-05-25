package one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetCompanyGst {

public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Gst gst = entityManager.find(Gst.class, 1);
		System.out.println("GST NUMBER "+gst.getGstnumber());
		System.out.println("STATE "+gst.getState());

		Company company = new Company();
		System.out.println("COMPANY NAME " +company.getName());
		System.out.println("COMPNAY WEB "+company.getWeb());
	}

}
