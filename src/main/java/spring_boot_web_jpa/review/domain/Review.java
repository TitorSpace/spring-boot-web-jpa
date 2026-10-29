package spring_boot_web_jpa.review.domain;

import lombok.Builder;
import lombok.Data;
import spring_boot_web_jpa.product.domain.entity.Product;

@Data
@Builder
public class Review {

    private Long id;
    private String comment;
    private String score;

    private Product product;
}
