package org.example;

public class TaxiOrder {
        public void createOrder() {
            System.out.println("Order Created.");
        }

        public void cancelOrder() {
            System.out.println("Order Cancelled.");
        }

        public void changeDestination(String newDestination) {
            System.out.println("Destination changed to: " + newDestination);
        }
}
