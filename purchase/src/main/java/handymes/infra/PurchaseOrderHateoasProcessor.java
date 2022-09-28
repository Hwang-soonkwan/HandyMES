package handymes.infra;

import handymes.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class PurchaseOrderHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<PurchaseOrder>> {

    @Override
    public EntityModel<PurchaseOrder> process(
        EntityModel<PurchaseOrder> model
    ) {
        return model;
    }
}
