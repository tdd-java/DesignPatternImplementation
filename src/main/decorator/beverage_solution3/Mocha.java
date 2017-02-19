package decorator.beverage_solution3;

public class Mocha implements CondimentDecorator {
  private static final double MOCHA_COST = 20.0;
  private static final String TOP_UP_DESCRIPTION = "mocha";
  Coffee coffee;

  public Mocha(Coffee coffee) {
    this.coffee = coffee;
  }

  public double cost() {
    return MOCHA_COST + coffee.cost();
  }

  public String getDescription() {
    return coffee.getDescription() + " with " + TOP_UP_DESCRIPTION;
  }
}
