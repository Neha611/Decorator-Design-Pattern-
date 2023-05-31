public class Cheese implements PizzaDecorator{
    Pizza pizza;
    Cheese(Pizza p){
        this.pizza=p;
    };
    @Override
    public String getDescription(){
        return pizza.getDescription()+" with extra cheese";
    }
    @Override
    public double getPrice(){
        return pizza.getPrice()+10.00;
    }
}
