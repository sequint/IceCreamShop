public class SprinklesTopping extends IceCreamDecorator {
    public SprinklesTopping(IceCreamComponent iceCream) {
        super(iceCream);
    }

    // Return current description plus the sprinkles topping
    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Sprinkles Topping";
    }

    // Return the current cost plus the cost of sprinkles toppings
    @Override
    public Double getCost() {
        return iceCream.getCost() + 0.25;
    }
}
