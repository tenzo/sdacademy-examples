package pl.sdacademy.patterns.strategy.example;

public class Cash implements PaymentMethod {
    @Override
    public void pay(int cents) {
        System.out.println("Paying with cash " + cents + " cents");
    }
}
