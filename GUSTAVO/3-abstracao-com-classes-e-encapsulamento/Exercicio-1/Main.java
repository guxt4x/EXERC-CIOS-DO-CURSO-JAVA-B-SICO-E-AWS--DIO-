import java.util.Scanner;
public class Main {

    private final static Scanner sc = new Scanner(System.in);
    private final static Maquina pe

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var option = -1;

        do {
            System.out.println("-------Escolha uma das opções--------");
            System.out.println(" 1 - Dar banho no pet");
            System.out.println(" 2 - Abastecer a máquina com água");
            System.out.println(" 3 - Abastecer a máquina com shampoo");
            System.out.println(" 4 - Verifica a água da máquina");
            System.out.println(" 5 - Verifica o shampoo da máquina");
            System.out.println(" 6 - Colocar o pet na máquina");
            System.out.println(" 7 - Retirar o pet da máquina");
            System.out.println(" 8 - Limpar a máquina");
            System.out.println(" 0 - Sair");
        }

        while (option != 0);
    }

    public static void main(String[] args) {
        System.out.print("Informe o nome do seu pet");
        var nome = sc.next();
        var pet = new Pet(nome);
    }
}