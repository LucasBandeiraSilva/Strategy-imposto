package impostos;

import strategy.Strategy;

public class ImpostoUm implements Strategy{

    @Override
    public double calculaImposto(double valor) {
        return valor * 0.10;
    }
}
