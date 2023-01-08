package com.trybe.acc.java.controledeacesso;

import java.util.ArrayList;
import java.util.Scanner;

/**Classe Principal. */
public class Principal {

  /** Método principal. */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean mostraOpcoes = true;

    do {
      System.out.println(
          "Entre com o número correspondente à opção desejada:\n" 
          + "1 - Acessar o estabelecimento\n"
          + "2 - Finalizar sistema e mostrar relatório");
      String opcaoDesejada = scanner.next();

      short idadeInt;
      ArrayList<Short> listaDeIdades = new ArrayList<Short>();

      switch (opcaoDesejada) {
        case "1":
          System.out.println("Entre com a idade:");
          String idade = scanner.next();
          idadeInt = Short.parseShort(idade);
          listaDeIdades.add(idadeInt);

          if (idadeInt < 18) {
            System.out.println("Pessoa cliente menor de idade, catraca liberada!");
          } else if (idadeInt >= 18 && idadeInt <= 49) {
            System.out.println("Pessoa adulta, catraca liberada!");
          } else {
            System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
          }
          break;
        case "2":
          System.out.println("segunda opção:");
          mostraOpcoes = false;
          break;
        default:
          System.out.println("Entre com uma opção válida!");
      }
    } while (mostraOpcoes == true);


    scanner.close();
  }
}
