package com.trybe.acc.java.controledeacesso;

import java.util.ArrayList;
import java.util.Scanner;

/**Classe Principal. */
public class Principal {

  /** Método principal. */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Short> listaDeIdades = new ArrayList<Short>();

    boolean mostraOpcoes = true;
    int menoresQtd = 0;
    int adultosQtd = 0;
    int idososQtd = 0;
 
    while (mostraOpcoes == true) {
      Mensagens.opcoesMenu();
      String opcaoDesejada = scanner.next();

      switch (opcaoDesejada) {
        case "1":
          Mensagens.digitarIdade();
          String idadeStr = scanner.next();

          short idadeNum = Short.parseShort(idadeStr);
          listaDeIdades.add(idadeNum);

          Mensagens.catracaLiberada(idadeNum);
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
          int total = listaDeIdades.size();
          
          float menoresPercent = (menoresQtd / (float) total) * 100;
          float adultosPercent = (adultosQtd / (float) total) * 100;
          float idososPercent = (idososQtd / (float) total) * 100;

          Mensagens.relatorio(
              menoresQtd, adultosQtd, idososQtd, 
              menoresPercent, adultosPercent, idososPercent,
              total
          );
          mostraOpcoes = false;
          break;

        default:
          Mensagens.opcaoInvalida();
      }
    }

    scanner.close();
  }
}
