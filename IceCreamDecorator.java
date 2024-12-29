public abstract class IceCreamDecorator extends IceCreamComponent {
    protected IceCreamComponent iceCream;

    public IceCreamDecorator(IceCreamComponent iceCream) {
        this.iceCream = iceCream;
    }

    // Both overrides return the wrapped class values
    @Override
    public String getDescription() {
        return iceCream.getDescription();
    }

    @Override
    public Double getCost() {
        return iceCream.getCost();
    }
}
