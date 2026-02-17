import java.util.Scanner;

public class nomeIdade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome ?");
        String nome = sc.nextLine();

        System.out.println("Qual sua idade ?");
        int idade = sc.nextInt();


        System.out.printf("Seu nome é " + nome + " e sua idade é " + idade);

        sc.close();
    }
}