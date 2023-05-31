public class PizzaShop {
    public static void main(String[] args) {
        Pizza margherita=new Margherita();
        margherita=new Cheese(margherita);
        margherita=new Toppings(margherita);
        System.out.println(margherita.getDescription());
        System.out.println(margherita.getPrice());
    }
}