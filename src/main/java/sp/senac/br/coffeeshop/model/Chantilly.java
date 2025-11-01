package sp.senac.br.coffeeshop.model;

public class Chantilly extends CoffeeDecorator {
    public Chantilly(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        if (coffee == null) {
            return 2.99;
        }
        return coffee.getPrice() + 2.99;
    }

    @Override
    public String getImageUrl() {
        return "chantilly";
    }

    @Override
    public String getName() {
        if (coffee == null) {
            return "Café com chantilly";
        }

        return coffee.getName() + " com chantilly";
    }

    @Override
    public String getDescription() {
        if (coffee == null) {
            return "Café com adicional de chantilly";
        }

        return coffee.getDescription() + " com adicional de chantilly";
    }
}
