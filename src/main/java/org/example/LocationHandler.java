package org.example;

class LocationHandler extends Handler {
    @Override
    public void handle(Request request) {
        if (request.isLocationServicable()) {
            System.out.println("Location is serviceable.");
        } else {
            System.out.println("Location not serviceable.");
        }
    }
}
