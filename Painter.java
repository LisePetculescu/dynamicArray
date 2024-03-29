public class Painter {

  private String name;
  private int age;
  private boolean isAlive;
  private String from;

  // constructor
  public Painter(String name, int age, boolean isAlive, String from) {
    this.name = name;
    this.age = age;
    this.isAlive = isAlive;
    this.from = from;
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

  public String GetFrom() {
    return from;
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

  public void setFrom(String from) {
    this.from = from;
  }

  // helper methods
  public void printPainterInfo() {
    System.out.println(toString());
  }

  // toString method
  public String toString() {
    return (
      "Painter:\n" +
      "  Name: " +
      name +
      "\n" +
      "  Age: " +
      age +
      "\n" +
      "  Is Alive: " +
      isAlive +
      "\n" +
      "  From: " +
      from +
      "\n"
    );
  }

  // main
  public static void main(String[] args) {
    Painter myPainter = new Painter(
      "Leonardo da Vinci",
      67,
      false,
      "Vinci, Italy"
    );
    // myPainter.printPainterInfo();
  }
}
