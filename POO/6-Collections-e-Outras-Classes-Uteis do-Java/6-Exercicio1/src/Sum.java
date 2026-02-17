public class Sum {

    private int num1;
    private int num2;

    public Sum(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int calculateSum() {
        return num1 + num2;
    }

    @Override
    public String toString() {
        return "Sum [num1=" + num1 + ", num2=" + num2 + "]" + " = " + calculateSum();
    }
}
