package org.example;

class CarAvailabilityHandler extends Handler {
    @Override
    public void handle(Request request) {
        if (request.isCarAvailable()) {
            System.out.println("Car is available.");
            if (next != null) {
                next.handle(request);
            }
        } else {
            System.out.println("No cars available.");
        }
    }
}