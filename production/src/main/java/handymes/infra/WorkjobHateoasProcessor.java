package handymes.infra;

import handymes.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class WorkjobHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Workjob>> {

    @Override
    public EntityModel<Workjob> process(EntityModel<Workjob> model) {
        return model;
    }
}
