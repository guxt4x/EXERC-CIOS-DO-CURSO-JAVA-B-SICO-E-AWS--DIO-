public record Health (String name, double valueHealth) implements Tax {


    @Override
    public double calculateTax() {
        return valueHealth * 0.015;
    }
}
