package handymes.domain;

import handymes.MasterInfoApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Machine_table")
@Data
public class Machine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long midx;

    private String tenantId;

    private String machineCode;

    private String machineNm;

    private String regiNm;

    private Date regiTm;

    private String modiNm;

    public static MachineRepository repository() {
        MachineRepository machineRepository = MasterInfoApplication.applicationContext.getBean(
            MachineRepository.class
        );
        return machineRepository;
    }
}
