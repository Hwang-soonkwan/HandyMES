package handymes.infra;

import handymes.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ProgressHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Progress>> {

    @Override
    public EntityModel<Progress> process(EntityModel<Progress> model) {
        return model;
    }
}
