public class Pet {

    private final String nome;

    private boolean isClean;

    public Pet(String nome) {
            this.nome;
            this.isClean = false;
        }

    public String getNome() {
        return nome;
    }

    public boolean limpo() {
        return isClean;
    }

    public void setClean(final boolean clean) {
        this.clean = clean;
    }
}