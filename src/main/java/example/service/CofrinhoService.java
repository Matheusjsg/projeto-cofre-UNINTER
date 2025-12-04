package example.service;



import example.model.Moeda;

import java.util.ArrayList;


public class CofrinhoService {


    private final ArrayList<Moeda> moedas = new ArrayList<>();



    public void adiconarMoeda(Moeda moeda) {


            for (Moeda m : moedas) { //inicia um for-each que percorre cada elemento m dentro da coleção moedas (presumivelmente ArrayList<Moeda>).

                if (m.getClass() == moeda.getClass()) {
                    m.valor += moeda.valor;   // soma os valores
                    System.out.println("Valor somado à moeda existente!");
                    return;
                }
            }

            moedas.add(moeda);  // se não tiver moeda desse tipo, cria uma

            System.out.println("Moeda adicionada!");
        }

    public  void removerMoedas(Moeda moeda) {

        for (Moeda m : moedas) { //inicia um for-each que percorre cada elemento m dentro da coleção moedas (presumivelmente ArrayList<Moeda>).

            if (m.getClass() == moeda.getClass()) {
                m.valor -= moeda.valor;   // remove os valores

                return;
            }

            System.out.println("Moedas removida!");
        }
    }


    public void listarMoedas() {
        System.out.println("Moedas em conta");
        for (Moeda m : moedas) {
            m.info();
        }
    }

    public void totalConvertido() {

        double total = 0;
        for (Moeda m : moedas) {
            total += m.converterParaReal();
        }
            System.out.println("Total cnvertido para R$ : " + total);

        }

    }

