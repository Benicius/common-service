package com.bdsystems.airport.common_service.services;

import com.bdsystems.airport.common_service.domains.TransportOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportOrderRepository extends JpaRepository<TransportOrder, Long> {
}
