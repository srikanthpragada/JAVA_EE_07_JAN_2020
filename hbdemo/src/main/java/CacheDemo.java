import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entities.Job;

public class CacheDemo {
	public static void main(String[] args) throws Exception {
		Configuration c = new Configuration();
		c.configure();
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		
		Job job = (Job) s.get(Job.class,  "SP_PROG");
		job.setMinSal(5000);
		
		Job job2 = (Job) s.get(Job.class,  "SP_PROG");
		s.close();
		sf.close();
	}
}
