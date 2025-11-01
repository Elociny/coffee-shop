package sp.senac.br.coffeeshop.model;

public class Milk extends CoffeeDecorator {

    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        if (coffee == null) {
            return 1.00;
        }

        return coffee.getPrice() + 1.99;
    }

    @Override
    public String getImageUrl() {
        return "milk";
    }

    @Override
    public String getName() {
        if (coffee == null) {
            return "Café com leite";
        }

        return coffee.getName() + " com leite";
    }

    @Override
    public String getDescription() {
        if (coffee == null) {
            return "Café com adicional de leite cremoso";

        }

        return coffee.getDescription() + " com leite cremoso";
    }
}
