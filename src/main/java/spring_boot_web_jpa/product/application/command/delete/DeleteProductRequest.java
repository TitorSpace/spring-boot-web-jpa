package spring_boot_web_jpa.product.application.command.delete;

import lombok.AllArgsConstructor;
import lombok.Data;
import spring_boot_web_jpa.common.mediator.Request;

@Data
@AllArgsConstructor
public class DeleteProductRequest implements Request<Void> {

    private Long id;

}
