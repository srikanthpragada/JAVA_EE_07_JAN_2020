package com.st.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component 
public class Catalog implements CommandLineRunner {
	@Autowired
	// @Qualifier("springBooks")
	private Books catalog;
	
//	@Autowired
//	private MessagePrinter printer;
	

	public Catalog() {
		// System.out.println("Catalog()");
	}
	
//	public Books getCatalog() {
//		return catalog;
//	}
//
//	public void setCatalog(Books catalog) {
//		this.catalog = catalog;
//	}

	public void print() {
	}

	@Override
	public void run(String... args) throws Exception {
		for(String b : catalog.getBooks())
			System.out.println(b);
	}
	
//	public void printUpper() {
//		for(String b : catalog.getBooks())
//			System.out.println(b.toUpperCase());
//	}
}
