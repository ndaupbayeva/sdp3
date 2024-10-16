package org.example;

class Client {
    private Mediator mediator;

    public Client(Mediator mediator) {
        this.mediator = mediator;
    }

    public void requestCar() {
        System.out.println("Client: Requesting a car...");
        mediator.notify(this, "RequestCar");
    }

    public void receiveCar() {
        System.out.println("Client: Car has arrived!");
    }
}

