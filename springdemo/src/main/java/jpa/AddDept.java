package jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class AddDept {

	@Autowired
	DeptRepo  repo;
	
	

}
