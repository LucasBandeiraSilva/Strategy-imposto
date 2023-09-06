package impostos;

import strategy.Strategy;

public class ImpostoDois implements Strategy{

    @Override
    public double calculaImposto(double valor) {
        return valor * 0.25;
    }

}
