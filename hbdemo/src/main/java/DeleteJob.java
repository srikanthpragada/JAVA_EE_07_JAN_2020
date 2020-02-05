import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entities.Job;

public class DeleteJob {
	public static void main(String[] args) throws Exception {
		Configuration c = new Configuration();
		c.configure();
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		
		// System.out.println("Flush Mode : " + s.getFlushMode());
		
		Transaction t = s.beginTransaction();
		
		Job job = (Job) s.get(Job.class,  "HB_PROG");
		if (job == null)
			System.out.println("Sorry! Job not found!");
		else
			s.delete(job);
		
		t.commit();
		s.close();
		sf.close();
	}
}
