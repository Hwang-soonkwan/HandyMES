package handymes.domain;

import handymes.MasterInfoApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Product_table")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pidx;

    private String tenantId;

    private Long prodNo;

    private String prodNumber;

    private String prodNm;

    private String prodStandard;

    private String regiNm;

    private Date regiTm;

    private String modiNm;

    public static ProductRepository repository() {
        ProductRepository productRepository = MasterInfoApplication.applicationContext.getBean(
            ProductRepository.class
        );
        return productRepository;
    }
}
