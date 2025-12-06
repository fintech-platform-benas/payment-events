package com.paymentchain.events;

/**
 * Eventos relacionados con transacciones.
 */

public sealed interface TransactionEvent extends DomainEvent
  permits TransactionCreatedEvent, TransactionSettledEvent {

    Long transactionId();
    String reference();

}