public class Main {
    public static void main(String[] args) {
        // Create the base ice cream and print its current state
        IceCreamComponent iceCream = new BasicIceCream("Vanilla");
        System.out.println(iceCream.getDescription() + " Ice Cream: $" + iceCream.getCost());

        // Add sprinkles re-assigning iceCream with a sprinkles concrete decorator
        iceCream = new SprinklesTopping(iceCream);
        System.out.println(iceCream.getDescription() + " Ice Cream: $" + iceCream.getCost());

        // Add nuts in the same way
        iceCream = new NutTopping(iceCream);
        System.out.println(iceCream.getDescription() + " Ice Cream: $" + iceCream.getCost());
    }
}