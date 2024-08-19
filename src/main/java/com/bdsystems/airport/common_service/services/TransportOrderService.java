package com.bdsystems.airport.common_service.services;

import com.bdsystems.airport.common_service.domains.TransportOrder;
import com.bdsystems.airport.common_service.domains.TransportOrderVO;

public interface TransportOrderService {
	TransportOrder create(TransportOrderVO order);
}
