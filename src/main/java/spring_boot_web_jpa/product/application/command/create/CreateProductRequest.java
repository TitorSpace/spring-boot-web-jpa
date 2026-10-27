package spring_boot_web_jpa.product.application.command.create;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import spring_boot_web_jpa.common.mediator.Request;

@Data
public class CreateProductRequest implements Request<CreateProductResponse> {

    private String name;
    private String description;
    private Double price;
    private MultipartFile file;

}
