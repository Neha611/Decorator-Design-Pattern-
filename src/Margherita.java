public class Margherita implements Pizza{
    Margherita(){};
    @Override
    public String getDescription(){
        return "This is a Margherita Pizza";
    }
    @Override
    public double getPrice(){
        return 400.00;
    }
}
