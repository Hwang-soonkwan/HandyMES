package handymes.domain;

import handymes.domain.*;
import handymes.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PurchaseModified extends AbstractEvent {

    private Long id;

    public PurchaseModified() {
        super();
    }
    // keep

}
