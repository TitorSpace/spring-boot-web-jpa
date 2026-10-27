package spring_boot_web_jpa.product.infrastructure.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import spring_boot_web_jpa.common.domain.PaginationResult;
import spring_boot_web_jpa.product.infrastructure.api.dto.CreateProductDto;
import spring_boot_web_jpa.product.infrastructure.api.dto.ProductDto;
import spring_boot_web_jpa.product.infrastructure.api.dto.UpdateProductDto;

public interface ProductApi {

    ResponseEntity<PaginationResult<ProductDto>> getAllProduct(int pageNumber, int pageSize);

    ResponseEntity<ProductDto> getProductById(@PathVariable Long id);

    ResponseEntity<Void> saveProduct(@RequestBody CreateProductDto productDto);

    ResponseEntity<Void> updateProduct(@RequestBody UpdateProductDto productDto);

    ResponseEntity<Void> deleteProduct(@PathVariable Long id);
}
