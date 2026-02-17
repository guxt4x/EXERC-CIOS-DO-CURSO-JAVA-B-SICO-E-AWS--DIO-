public class IngressoFamilia extends Ingresso {

    private int quantidadePessoas;

    public IngressoFamilia(String nomeDoFilme, String idioma, double valorIngresso, int quantidadePessoas) {
        super(nomeDoFilme, idioma, valorIngresso);
        this.quantidadePessoas = quantidadePessoas;
    }

    @Override
    public double calcularValorReal() {
        double total = getValorIngresso() * quantidadePessoas;

        if (quantidadePessoas > 3) {
            total = total * 0.95;
        }

        return total;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }
}