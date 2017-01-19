package duck_example.duck;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RedHeadDuckTest {
  RedHeadDuck redHeadDuck;

  @Before
  public void setUp() throws Exception {
    redHeadDuck = new RedHeadDuck();
  }

  @Test
  public void shouldBeAbleToQuack() {
    assertThat(redHeadDuck.quack(), is("Quack! Quack!"));
  }

  @Test
  public void shouldBeAbleToSwim() {
    assertThat(redHeadDuck.swim(), is("I can swim!"));
  }

  @Test
  public void shouldDisplayRedHeadDuckLogo() {
    assertThat(redHeadDuck.display(), is("I'm RedHead Duck!"));
  }
}
