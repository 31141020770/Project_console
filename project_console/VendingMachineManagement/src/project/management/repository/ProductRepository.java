package project.management.repository;

import java.util.List;

import project.management.entity.ProductEntity;

public interface ProductRepository {
	List<ProductEntity> findAll() ;
	boolean add(ProductEntity productEntity);
	boolean update(ProductEntity productEntity);
	boolean delete(ProductEntity productEntity);
}
