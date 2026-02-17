public class Main {
    public static void main(String[] args) {

        // 1. Ingresso Normal (R$ 50,00)
        Ingresso normal = new Ingresso("Vingadores", "Legendado", 50.00);
        System.out.println("Normal: " + normal.calcularValorReal());

        // 2. Meia Entrada (Metade de R$ 50,00)
        IngressoMeia meia = new IngressoMeia("Vingadores", "Dublado", 50.00);
        System.out.println("Meia: " + meia.calcularValorReal());

        // 3. Família Pequena (3 pessoas * R$ 50 = 150. Sem desconto)
        IngressoFamilia familia1 = new IngressoFamilia("Barbie", "Dublado", 50.00, 3);
        System.out.println("Família (3 pessoas): " + familia1.calcularValorReal());

        // 4. Família Grande (4 pessoas * R$ 50 = 200. Com 5% desconto = 190)
        IngressoFamilia familia2 = new IngressoFamilia("Barbie", "Dublado", 50.00, 4);
        System.out.println("Família (4 pessoas com desconto): " + familia2.calcularValorReal());
    }
}