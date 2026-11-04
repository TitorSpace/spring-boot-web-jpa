package spring_boot_web_jpa.product.domain.port;

import spring_boot_web_jpa.common.domain.PaginationQuery;
import spring_boot_web_jpa.common.domain.PaginationResult;
import spring_boot_web_jpa.product.domain.entity.Product;
import spring_boot_web_jpa.product.domain.entity.ProductFilter;

import java.util.Optional;

public interface ProductRepository {

    Product upsert(Product product);

    Optional<Product> findById(Long id);

    PaginationResult<Product> findAll(PaginationQuery paginationQuery, ProductFilter productFilter);

    void deleteById(Long id);
}
