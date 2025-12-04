package example.model;

public class Real extends Moeda{


    public Real(Double valor) {
        super(valor);
    }

    public Real(){}

    @Override
    public void info() {

        System.out.println("O valor da moeda atualmente é de R$" + valor);
    }

    @Override
    public double converterParaReal() {
        return this.valor;
    }
}
