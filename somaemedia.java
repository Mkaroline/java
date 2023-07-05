//Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3
//valores reais serão informados pelo usuário.
import java.util.Scanner;

public class somaemedia {
    public  static void main(String[] args){
        double n1, n2, n3, med,soma;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        n1 =entrada.nextDouble();
        System.out.print("Informe o segundo numero: ");
        n2 =entrada.nextDouble();
        System.out.print("Informe o terceiro numero: ");
        n3 =entrada.nextDouble();

        soma = (n1+n2+n3);
        med = soma/3;
    System.out.println(" soma: " + soma + " med: " + med);

    }

}
