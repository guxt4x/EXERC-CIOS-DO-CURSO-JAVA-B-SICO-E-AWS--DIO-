public class Pet {
    private final String nome;
    private boolean isClean;

    public Pet(String nome) {
        this.nome = nome;
        this.isClean = false;
    }

    public String getNome() {
        return nome;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(final boolean clean) {
        this.isClean = clean;
    }
}