package com.bdsystems.airport.common_service.controllers;

import com.bdsystems.airport.common_service.domains.TransportOrder;
import com.bdsystems.airport.common_service.domains.TransportOrderVO;
import com.bdsystems.airport.common_service.services.TransportOrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/transport-order")
public class TransportOrderController {

	private final TransportOrderService transportOrderService;

	public TransportOrderController(TransportOrderService transportOrderService) {
		this.transportOrderService = transportOrderService;
	}

	@PostMapping
	public TransportOrder createTransportOrder(@RequestBody TransportOrderVO order){
		return transportOrderService.create(order);
	}
}
