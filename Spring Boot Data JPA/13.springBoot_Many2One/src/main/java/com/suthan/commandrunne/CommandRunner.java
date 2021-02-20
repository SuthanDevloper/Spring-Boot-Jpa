package com.suthan.commandrunne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.suthan.model.Product;
import com.suthan.model.Vendor;
import com.suthan.repo.ProdectRepo;
import com.suthan.repo.VendorRepo;

@Component
public class CommandRunner implements CommandLineRunner {
	
	@Autowired
	private ProdectRepo prepo;
	
	@Autowired
	private VendorRepo venrepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Vendor ven = new Vendor(102,"Atlas");
		Vendor ven1 = new Vendor(103,"Duminthu");
		
		venrepo.save(ven);
		venrepo.save(ven1);
		
		Product p1 = new Product(1,"book",5,ven);
		Product p2 = new Product(2,"pen",40,ven1);
		Product p3 = new Product(3,"pencil",5,ven);
		
		prepo.save(p1);
		prepo.save(p2);
		prepo.save(p3);
		

}
	
}
