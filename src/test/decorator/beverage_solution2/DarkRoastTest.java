package decorator.beverage_solution2;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DarkRoastTest {
  @Test
  public void shouldReturnCostForDarkRoastWithMilkAndMocha() {
    DarkRoast darkRoastCoffee = new DarkRoast();
    darkRoastCoffee.addMilkTopUp();
    darkRoastCoffee.addMochaTopUp();
    assertThat(darkRoastCoffee.cost(), is(45.00));
  }
}
