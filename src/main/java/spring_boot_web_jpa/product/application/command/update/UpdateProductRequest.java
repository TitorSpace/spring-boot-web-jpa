package spring_boot_web_jpa.product.application.command.update;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import spring_boot_web_jpa.common.application.mediator.Request;

@Data
public class UpdateProductRequest implements Request<Void> {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private MultipartFile file;

}
