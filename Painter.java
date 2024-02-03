public class Painter {

  private String name;
  private int age;
  private boolean isAlive;
  private String fromCountry;

  // constructor
  public Painter(String name, int age, boolean isAlive, String fromCountry) {
    this.name = name;
    this.age = age;
    this.isAlive = isAlive;
    this.fromCountry = fromCountry;
  }

  // getters
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public boolean isAlive() {
    return isAlive;
  }

  public String GetFromCountry() {
    return fromCountry;
  }

  // setters
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setIsAlive(boolean isAlive) {
    this.isAlive = isAlive;
  }

  public void setFromCountry(String fromCountry) {
    this.fromCountry = fromCountry;
  }
}
