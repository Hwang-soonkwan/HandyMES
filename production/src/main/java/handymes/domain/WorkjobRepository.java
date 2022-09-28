package handymes.domain;

import handymes.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "workjobs", path = "workjobs")
public interface WorkjobRepository
    extends PagingAndSortingRepository<Workjob, Long> {}
