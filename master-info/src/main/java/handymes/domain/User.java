package handymes.domain;

import handymes.MasterInfoApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "User_table")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long uidx;

    private String tenantId;

    private String userId;

    private String userPass;

    private String userName;

    private String userHp;

    private String email;

    private String regiNm;

    private Date regiTm;

    private String modiNm;

    private Date modiTm;

    public static UserRepository repository() {
        UserRepository userRepository = MasterInfoApplication.applicationContext.getBean(
            UserRepository.class
        );
        return userRepository;
    }
}
