package org.example;

public class Main {
    public static void main(String[] args) {
                Handler carHandler = new CarAvailabilityHandler();
                Handler balanceHandler = new BalanceHandler();
                Handler locationHandler = new LocationHandler();

                carHandler.setNext(balanceHandler);
                balanceHandler.setNext(locationHandler);

                Request request = new Request(true, true, false);
                carHandler.handle(request);
    }
}