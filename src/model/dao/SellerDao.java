package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	// Insert Seller
		void insert(Seller dep);
		// Update Seller
		void update(Seller dep);	
		// Delete Seller by id
		void deleteById(Integer id);	
		// Find Seller by id 
		Seller findById(Integer id);
		
		List<Seller> findAll();
		
		List<Seller> findByDepartment(Department department);
		
}
