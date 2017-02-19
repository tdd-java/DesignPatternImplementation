package decorator.beverage_solution3;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HouseBlendTest {

  @Test
  public void shouldReturnCostForHouseBlendWithMilkAndMocha()  {
    Coffee houseBlendCoffee = new Mocha(new Whip(new HouseBlendCoffee()));

//    this is more like a we order, coffee and then top up
//    Coffee houseBlendCoffee = new HouseBlendCoffee(new Whip(new Mocha()));

//    The following is other way of doing it:
//    Coffee houseBlendCoffee = new HouseBlendCoffee();
//    houseBlendCoffee = new Mocha(houseBlendCoffee);
//    houseBlendCoffee = new Whip(houseBlendCoffee);

    assertThat(houseBlendCoffee.cost(), is(70.5));
//    assertThat(houseBlendCoffee.getDescription(), is("House Blend Coffee with mocha with whipped milk"));
  }
}
