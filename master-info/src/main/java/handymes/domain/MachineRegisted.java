package handymes.domain;

import handymes.domain.*;
import handymes.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class MachineRegisted extends AbstractEvent {

    private Long id;

    public MachineRegisted() {
        super();
    }
    // keep

}
