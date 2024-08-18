package com.bdsystems.airport.common_service.domains;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class TransportOrder {

	@Id
	@GeneratedValue
	private Long id;

	private String reference;
	private String flightType;
	private LocalDateTime createAt;
	private LocalDateTime updatedAt;
	private StatusEnum status;
}
