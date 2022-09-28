package handymes.infra;

import handymes.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class PurchaseInHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<PurchaseIn>> {

    @Override
    public EntityModel<PurchaseIn> process(EntityModel<PurchaseIn> model) {
        return model;
    }
}
