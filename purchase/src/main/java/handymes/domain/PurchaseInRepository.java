package handymes.domain;

import handymes.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "purchaseIns",
    path = "purchaseIns"
)
public interface PurchaseInRepository
    extends PagingAndSortingRepository<PurchaseIn, Long> {}
