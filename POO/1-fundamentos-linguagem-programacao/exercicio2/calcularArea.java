package exercicio2;
import java.util.Scanner;

public class calcularArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Você está calculando a área de um quadrado");

        System.out.println("Informe tamanho do lado 1 do quadrado:");
        double ladoQuadrado1 = sc.nextDouble();

        System.out.println("Informe tamanho do lado 2 do quadrado:");
        double ladoQuadrado2 = sc.nextDouble();

        System.out.println("O seu quadrado possui uma área de: " + ladoQuadrado1 * ladoQuadrado2 + " metros quadrados" );

        sc.close();
        
    }
}
