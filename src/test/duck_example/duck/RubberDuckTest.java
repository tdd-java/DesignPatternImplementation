package duck_example.duck;

import duck_example.duck.flyable.FlyWithToggle;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RubberDuckTest {
  RubberDuck rubberDuck;

  @Before
  public void setUp()
  {
    rubberDuck = new RubberDuck();
    rubberDuck.setFlyBehavior(new FlyWithToggle());
  }

  @Test
  public void shouldSqueak() {
    assertThat(rubberDuck.quack(), is("Squeak!"));
  }

  @Test
  public void shouldDisplayRubberDuckLogo() {
    assertThat(rubberDuck.display(), is("I'm Rubber Duck!"));
  }

  @Test
  public void shouldBeAbleToFlyWhenToggleIsOn() {
    assertThat(rubberDuck.fly(), is("I can fly when toggle is ON!"));
  }
}
