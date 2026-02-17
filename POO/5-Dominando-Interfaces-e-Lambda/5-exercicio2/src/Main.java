public class Main {

    public static void main(String[] args) {

        Food food = new Food("Strawberry", 10.0);
        Clothing clothing = new Clothing("Jacket", 150.0);
        Culture culture = new Culture("Cinema", 40.0);
        Health health = new Health("Drugstore", 200.0);

        System.out.println("Tax on Food (" + food.name() + " $" + food.valueFood() + ") : $ " + food.calculateTax());
        System.out.println("Tax on Clothing (" + clothing.name() + " $" + food.valueFood() + ") : $ " + clothing.calculateTax());
        System.out.println("Tax on Culture (" + culture.name() + " $" + food.valueFood() + ") : $ " + culture.calculateTax());
        System.out.println("Tax on Drugstore (" + health.name() + " $" + food.valueFood() + ") : $ " + health.calculateTax());
    }
}