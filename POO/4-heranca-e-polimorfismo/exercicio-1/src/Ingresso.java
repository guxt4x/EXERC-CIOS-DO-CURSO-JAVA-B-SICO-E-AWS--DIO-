public class Ingresso {

    private String nomedoFilme;
    private String idioma;
    private double valorIngresso;


    public Ingresso(String nomedoFilme, String idioma, double valorIngresso) {
        this.nomedoFilme = nomedoFilme;
        this.idioma = idioma;
        this.valorIngresso = valorIngresso;
    }

    public double calcularValorReal() {
        return this.valorIngresso;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }
    public String getNomedoFilme() {
        return nomedoFilme;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setNomedoFilme(String nomedoFilme) {
        this.nomedoFilme = nomedoFilme;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
}
