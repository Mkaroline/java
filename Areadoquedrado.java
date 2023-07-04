import java.util.Scanner;
public class Areadoquedrado {
    public static void main(String[] args){
    int A,H,L;
     Scanner entrada = new Scanner (System.in);

     System.out.print("Informe o valor do lado:");
     L = entrada.nextInt();
     System.out.print("Informe o valor da altura:");
     H = entrada.nextInt();

     A = L * H;
   System.out.println("A area do quadrado eh: " + A + " cm ");
      entrada.close();
      
    }
   public static int A(int L, int H) {
     int A = L*H;
     return A;
}

}