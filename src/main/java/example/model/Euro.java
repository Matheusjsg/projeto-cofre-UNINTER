package example.model;

public class Euro extends Moeda{


    public Euro(Double valor) {
        super(valor);
    }

    public Euro(){

    }
    @Override
    public void info() {
        {
            System.out.println("O valor da moeda atualmente é de €" + valor);
        }
    }

    @Override
    public double converterParaReal() {
        return valor * 6.20;
    }
}
