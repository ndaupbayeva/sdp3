package org.example;

import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Driver> drivers = List.of(
                new Driver("Alice", 5),
                new Driver("Bob", 3),
                new Driver("Charlie", 8)
        );

        DriverList driverList = new DriverList(drivers);
        Iterator iterator = driverList.createIterator();

        while (iterator.hasNext()) {
            Driver driver = iterator.next();
            System.out.println(driver.getName() + " is " + driver.getDistanceFromClient() + " miles away.");
        }
    }
}
