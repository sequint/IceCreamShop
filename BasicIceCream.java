public class BasicIceCream extends IceCreamComponent {
    private final String flavor;

    public BasicIceCream(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String getDescription() {
        return flavor;
    }

    @Override
    public Double getCost() {
        return 2.0;
    }
}
