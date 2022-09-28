package handymes.domain;

import handymes.DeliveryApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ProductOrder_table")
@Data
public class ProductOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long poidx;

    private String tenantId;

    private String orderYm;

    private Date orderDt;

    private Date requestDt;

    private Long prodNo;

    private String prodNumber;

    private String prodNm;

    private String prodStandard;

    private Long orderAmt;

    private String regiNm;

    private Date regiTm;

    private String modiNm;

    private Date modiTm;

    public static ProductOrderRepository repository() {
        ProductOrderRepository productOrderRepository = DeliveryApplication.applicationContext.getBean(
            ProductOrderRepository.class
        );
        return productOrderRepository;
    }
}
