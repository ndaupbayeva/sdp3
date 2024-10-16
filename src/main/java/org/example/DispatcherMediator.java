package org.example;

class DispatcherMediator implements Mediator {
    private Client client;
    private Driver driver;
    private Dispatcher dispatcher;

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    @Override
    public void notify(Object sender, String event) {
        if (event.equals("RequestCar")) {
            System.out.println("Mediator: Client is requesting a car. Notifying dispatcher...");
            dispatcher.dispatchCar();
        } else if (event.equals("CarDispatched")) {
            System.out.println("Mediator: Car has been dispatched. Notifying client and driver...");
            client.receiveCar();
            driver.driveToLocation();
        }
    }
}