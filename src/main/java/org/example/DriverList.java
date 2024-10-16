package org.example;

import java.util.List;

class DriverList {
    private List<Driver> drivers;

    public DriverList(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public Iterator createIterator() {
        return new DriverIterator(drivers);
    }
}