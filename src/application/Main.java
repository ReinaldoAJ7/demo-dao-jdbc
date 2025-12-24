package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("======= TEST 1: seller findById =======");
		Seller seller = sellerDao.findById(4);
		
		System.out.println(seller);
		
		System.out.println("\n======= TEST 2: seller findById =======");
		Department department = new Department(2, null);
		//List<Seller> list = sellerDao.findByDepartment(department);
		
		//for (Seller obj : list) {
		//	System.out.println(obj);
	//	}
		System.out.println("Verificar código SQL do findByDepartment.");
		System.out.println("\n======= TEST 3: seller findAll =======");
			
		List<Seller> list = sellerDao.findAll();
				
			for (Seller obj : list) {
			System.out.println(obj);
			}
			
			System.out.println("\n======= TEST 4: seller findAll =======");
			Seller newSeller = new Seller(null,"Reinaldo","reinaldojesus238@gmail.com", new Date(), 45000.00, department);
			sellerDao.insert(newSeller);
			System.out.println("Inserted data! New id: " + seller.getId());
			
			System.out.println("\n======= TEST 5: Execute Update =======");
			seller = sellerDao.findById(1);
			seller.setName("Clark Cant");
			sellerDao.update(seller);
			System.out.println("Data updated! " + seller.getName());
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
