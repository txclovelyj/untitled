package factory;

public class PizzaTest {
    public static void main(String[] args) {
        AbstractPizzaStore a=new NYStylePizzaStore();
        AbstractPizzaStore b=new ChicagoStylePizzaStore();

        Pizza pizza=a.createPizza("cheese");
        System.out.println("Ethan ordered a "+pizza.getName()+"\n");

        Pizza pizza1=b.createPizza("cheese");
        System.out.println("Joel ordered a "+pizza1.getName()+"\n");
    }
}
