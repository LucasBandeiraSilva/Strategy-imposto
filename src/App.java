import impostos.ImpostoDois;
import impostos.ImpostoTres;
import impostos.ImpostoUm;

public class App {
    public static void main(String[] args) throws Exception {
        
        ImpostoUm ip1 = new ImpostoUm();
        ImpostoDois ip2 = new ImpostoDois();
        ImpostoTres ip3 = new ImpostoTres();

        CalculaImposto calcUm = new CalculaImposto(ip1);
        CalculaImposto calcDois = new CalculaImposto(ip2);
        CalculaImposto calcTres = new CalculaImposto(ip3);

        System.out.println("ip1: " + calcUm.calculaImposto(1000));
        System.out.println("ip2: " + calcDois.calculaImposto(1000));
        System.out.println("ip3: " + calcTres.calculaImposto(1000));

    }
}
