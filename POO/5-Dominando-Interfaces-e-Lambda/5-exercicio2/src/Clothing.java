public record Clothing(String name, double valueClothing) implements Tax{

    @Override
    public double calculateTax() {
        return valueClothing * 0.025;
    }

    @Override
    public String name() {
        return name;
    }
}
