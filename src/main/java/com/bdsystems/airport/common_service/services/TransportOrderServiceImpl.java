package com.bdsystems.airport.common_service.services;

import com.bdsystems.airport.common_service.domains.TransportOrder;
import org.springframework.stereotype.Service;

@Service
public class TransportOrderServiceImpl implements TransportOrderService {

	private final TransportOrderRepository transportOrderRepository;

	public TransportOrderServiceImpl(TransportOrderRepository transportOrderRepository) {
		this.transportOrderRepository = transportOrderRepository;
	}

	@Override
	public TransportOrder create(TransportOrder order) {
		return transportOrderRepository.save(order);
	}
}
