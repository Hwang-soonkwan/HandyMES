package handymes.infra;

import handymes.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ProductDeliveryHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<ProductDelivery>> {

    @Override
    public EntityModel<ProductDelivery> process(
        EntityModel<ProductDelivery> model
    ) {
        return model;
    }
}
