package sp.senac.br.coffeeshop.model;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getPrice() {
        return coffee.getPrice();
    }

    @Override
    public String getImageUrl() {
        return coffee.getImageUrl();
    }

    @Override
    public String getName() {
        return coffee.getName();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
}
