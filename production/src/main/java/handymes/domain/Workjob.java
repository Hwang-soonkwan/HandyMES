package handymes.domain;

import handymes.ProductionApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Workjob_table")
@Data
public class Workjob {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long widx;

    private String tenantId;

    private Date workDt;

    private String userId;

    private String userNm;

    private String machineCode;

    private String machineNm;

    private Long prodNo;

    private String prodNumber;

    private String prodNm;

    private String prodStandard;

    private Long workAmt;

    private String regiNm;

    private Date regiTm;

    private String modiNm;

    private Date modiTm;

    public static WorkjobRepository repository() {
        WorkjobRepository workjobRepository = ProductionApplication.applicationContext.getBean(
            WorkjobRepository.class
        );
        return workjobRepository;
    }
}
