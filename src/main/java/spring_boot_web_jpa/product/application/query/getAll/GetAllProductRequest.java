package spring_boot_web_jpa.product.application.query.getAll;

import lombok.AllArgsConstructor;
import lombok.Data;
import spring_boot_web_jpa.common.application.mediator.Request;
import spring_boot_web_jpa.common.domain.PaginationQuery;
import spring_boot_web_jpa.product.domain.entity.ProductFilter;

@Data
@AllArgsConstructor
public class GetAllProductRequest implements Request<GetAllProductResponse> {

    PaginationQuery paginationQuery;
    ProductFilter productFilter;
}
