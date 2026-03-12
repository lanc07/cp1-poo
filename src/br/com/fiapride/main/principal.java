package br.com.fiapride.main;
import br.com.fiapride.model.Veiculo;
public class principal {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("jao cookies", "BTS 130613");
        v1.adicionar(50);
        v1.gasta(60);
        System.out.println("Dono: "+ v1.getDono() +"| Placa: " +v1.getPl() + " | Gasolina: " +
                v1.getGas()+"L");
    }
}
