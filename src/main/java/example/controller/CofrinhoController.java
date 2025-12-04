package example.controller;


import example.model.Dolar;
import example.model.Euro;
import example.model.Real;
import example.service.CofrinhoService;
import example.utils.MenusStrings;

import java.util.Scanner;

public class CofrinhoController {

    MenusStrings menusStrings = new MenusStrings();
    CofrinhoService poupanca = new CofrinhoService();
    Scanner scanner = new Scanner(System.in);
    int opcao;

    //método de iniciar o programa
    public void iniciarCofrinho() {


        do {
            System.out.println(menusStrings.menuPrincipal());
            opcao = scanner.nextInt();


            switch (opcao) {

                case 1:
                    //esolhendo o tipo de moeda para ser adicionada
                    System.out.println(menusStrings.menuMoedas());
                    opcao = scanner.nextInt();

                    // escolhendo valor a ser adicionado
                    System.out.println("Qual o valor ?");
                    double valor = scanner.nextDouble();

                    if (opcao == 1) {
                        poupanca.adiconarMoeda(new Euro(valor));
                    } else if (opcao == 2) {
                        poupanca.adiconarMoeda(new Dolar(valor));
                    } else if (opcao == 3) {
                        poupanca.adiconarMoeda(new Real(valor));
                    }
                    break;


                case 2:
                    //escolhendo qual moeda será removida
                    System.out.println(menusStrings.menuMoedas());
                    opcao = scanner.nextInt();

                    //escolhendo o valor a ser removido
                    System.out.println("Qual o valor ?");
                    double qntd = scanner.nextDouble();


                    if (opcao == 1) {
                        poupanca.removerMoedas(new Euro(qntd));
                    } else if (opcao == 2) {
                        poupanca.removerMoedas(new Dolar(qntd));
                    } else if (opcao == 3) {
                        poupanca.removerMoedas(new Real(qntd));
                    }
                    break;

                case 3:

                    poupanca.totalConvertido();

                    break;


                case 4:
                    poupanca.listarMoedas();
                    break;

                default:
                    System.out.println("Opção inválida! Para encerrar digite '0' ");

            }

        } while (opcao != 0);

    }

}