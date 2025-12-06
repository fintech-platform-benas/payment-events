package com.paymentchain.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public record TransactionCreatedEvent(
  @JsonProperty("eventId") String eventId,
  @JsonProperty("occurredOn") Instant occurredOn,
  @JsonProperty("transactionId") Long transactionId,
  @JsonProperty("reference") String reference,
  @JsonProperty("accountIban") String accountIban,
  @JsonProperty("amount") BigDecimal amount,
  @JsonProperty("currency") String currency
) implements TransactionEvent {

  @Override
  public String eventType(){
    return "TRANSACTION_CREATED";
  }

  public static TransactionCreatedEvent create(
    Long transactionId,
    String reference,
    String accountIban,
    BigDecimal amount,
    String currency
  ){
    return new TransactionCreatedEvent(
      UUID.randomUUID().toString(),
      Instant.now(),
      transactionId,
      reference,
      accountIban,
      amount,
      currency
    );
  }

}