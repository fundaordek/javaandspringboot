package funda.northwind.business.abstracts;

import java.util.List;

import funda.northwind.core.utilities.results.DataResult;
import funda.northwind.core.utilities.results.Result;
import funda.northwind.entities.concrete.Product;
import funda.northwind.entities.dtos.ProductwithCategoryDto;

public interface ProductService {

	DataResult<List<Product>> getAll();

	DataResult<List<Product>> getAllSorted();

	Result add(Product product);

	DataResult<Product> getByProductName(String productName);

	DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);

	DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId);

	DataResult<List<Product>> getByCategoryIn(List<Integer> categories);

	DataResult<List<Product>> getByProductNameContains(String productName);

	DataResult<List<Product>> getByProductNameStartsWith(String productName);

	DataResult<List<Product>> getAll(int pageNo, int pageSize);

	DataResult<List<ProductwithCategoryDto>> getProductWithCategoryDetails();
}
