package handymes.domain;

import handymes.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "progresses",
    path = "progresses"
)
public interface ProgressRepository
    extends PagingAndSortingRepository<Progress, Long> {}
