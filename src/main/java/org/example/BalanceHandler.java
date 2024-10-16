package org.example;

class BalanceHandler extends Handler {
    @Override
    public void handle(Request request) {
        if (request.isSufficientBalance()) {
            System.out.println("Sufficient balance.");
            if (next != null) {
                next.handle(request);
            }
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
