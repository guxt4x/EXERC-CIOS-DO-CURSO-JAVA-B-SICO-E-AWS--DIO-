public record Culture (String name, double valueCulture) implements Tax {

    @Override
    public double calculateTax() {
        return valueCulture * 0.04;
    }

    @Override
    public String name() {
        return name;
    }
}
