package example.model;

public class Dolar extends Moeda{

    public Dolar(Double valor) {
        super(valor);
    }

    public Dolar(){}


    @Override
    public void info() {
        System.out.println("O valor da moeda atualmente é de U$" + valor);
    }

    @Override
    public double converterParaReal() {
       return this.valor * 5.36;
    }
}
