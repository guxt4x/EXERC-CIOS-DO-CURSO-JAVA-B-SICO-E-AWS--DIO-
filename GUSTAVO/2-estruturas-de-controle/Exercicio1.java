import java.util.Scanner;
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int número = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = número * i;
            System.out.println(número + " x " + i + " = " + resultado);
        }
    }
}