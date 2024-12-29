public class NutTopping extends IceCreamDecorator {
    public NutTopping(IceCreamComponent iceCream) {
        super(iceCream);
    }

    // Return current description plus the new topping
    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Nuts Topping";
    }

    // Return the current cost plus the cost of nut toppings
    @Override
    public Double getCost() {
        return iceCream.getCost() + 0.5;
    }
}
