import java.util.Scanner;

public class  Dados {//nome dp programa
    public static void main (String[] args){//metado principal java
    String nome, cidade;
    int ano;
    Scanner entrada = new Scanner (System.in);

    for (int i = 0; i<20; i++ ){
    System.out.print("Informe seu nome: ");
    nome = entrada.nextLine();
    System.out.print("Informe o nome da cidade: ");
    cidade = entrada.nextLine();
    System.out.print("Informe quanto anos vc tem: ");
    ano = entrada.nextInt();

    System.out.println("Nome do Usuario: " + nome);
    System.out.println("Nome da cidade: " + cidade);
    System.out.println("Idade do usuario: " + ano);

    }
//System.out.print();

    entrada.close();
}

}