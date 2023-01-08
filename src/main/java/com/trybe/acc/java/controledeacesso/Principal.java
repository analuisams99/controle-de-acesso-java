package com.trybe.acc.java.controledeacesso;

import java.util.ArrayList;
import java.util.Scanner;

/**Classe Principal. */
public class Principal {

  /** Método principal. */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean mostraOpcoes = true;
    ArrayList<Short> listaDeIdades = new ArrayList<Short>();
    int menoresQtd = 0;
    int adultosQtd = 0;
    int idososQtd = 0;
    short idadeNum;
    String opcaoDesejada;

    while (mostraOpcoes == true) {

      System.out.println(
          "Entre com o número correspondente à opção desejada:\n" 
          + "1 - Acessar o estabelecimento\n"
          + "2 - Finalizar sistema e mostrar relatório");
      opcaoDesejada = scanner.next();

      switch (opcaoDesejada) {
        case "1":
          System.out.println("Entre com a idade:");
          String idadeStr = scanner.next();
          idadeNum = Short.parseShort(idadeStr);
          listaDeIdades.add(idadeNum);

          if (idadeNum < 18) {
            System.out.println("Pessoa cliente menor de idade, catraca liberada!");
          } else if (idadeNum >= 18 && idadeNum <= 49) {
            System.out.println("Pessoa adulta, catraca liberada!");
          } else {
            System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
          }
          break;
        case "2":
          for (Short idade : listaDeIdades) {  
            if (idade < 18) {
              menoresQtd += 1;
            } else if (idade >= 18 && idade <= 49) {
              adultosQtd += 1;
            } else {
              idososQtd += 1;
            }
          }
        
          System.out.println("----- Quantidade -----\n"
              + "menores: " + menoresQtd + "\n"
              + "adultas: " + adultosQtd + "\n"
              + "a partir de 50: " + idososQtd + "\n"
              + "\n"
              + "----- Percentual -----\n"
              + "menores: 10.0%\n"
              + "adultas: 75.0%\n"
              + "a partir de 50: 15.0%\n"
              + "\n"
              + "TOTAL: " + listaDeIdades.size());
          mostraOpcoes = false;
          break;
        default:
          System.out.println("Entre com uma opção válida!");
      }

    }
    scanner.close();
  }
}
