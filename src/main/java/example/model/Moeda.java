package example.model;

public abstract class Moeda {

    public double valor;


    protected Moeda() {
    }


    public Moeda(double valor){
        this.valor = valor;
}


    public abstract void info ();



   public abstract double converterParaReal();



   public Moeda(Double valor) {
       this.valor = valor;
   }


@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Moeda moeda = (Moeda) o;
    return Double.compare(moeda.valor, valor) == 0;
}

@Override
public int hashCode() {
    return Double.hashCode(valor);
}

}
