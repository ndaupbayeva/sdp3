package org.example;

public class CommandPatternTest {
    public static void main(String[] args) {
        TaxiOrder order = new TaxiOrder();
        Command createOrder = new CreateOrderCommand(order);
        Command cancelOrder = new CancelOrderCommand(order);
        Command changeDestination = new ChangeDestinationCommand(order, "New York");

        Dispatcher dispatcher = new Dispatcher();

        dispatcher.takeOrder(createOrder);
        dispatcher.takeOrder(changeDestination);
        dispatcher.takeOrder(cancelOrder);
    }
}
