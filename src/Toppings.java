public class Toppings implements PizzaDecorator{
    Pizza pizza;
    Toppings(Pizza p){
        this.pizza=p;
    };
    @Override
    public String getDescription(){
        return pizza.getDescription()+" with extra toppings";
    }
    @Override
    public double getPrice(){
        return pizza.getPrice()+50.00;
    }
}
