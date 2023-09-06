import strategy.Strategy;

public class CalculaImposto {

    private Strategy strategy;

    public CalculaImposto(Strategy strategy) {
        this.strategy = strategy;
    }

    public double calculaImposto(double imposto){
        return strategy.calculaImposto(imposto);
    }
}
