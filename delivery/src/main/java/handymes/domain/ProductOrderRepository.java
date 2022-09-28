package handymes.domain;

import handymes.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "productOrders",
    path = "productOrders"
)
public interface ProductOrderRepository
    extends PagingAndSortingRepository<ProductOrder, Long> {}
