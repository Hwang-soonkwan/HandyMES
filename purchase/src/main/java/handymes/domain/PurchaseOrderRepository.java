package handymes.domain;

import handymes.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "purchaseOrders",
    path = "purchaseOrders"
)
public interface PurchaseOrderRepository
    extends PagingAndSortingRepository<PurchaseOrder, Long> {}
