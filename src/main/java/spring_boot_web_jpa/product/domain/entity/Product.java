package spring_boot_web_jpa.product.domain.entity;

import lombok.Builder;
import lombok.Data;
import spring_boot_web_jpa.category.domain.Category;
import spring_boot_web_jpa.productDetail.domain.ProductDetail;
import spring_boot_web_jpa.review.domain.Review;

import java.util.List;

@Data
@Builder
public class Product {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String image;

    private ProductDetail productDetail;
    private List<Review> reviews;
    private List<Category> categories;

}
