# Payment Events

Biblioteca de eventos de dominio para transacciones de pago.

## Descripción

Contiene los eventos de dominio utilizados en la arquitectura orientada a eventos de la plataforma de pagos.

## Eventos

- `TransactionCreatedEvent` - Se emite cuando se crea una nueva transacción
- `TransactionSettledEvent` - Se emite cuando una transacción se liquida

## Requisitos

- Java 17+
- Maven 3.6+

## Instalación

```xml
<dependency>
    <groupId>com.paymentchain</groupId>
    <artifactId>payment-events</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

## Construcción

```bash
mvn clean install
```
