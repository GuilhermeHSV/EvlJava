package edu.guilherme.ProjetoIntegrador.ADO3;

import java.util.Scanner;

public class AdoTres1 {
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      float valorCompra;
      System.out.println("*** Desconto ***");
      System.out.print("Qual é o valor da compra?");
      valorCompra = scanner.nextFloat();

      if (valorCompra >= 300.00) {
         float desconto = (20 * valorCompra) / 100;
         float valorcomdesconto = valorCompra - desconto;
         System.out.println(
               "O valor descontado foi de: " + valorcomdesconto + "\nE o valor descontado foi de: " + desconto);
      } else {
         float desconto = (15 * valorCompra) / 100;
         float valorcomdesconto = valorCompra - desconto;
         System.out
               .println("O valor descontado foi de " + valorcomdesconto + "\nE o valor descontado foi de: " + desconto);
      }
      scanner.close();

   }
}
