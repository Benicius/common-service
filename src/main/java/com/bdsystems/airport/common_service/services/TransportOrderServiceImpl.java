package com.bdsystems.airport.common_service.services;

import com.bdsystems.airport.common_service.domains.TransportOrder;
import com.bdsystems.airport.common_service.domains.TransportOrderVO;
import org.springframework.stereotype.Service;

@Service
public class TransportOrderServiceImpl implements TransportOrderService {

	private final TransportOrderRepository transportOrderRepository;

	public TransportOrderServiceImpl(TransportOrderRepository transportOrderRepository) {
		this.transportOrderRepository = transportOrderRepository;
	}

	@Override
	public TransportOrder create(TransportOrderVO order) {
		TransportOrder transportOrder = order.convertToEntity();
		return transportOrderRepository.save(transportOrder);
	}
}
