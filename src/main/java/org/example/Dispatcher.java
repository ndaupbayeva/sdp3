package org.example;

class Dispatcher {
    public void takeOrder(Command command) {
        command.execute();
    }
    private Mediator mediator;

    public Dispatcher(Mediator mediator) {
        this.mediator = mediator;
    }

    public void dispatchCar() {
        System.out.println("Dispatcher: Dispatching a car...");
        mediator.notify(this, "CarDispatched");
    }
}