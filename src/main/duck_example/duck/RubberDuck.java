package duck_example.duck;

public class RubberDuck extends Duck{
  public String display() {
    return "I'm Rubber Duck!";
  }

  @Override
  public String quack() {
    return "Squeak!";
  }
}
