package spring_boot_web_jpa.product.application.query.getAll;

import lombok.AllArgsConstructor;
import lombok.Data;
import spring_boot_web_jpa.common.domain.PaginationResult;
import spring_boot_web_jpa.product.domain.entity.Product;

@Data
@AllArgsConstructor
public class GetAllProductResponse {

    private PaginationResult<Product> productsPage;

}
