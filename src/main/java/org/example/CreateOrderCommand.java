package org.example;

class CreateOrderCommand implements Command {
    private TaxiOrder taxiOrder;

    public CreateOrderCommand(TaxiOrder taxiOrder) {
        this.taxiOrder = taxiOrder;
    }

    @Override
    public void execute() {
        taxiOrder.createOrder();
    }
}
