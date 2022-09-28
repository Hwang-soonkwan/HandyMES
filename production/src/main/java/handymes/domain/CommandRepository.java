package handymes.domain;

import handymes.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "commands", path = "commands")
public interface CommandRepository
    extends PagingAndSortingRepository<Command, Long> {}
