package funda.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import funda.northwind.entities.concrete.Product;
import funda.northwind.entities.dtos.ProductwithCategoryDto;

public interface ProductDao extends JpaRepository<Product, Integer> {
	Product getByProductName(String productName);

	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);

	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);

	List<Product> getByCategoryIn(List<Integer> categories);

	List<Product> getByProductNameContains(String productName);

	List<Product> getByProductNameStartsWith(String productName);

	@Query("From Product where productName=:productName and category.categoryId=:categoryId")
	List<Product> getByNameAndCategory(String productName, int categoryId);

	@Query("Select funda.northwind.entities.dtos.ProdutwithCategoryDto"
			+ "(p.id, p.productName, c.categoryName) "
			+ " From Category c Inner Join c.products p")
	List<ProductwithCategoryDto> getProductWithCategoryDetails();

}
