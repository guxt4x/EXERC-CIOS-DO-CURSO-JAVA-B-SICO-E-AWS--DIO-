public record Food (String name, double valueFood) implements Tax {

    @Override
    public double calculateTax() {
        return valueFood * 0.01;
    }
}
