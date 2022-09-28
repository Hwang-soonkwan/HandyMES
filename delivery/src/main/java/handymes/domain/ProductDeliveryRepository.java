package handymes.domain;

import handymes.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "productDeliveries",
    path = "productDeliveries"
)
public interface ProductDeliveryRepository
    extends PagingAndSortingRepository<ProductDelivery, Long> {}
