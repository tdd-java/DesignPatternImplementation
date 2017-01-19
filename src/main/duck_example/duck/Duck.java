package duck_example.duck;

import duck_example.duck.flyable.FlyBehavior;

public abstract class Duck {
  FlyBehavior flyBehavior;

  public String quack() {
    return "Quack! Quack!";
  }

  public String swim() {
    return "I can swim!";
  }

  public String fly() {
    return flyBehavior.fly();
  }

  public abstract String display();

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

}
