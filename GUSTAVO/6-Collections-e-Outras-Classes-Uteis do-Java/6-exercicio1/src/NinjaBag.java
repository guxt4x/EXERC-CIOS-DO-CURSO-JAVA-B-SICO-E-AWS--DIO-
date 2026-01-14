import java.util.List;

public class NinjaBag <T> {

    private List<T> itens;

    public NinjaBag(List<T> itens) {
        this.itens = itens;
    }

    public void addItens(T item) {
        itens.add(item);
    }

    public void exibirItens () {
        for (T item : itens) {
            System.out.println(item);
        }
    }
}
