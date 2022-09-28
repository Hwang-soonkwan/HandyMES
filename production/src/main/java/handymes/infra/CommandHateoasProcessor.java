package handymes.infra;

import handymes.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CommandHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Command>> {

    @Override
    public EntityModel<Command> process(EntityModel<Command> model) {
        return model;
    }
}
