import java.util.Scanner;

public class PrimeiroPrograma{
    public static void main (String[] args){
    String nome;
    Scanner entrada = new Scanner (System.in);

    System.out.print("Informe seu nome: ");
    nome = entrada.nextLine();

    System.out.println("Bem Vindo(a): " + nome);

    entrada.close();
}

}