public class IngressoMeia extends Ingresso {
    public IngressoMeia(String nomedoFilme, String idioma, double valorIngresso) {
        super(nomedoFilme, idioma, valorIngresso);
    }

    @Override
    public double calcularValorReal() {
        return super.calcularValorReal() / 2;
    }
}
