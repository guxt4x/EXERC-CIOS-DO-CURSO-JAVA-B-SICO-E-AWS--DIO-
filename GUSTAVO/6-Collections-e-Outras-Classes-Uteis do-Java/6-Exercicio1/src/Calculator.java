import java.util.ArrayList;

public class Calculator<T> {

    ArrayList<T> operation = new ArrayList<>();

    public ArrayList<T> getOperation() {
        return operation;
    }

    public void calculate(T op) {
        operation.add(op);
    }

    @Override
    public String toString() {
        return getOperation().toString();
    }
}