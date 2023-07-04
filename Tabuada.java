//Leia 1 valor inteiro N(N<100).A seguir, mostre a tabuada de N:
import java.util.Scanner;

public class Tabuada {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o Numero: ");
        int N = sc.nextInt();

        for (int i = 1; i < 10; i++){
            int produto = i * N;
            System.out.println(i +  " X " + N + " = " + produto);
        }
        sc.close();
    }
}
