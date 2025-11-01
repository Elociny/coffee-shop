package sp.senac.br.coffeeshop.model;

public class SimpleCoffee implements Coffee{
    @Override
    public double getPrice() {
        return 5.00;
    }

    @Override
    public String getImageUrl() {
        return "coffee";
    }

    @Override
    public String getName() {
        return "Café simples";
    }

    @Override
    public String getDescription() {
        return "Delicioso café espresso";
    }
}
