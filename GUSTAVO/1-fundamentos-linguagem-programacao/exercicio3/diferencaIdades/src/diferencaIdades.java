import java.util.Scanner;
public class diferencaIdades {
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Você está comparando idades");

        System.out.println("Digite a Idade 1:");
        int idade1 = sc.nextInt();

        System.out.println("Digite a Idade 2:");
        int idade2 = sc.nextInt();

        int diferenca = Math.abs(idade1 - idade2);

        System.out.println("A diferença entre as idades é de: " + diferenca + " anos");

        sc.close();
    }
