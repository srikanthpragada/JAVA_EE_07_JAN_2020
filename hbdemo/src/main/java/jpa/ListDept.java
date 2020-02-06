package jpa;
 
import java.util.List; 
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
 
public class ListDept {
  public static void main(String args[]) throws Exception {
	  
	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracle");
	  EntityManager em = emf.createEntityManager();
	  Query q = em.createQuery("select d from Department d");
	  List<Department> depts = (List<Department>) q.getResultList(); 
	  
	  for (Department d : depts) 
		  System.out.println(d.getName());
	  
	  em.close();
	  emf.close();
	  
  }
}
