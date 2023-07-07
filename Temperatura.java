//Escreva um programa que receba uma temperatura em graus centígrados e a apresente
//em graus Fahrenheit.
import java.util.Scanner;

public class Temperatura  {
  public static void main (String[] args){
    double C,fahrenheit;
        Scanner entrada = new Scanner(System.in);

    System.out.println("Informe a temperatura em Celsius:");
    C = entrada.nextInt();
    fahrenheit = (C * 1.8) + 32;

    System.out.println("A conversao em celsius para Fahrenheit: " + fahrenheit);
  }
}
