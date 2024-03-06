package com.mycompany.exercicioswitchcase03;

import java.util.Scanner;

public class ExercicioSwitchCase03 {

      public static void main(String[] args) {
        
      Scanner teclado = new Scanner(System.in);          
          
      char x;
        
      System.out.println("Digite uma letra maiúscula ou miníscula");
      
      x = teclado.next().charAt(0);

      switch (x) {
          
      case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' -> System.out.println("É uma Vogal");
      
      default -> System.out.println("É uma Consoante");
      }
    }
}

