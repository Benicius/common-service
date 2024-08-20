package com.bdsystems.airport.common_service.domains;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransportOrder {

	@Id
	@GeneratedValue
	private Long id;

	private String reference;
	private String flightType;
	private LocalDateTime createAt;
	private LocalDateTime updatedAt;
	@Enumerated(EnumType.STRING)
	private StatusEnum status;
	private String sourceLocation;
	private String nextLocation;
	private String targetLocation;
}
