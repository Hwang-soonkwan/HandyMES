package handymes.domain;

import handymes.PurchaseApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "PurchaseIn_table")
@Data
public class PurchaseIn {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long piidx;

    private String tenantId;

    private Long cocompNo;

    private Long prodNo;

    private String prodNumber;

    private String prodNm;

    private String prodStandard;

    private Long inAmt;

    private String regiNm;

    private Date regiTm;

    private String modiNm;

    public static PurchaseInRepository repository() {
        PurchaseInRepository purchaseInRepository = PurchaseApplication.applicationContext.getBean(
            PurchaseInRepository.class
        );
        return purchaseInRepository;
    }
}
