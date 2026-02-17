import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Escolha um número inteiro: ");
        int numero = sc.nextInt();

        System.out.printf("Escolha um número inteiro maior: ");
        int numeroMaior = sc.nextInt();

        if (numeroMaior <= numero) {
            System.out.println("Número inválido. O segundo número deve ser maior que o primeiro.");
            return;
        }

        int escolha;

        do {

            // menu
            while (true) {
                System.out.print("Deseja ver (1) números ímpares ou (2) números pares? ");
                escolha = sc.nextInt();

                if (escolha == 1 || escolha == 2) {
                    break;
                } else {
                    System.out.println("Opção inválida. Digite 1 ou 2.");
                }
            }

            // ímpares
            if (escolha == 1) {
                System.out.println("Números ímpares entre " + numero + " e " + numeroMaior + ":");
                for (int i = numero + 1; i < numeroMaior; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }

            // pares
            } else {
                System.out.println("Números pares entre " + numero + " e " + numeroMaior + ":");
                for (int i = numero + 1; i < numeroMaior; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            }

            System.out.print("Deseja repetir? (1=sim / 0=não): ");
            
        } while (sc.nextInt() == 1);

        System.out.println("Fim do programa!");
    }
}
