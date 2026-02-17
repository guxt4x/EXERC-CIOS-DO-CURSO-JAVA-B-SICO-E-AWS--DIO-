import java.util.Scanner;
public class Exercicio2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Sua altura: ");
        double altura = sc.nextDouble();

        System.out.printf("Seu peso: ");
        double peso = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso !");
        }

    }
}
