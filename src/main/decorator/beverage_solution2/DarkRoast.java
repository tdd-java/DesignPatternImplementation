package decorator.beverage_solution2;

public class DarkRoast extends Beverage{

  private static final double DARK_ROAST_COST = 20;

  public double cost() {
    return DARK_ROAST_COST + super.cost();
  }
}
