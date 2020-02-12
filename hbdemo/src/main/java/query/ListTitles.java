package query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class ListTitles {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("query/hibernate.cfg.xml");
		Session session = c.buildSessionFactory().openSession();

		// List<Title> titles =  session.createQuery("from Title t join fetch t.subject").list();
		List<Title> titles =  session.createQuery("from Title").list();
		for (Title t : titles) {
			System.out.printf("%-30s  %-20s  %d\n", t.getTitle(),
			    t.getSubject().getSubname(), t.getPrice());
		}
		session.close();
	}
}
