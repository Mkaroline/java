/* Escreva um programa que receba um ângulo em graus e o converta para sua representação em radianos.
Divulgue também seno, cosseno, tangente, cossecante, secante e
cotangente do ângulo.  */
import java.lang.Math;
import java.util.Scanner;

public class converterangulo {
    public static void main(String[] args){
    double G,rad, seno,tan,cos;

     Scanner ent = new Scanner (System.in);// ler a entrada do usuario
     System.out.print("Informe um angulo em graus: ");// solicitar ao usuario  para informar um  angulo em graus
     G = ent.nextDouble();

     rad = G *  (Math.PI/180);//formula de conversao para radiano
     Math.sin(Math.PI/2);//funcao seno
     Math.cos(Math.PI);//funcao para cosseno
     Math.tan(Math.PI/2);//funcao para tangente
     Double conssecante = 1 / Math.sin(rad);//formula do cossecante
     Double secante = 1 / Math.cos(rad);//formula da secante
     double contangente = Math.cos(rad) / Math.sin(rad);//formula da contangente

     System.out.println("O angulo convertido em graus para radiano eh:" + rad + "rad");//resultado convertido em  radiano 
     System.out.println("Seno = " + Math.sin(rad));//convertido em radiano
     System.out.println("Cosseno  = " + Math.cos(rad));//convertido em radiano
     System.out.println("Tangente = " + Math.tan(rad));//convertido em radiano
     System.out.println("Conssecante = " + conssecante);//convertido em radiano 
     System.out.println("Secante = " + secante);//convertido em radiano
     System.out.println("Cotangente = " + contangente);//convertido em radiano


/*Radiando : 0.5235987755982988
Seno : 0.49999999999999994
Cosseno : 0.8660254037844387
Tangente : 0.5773502691896257
Cossecante : 2.0000000000000004
Secante : 1.1547005383792515
Cotangente : 1.7320508075688776 */

    }


}

