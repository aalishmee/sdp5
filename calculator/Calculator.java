package calculator;

public class Calculator {
    private Strategy strategy;

    public Calculator(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double compute(double a, double b) {
        return strategy.execute(a, b);
    }

    public String getCurrentStrategyName() {
        return strategy.getName();
    }
}