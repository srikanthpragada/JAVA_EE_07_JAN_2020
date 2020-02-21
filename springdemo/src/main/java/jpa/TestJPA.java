package jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestJPA implements CommandLineRunner {
	@Autowired
	AddDept addDept;
	
	@Autowired 
	DeptRepo repo;
	
	public static void main(String[] args) {
		 SpringApplication.run(TestJPA.class, args);
	}
	
	public void list()  {
		for (Department d : repo.findAll())
			System.out.println(d.getName());
	}
	
	public void add(int id, String name) {
		System.out.println(repo.getClass().getName());
		Department d = new Department();
		d.setId(id);
		d.setName(name);
		repo.save(d);
		System.out.println("Department has been added successfully!");
	}
	
	
	public void run(String ... args) {
		// list();
		add(300,"Test");
		 //addDept.add(300, "Sports");
		 
		 // dept.recentDepartments(200);
		// System.out.println("Avg. Length : " + repo.getAvgLength());
	}

}
