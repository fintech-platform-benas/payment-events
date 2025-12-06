package com.paymentchain.events;

import java.time.Instant;

public sealed interface DomainEvent permits TransactionEvent {

  String eventId();     // ID único del evento
  Instant occurredOn();  // Cuando ocurrió
  String eventType();   // Tipo de evento

}