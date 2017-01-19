package duck_example.duck;

import duck_example.duck.flyable.FlyWithWings;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MallardDuckTest {
  MallardDuck mallardDuck;

  @Before
  public void setUp() throws Exception {
    mallardDuck = new MallardDuck();
    mallardDuck.setFlyBehavior(new FlyWithWings());
  }

  @Test
  public void shouldBeAbleToQuack() {
    assertThat(mallardDuck.quack(), is( "Quack! Quack!"));
  }

  @Test
  public void shouldBeAbleToSwim()  {
    assertThat(mallardDuck.swim(), is("I can swim!"));
  }

  @Test
  public void shouldDisplayMallardDuckLogo()  {
    assertThat(mallardDuck.display(), is("I'm Mallard Duck!"));
  }

  @Test
  public void shouldBeAbleToFly()  {
    assertThat(mallardDuck.fly(), is("I can fly with Wings!"));
  }
}
