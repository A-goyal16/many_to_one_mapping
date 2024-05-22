package manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DriverClas 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("mapping");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee e=new Employee();
		e.setId(1);
		e.setName("Ayushi");
		e.setRole("developer");
		
		Employee e1=new Employee();
		e1.setId(2);
		e1.setName("harshita");
		e1.setRole("implementation engineer");
		
		Employee e2=new Employee();
		e2.setId(3);
		e2.setName("pinky");
		e2.setRole("frontend developer");
		
		Company c=new Company();
		c.setId(1);
		c.setName("Google");
		c.setCeoname("sundar pichai");
		
		
		e.setCompany(c);
		e1.setCompany(c);
		e2.setCompany(c);
		
		et.begin();
		em.persist(e);
		em.persist(e1);
		em.persist(e2);
		em.persist(c);
		et.commit();
	}
}
