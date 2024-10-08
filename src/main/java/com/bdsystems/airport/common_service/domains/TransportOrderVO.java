package com.bdsystems.airport.common_service.domains;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record TransportOrderVO(
				Long id,
				String reference,
				String flightType,
				LocalDateTime createAt,
				LocalDateTime updatedAt,
				String status,
				String sourceLocation,
				String nextLocation,
				String targetLocation
) {

	public TransportOrder convertToEntity(){
		return TransportOrder.builder()
						.id(this.id)
						.reference(this.reference)
						.flightType(this.flightType)
						.status(StatusEnum.valueOf(this.status))
						.createAt(this.createAt)
						.updatedAt(this.updatedAt)
						.sourceLocation(this.sourceLocation)
						.nextLocation(this.nextLocation)
						.targetLocation(this.targetLocation)
						.build();
	}
}
