package spring_boot_web_jpa.product.infrastructure.database;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import spring_boot_web_jpa.product.domain.entity.Product;
import spring_boot_web_jpa.product.domain.port.ProductRepository;
import spring_boot_web_jpa.product.infrastructure.database.entity.ProductEntity;
import spring_boot_web_jpa.product.infrastructure.database.mapper.ProductEntityMapper;
import spring_boot_web_jpa.product.infrastructure.database.repository.QueryProductRepository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
@Slf4j
public class ProductRepositoryImpl implements ProductRepository {


    private final QueryProductRepository repository;

    private final ProductEntityMapper productEntityMapper;


    @Override
    public Product upsert(Product product) {
        ProductEntity productEntity = productEntityMapper.mapToProductEntity(product);
        ProductEntity save = repository.save(productEntity);
        return productEntityMapper.mapToProduct(save);
    }

    @Cacheable(value = "products", key = "#id")
    @Override
    public Optional<Product> findById(Long id) {
        log.info("Finding product with id {}", id);
        return repository.findById(id).map(productEntityMapper::mapToProduct);
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll().stream()
                .map(productEntityMapper::mapToProduct)
                .toList();
    }

    @CacheEvict(value = "products", key = "#id")
    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
