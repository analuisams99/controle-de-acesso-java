package com.trybe.acc.java.controledeacesso;

/**Classe Mensagens. */
public class Mensagens {
  /**Método que imprime, no console, as opções do menu. */
  public static void opcoesMenu() {
    System.out.println(
            "Entre com o número correspondente à opção desejada:\n" 
            + "1 - Acessar o estabelecimento\n"
            + "2 - Finalizar sistema e mostrar relatório"
    );
  }
  
  /**Método que imprime, no console, a mensagem de opção inválida do menu. */
  public static void opcaoInvalida() {
    System.out.println("Entre com uma opção válida!");
  }

  /**Método que imprime, no console, a informação para a pessoa digitar a idade dela. */
  public static void digitarIdade() {
    System.out.println("Entre com a idade:");
  }
  
  /**Método que imprime, no console, a mensagem de catraca liberada. */
  public static void catracaLiberada(short idadeNum) {
    if (idadeNum < 18) {
      System.out.println("Pessoa cliente menor de idade, catraca liberada!");
    } else if (idadeNum >= 18 && idadeNum <= 49) {
      System.out.println("Pessoa adulta, catraca liberada!");
    } else {
      System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
    }
  }
  
  /**Método que imprime, no console, o relatório completo. */
  public static void relatorio(
      int menoresQtd, int adultosQtd, int idososQtd,
      float menoresPercent, float adultosPercent, float idososPercent,
      int total
  ) {
    System.out.println("----- Quantidade -----\n"
              + "menores: " + menoresQtd + "\n"
              + "adultas: " + adultosQtd + "\n"
              + "a partir de 50: " + idososQtd + "\n"
              + "\n"
              + "----- Percentual -----\n"
              + "menores: " + ((menoresQtd == 0) ? "0" : menoresPercent) + "%\n"
              + "adultas: " + ((adultosQtd == 0) ? "0" : adultosPercent) + "%\n"
              + "a partir de 50: " + ((idososQtd == 0) ? "0" : idososPercent) + "%\n"
              + "\n"
              + "TOTAL: " + total);
  }

}
