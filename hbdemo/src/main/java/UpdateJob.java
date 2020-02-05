import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entities.Job;

public class UpdateJob {
	public static void main(String[] args) throws Exception {
		Configuration c = new Configuration();
		c.configure();
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t  = s.beginTransaction();
		
		Job job = (Job) s.get(Job.class,  "SP_PROG");
		if (job == null)
			System.out.println("Sorry! Job not found!");
		else
		{
			job.setTitle("Spring Boot Programmer");
			job.setMinSal(10000);
		    t.commit();
		}
		
        s.close();
		sf.close();
	}
}
