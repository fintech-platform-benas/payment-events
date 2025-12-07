package com.paymentchain.events;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class EventTest{

  @Test
  void crearYProcesarEvento(){
    var event = TransactionCreatedEvent.create(
      1L,
      "TRX001",
      "ES012863254789",
      new BigDecimal("200.00"),
      "EUR"
    );

    String result = processEvent(event);
    System.out.println(result);
  }

  String processEvent(TransactionEvent event){
    if (event instanceof TransactionCreatedEvent e) {
      return "Created: " + e.reference() + " for " + e.amount();
    } else if (event instanceof TransactionSettledEvent e) {
      return "Settled: " + e.reference();
    }
    return "Unknown event";
  }


}