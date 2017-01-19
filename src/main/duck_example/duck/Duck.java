package duck_example.duck;

public abstract class Duck {

  public String quack() {
    return "Quack! Quack!";
  }

  public String swim() {
    return "I can swim!";
  }

  public String fly(){
    return "I can Fly!";
  }

  public abstract String display();

}
