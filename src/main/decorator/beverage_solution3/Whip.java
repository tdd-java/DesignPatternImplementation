package decorator.beverage_solution3;

public class Whip implements CondimentDecorator {
  private static final double WHIP_COST = 15.5;
  private static final String WHIP = "whipped milk";
  private Coffee coffee;

  public Whip(Coffee coffee) {
    this.coffee = coffee;
  }

  public double cost() {
    return WHIP_COST + coffee.cost();
  }

  public String getDescription() {
    return coffee.getDescription() + " with " + WHIP;
  }
}
