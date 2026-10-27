package spring_boot_web_jpa.product.application.command.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import spring_boot_web_jpa.product.domain.entity.Product;

@Data
@AllArgsConstructor
public class CreateProductResponse {

    private Product product;
}
