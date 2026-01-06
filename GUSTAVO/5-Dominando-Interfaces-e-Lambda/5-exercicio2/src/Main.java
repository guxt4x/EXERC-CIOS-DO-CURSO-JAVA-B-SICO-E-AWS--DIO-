public class Main {

    public static void main(String[] args) {


        Tax food = new Food("Strawberry", 10.0);
        Tax clothing = new Clothing("Jacket", 150.0);
        Tax culture = new Culture("Cinema", 40.0);
        Tax health = new Health("Drugstore", 200.0);

        System.out.println("Tax on Food (" + food.name() +") : $ " + food.calcularTax());
        System.out.println("Tax on Clothing (" + clothing.name() +") : $ " + clothing.calcularTax());
        System.out.println("Tax on Culture (" + culture.name() +") : $ " + culture.calcularTax());
        System.out.println("Tax on Drugstore (" + health.name() +") : $ " + health.calcularTax());
    }
}