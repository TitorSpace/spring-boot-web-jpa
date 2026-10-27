package spring_boot_web_jpa.common.domain;

//THis class is in charge of give us the pagination query

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaginationQuery {

    private int page;
    private int Size;
}
