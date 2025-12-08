import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe seu nome ");
        String nome = sc.next();
        
        System.out.printf("Informe sua idade ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.printf("%s você pode dirigir, pois tem %s anos \n", nome, idade);
        } else {
            System.out.printf("%s você pode dirigir, pois tem %s anos \n" , nome, idade);
        }

        sc.close();
    }
}
