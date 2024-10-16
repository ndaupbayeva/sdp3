package org.example;

class CancelOrderCommand implements Command {
    private TaxiOrder taxiOrder;

    public CancelOrderCommand(TaxiOrder taxiOrder) {
        this.taxiOrder = taxiOrder;
    }

    @Override
    public void execute() {
        taxiOrder.cancelOrder();
    }
}

