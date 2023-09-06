package impostos;

import strategy.Strategy;

public class ImpostoTres implements Strategy {

    @Override
    public double calculaImposto(double valor) {
        return valor * 0.25;
    }
    
}
