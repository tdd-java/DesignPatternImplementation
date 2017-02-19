package decorator.beverage_solution2;

public class Beverage {
  private static final double MILK_COST = 10;
  private static final double SOY_COST = 12;
  private static final double MOCHA_COST = 15;
  private static final double WHIP_COST = 20;
  private boolean hasMilk, hasSoy, hasMocha, hasWhip;

  public Beverage() {
    hasMilk = false;
    hasSoy = false;
    hasMocha = false;
    hasWhip = false;
  }

  public double cost() {
    double topUpCost = 0;
    if (hasMilk)
      topUpCost += MILK_COST;
    if (hasSoy)
      topUpCost += SOY_COST;
    if (hasMocha)
      topUpCost += MOCHA_COST;
    if (hasWhip)
      topUpCost += WHIP_COST;
    return topUpCost;
  }

  public void addMilkTopUp() {
    hasMilk = true;
  }

  public void addMochaTopUp() {
    hasMocha = true;
  }
}
