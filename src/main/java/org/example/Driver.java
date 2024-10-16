package org.example;

class Driver {
    private String name;
    private int distanceFromClient;

    public Driver(String name, int distanceFromClient) {
        this.name = name;
        this.distanceFromClient = distanceFromClient;
    }

    public int getDistanceFromClient() {
        return distanceFromClient;
    }

    public String getName() {
        return name;
    }

    private Mediator mediator;

    public Driver(Mediator mediator) {
        this.mediator = mediator;
    }

    public void driveToLocation() {
        System.out.println("Driver: Driving to client's location...");
    }
}