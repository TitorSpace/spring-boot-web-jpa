package spring_boot_web_jpa.product.application.query.getById;

import lombok.AllArgsConstructor;
import lombok.Data;
import spring_boot_web_jpa.product.domain.entity.Product;

@Data
@AllArgsConstructor
public class GetProductByIdResponse {

    private Product product;

}
