package handymes.domain;

import handymes.DeliveryApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ProductDelivery_table")
@Data
public class ProductDelivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long didx;

    private String tenantId;

    private Long customerNo;

    private Long prodNo;

    private String prodNumber;

    private String prodNm;

    private String prodStandard;

    private Long deliverAmt;

    private String regiNm;

    private Date regiTm;

    private String modiNm;

    private Date modiTm;

    public static ProductDeliveryRepository repository() {
        ProductDeliveryRepository productDeliveryRepository = DeliveryApplication.applicationContext.getBean(
            ProductDeliveryRepository.class
        );
        return productDeliveryRepository;
    }
}
