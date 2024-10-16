package org.example;

class Request {
    private boolean carAvailable;
    private boolean sufficientBalance;
    private boolean locationServicable;

    public Request(boolean carAvailable, boolean sufficientBalance, boolean locationServicable) {
        this.carAvailable = carAvailable;
        this.sufficientBalance = sufficientBalance;
        this.locationServicable = locationServicable;
    }

    public boolean isCarAvailable() {
        return carAvailable;
    }

    public boolean isSufficientBalance() {
        return sufficientBalance;
    }

    public boolean isLocationServicable() {
        return locationServicable;
    }
}