package spring_boot_web_jpa.product.application.query.getById;

import lombok.AllArgsConstructor;
import lombok.Data;
import spring_boot_web_jpa.common.mediator.Request;

@Data
@AllArgsConstructor
public class GetProductByIdRequest implements Request<GetProductByIdResponse> {

    private Long id;

}
