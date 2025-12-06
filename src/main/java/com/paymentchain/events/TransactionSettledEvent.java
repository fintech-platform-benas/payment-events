package com.paymentchain.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public record TransactionSettledEvent(
  @JsonProperty("eventId") String eventId,
  @JsonProperty("occurredOn") Instant occurredOn,
  @JsonProperty("transactionId") Long transactionId,
  @JsonProperty("reference") String reference,
  @JsonProperty("settledAmount") BigDecimal settledAmount,
  @JsonProperty("settlementDate") Instant settlementDate
) implements TransactionEvent {

  @Override
  public String eventType(){
    return "TRANSACTION_SETTLED";
  }

  public static TransactionSettledEvent create(
    Long transactionId,
    String reference,
    BigDecimal settledAmount
  ){

    return new TransactionSettledEvent( 
      UUID.randomUUID().toString(),
      Instant.now(),
      transactionId,
      reference,
      settledAmount,
      Instant.now()
      );

  }



}