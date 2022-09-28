package handymes.domain;

import handymes.domain.*;
import handymes.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CompanyDeleted extends AbstractEvent {

    private Long id;

    public CompanyDeleted() {
        super();
    }
    // keep

}
