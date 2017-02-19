package decorator.beverage_solution3;

public class HouseBlendCoffee implements Coffee {

  public double cost() {
    return 35.0;
  }

  public String getDescription() {
    return "House Blend Coffee";
  }
}
