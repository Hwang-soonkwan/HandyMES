package handymes.domain;

import handymes.ProductionApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Command_table")
@Data
public class Command {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cidx;

    private String tenantId;

    private Date cmdDt;

    private Long prodNo;

    private String prodNumber;

    private String prodNm;

    private String prodStandard;

    private Long cmdCnt;

    private String regiNm;

    private Date regiTm;

    private String modiNm;

    public static CommandRepository repository() {
        CommandRepository commandRepository = ProductionApplication.applicationContext.getBean(
            CommandRepository.class
        );
        return commandRepository;
    }
}
