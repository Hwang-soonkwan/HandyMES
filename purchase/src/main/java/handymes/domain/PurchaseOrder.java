package handymes.domain;

import handymes.PurchaseApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "PurchaseOrder_table")
@Data
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long poidx;

    private String tenantId;

    private String orderYm;

    private Date orderDt;

    private Long cocompNo;

    private Long prodNo;

    private String prodNumber;

    private String prodNm;

    private String prodStandard;

    private Long orderAmt;

    private String regiNm;

    private Date regiTm;

    private String modiNm;

    private Date modiTm;

    public static PurchaseOrderRepository repository() {
        PurchaseOrderRepository purchaseOrderRepository = PurchaseApplication.applicationContext.getBean(
            PurchaseOrderRepository.class
        );
        return purchaseOrderRepository;
    }
}
