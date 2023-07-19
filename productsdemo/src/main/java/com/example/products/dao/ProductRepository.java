package com.example.products.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.products.model.Products;
import com.example.products.model.TestProduct;


@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Products,Integer>{
	
	public List<Products> findByName(String name);
	
	
	@Query(value="select p.name,p.qty from Products p",nativeQuery=true)
	public List<TestProduct> getAllTestProducts();
		
	@Query("select p from Products p where p.id <=?1")
	public List<Products> findProductsLessThanGivenId(int id);
}
