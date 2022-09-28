package handymes.domain;

import handymes.MasterInfoApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Company_table")
@Data
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cidx;

    private Long tenantId;

    private Long compNo;

    private String compNm;

    private String compLicenceCode;

    private String compType;

    private String ceoNm;

    private String telNumber;

    private String faxNumber;

    private String compEmail;

    private String regiNm;

    private Date regiTm;

    private String modiNm;

    public static CompanyRepository repository() {
        CompanyRepository companyRepository = MasterInfoApplication.applicationContext.getBean(
            CompanyRepository.class
        );
        return companyRepository;
    }
}
