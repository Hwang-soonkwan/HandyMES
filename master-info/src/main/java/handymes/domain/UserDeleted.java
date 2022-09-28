package handymes.domain;

import handymes.domain.*;
import handymes.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class UserDeleted extends AbstractEvent {

    private Long id;

    public UserDeleted() {
        super();
    }
    // keep

}
