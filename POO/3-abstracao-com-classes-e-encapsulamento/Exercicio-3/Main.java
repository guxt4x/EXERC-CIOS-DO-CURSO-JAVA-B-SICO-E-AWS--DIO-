import java.util.Scanner;

public class Main {
    private final static Scanner sc = new Scanner(System.in);
    private final static Maquina maquina = new Maquina();

    public static void main(String[] args) {
        int option = -1;
        Pet pet = null;

        do {
            System.out.println("\n-------Escolha uma das opções--------");
            System.out.println(" 1 - Dar banho no pet");
            System.out.println(" 2 - Abastecer a máquina com água");
            System.out.println(" 3 - Abastecer a máquina com shampoo");
            System.out.println(" 4 - Verificar a água da máquina");
            System.out.println(" 5 - Verificar o shampoo da máquina");
            System.out.println(" 6 - Colocar o pet na máquina");
            System.out.println(" 7 - Retirar o pet da máquina");
            System.out.println(" 8 - Limpar a máquina");
            System.out.println(" 0 - Sair");
            System.out.print("Opção: ");
            
            option = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            switch (option) {
                case 1:
                    maquina.tomarBanho();
                    break;
                case 2:
                    maquina.adicionarAgua();
                    break;
                case 3:
                    maquina.adicionarShampoo();
                    break;
                case 4:
                    System.out.println("Água na máquina: " + maquina.getWater() + " litros");
                    break;
                case 5:
                    System.out.println("Shampoo na máquina: " + maquina.getShampoo() + " litros");
                    break;
                case 6:
                    System.out.print("Informe o nome do seu pet: ");
                    String nome = sc.nextLine();
                    pet = new Pet(nome);
                    maquina.setPet(pet);
                    break;
                case 7:
                    maquina.removerPet();
                    break;
                case 8:
                    maquina.limparMaquina();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (option != 0);
        
        sc.close();
    }
}