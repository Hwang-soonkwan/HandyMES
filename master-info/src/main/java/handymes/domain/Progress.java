package handymes.domain;

import handymes.MasterInfoApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Progress_table")
@Data
public class Progress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pgidx;

    private String tenantId;

    private Long progNo;

    private Long progOrder;

    private Long progNm;

    private Long prodIdx;

    private String regiNm;

    private Date regiTm;

    private String modiNm;

    private Date modiTm;

    public static ProgressRepository repository() {
        ProgressRepository progressRepository = MasterInfoApplication.applicationContext.getBean(
            ProgressRepository.class
        );
        return progressRepository;
    }
}
