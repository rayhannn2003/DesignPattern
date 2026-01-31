package Command.Restaurant;

public class Chef {
    private String name;
    
    public Chef(String name) {
        this.name = name;
    }
    
    public void cookBurger() {
        System.out.println(name + " is cooking: Burger");
    }
    
    public void cookPizza() {
        System.out.println(name + " is cooking: Pizza");
    }
    
    public void cookPasta() {
        System.out.println(name + " is cooking: Pasta");
    }
    
    public void cookSalad() {
        System.out.println(name + " is cooking: Salad");
    }
}
