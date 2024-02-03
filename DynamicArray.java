public class DynamicArray {

  private Painter[] paintersArray;
  private int size;

  public DynamicArray(int arraySize) {
    paintersArray = new Painter[arraySize];
    size = 0;
  }

  public void add(Painter painter) {
    paintersArray[size] = painter;
    size++;
    printArray();
  }

  // public int get(index) {}

  public int size() {
    return size;
  }

  // public void remove() {}

  // public void remove(index) {}

  // public void set(index, object) {}

  // public void clear() {}

  public void printArray() {
    System.out.println("PainterArray:");
    for (int i = 0; i < size; i++) {
      if (paintersArray[i] != null) {
        System.out.println(i + ": " + paintersArray[i].toString());
      } else {
        System.out.println(i + ": null");
      }
    }
    System.out.println();
  }

  public static void main(String[] args) {
    DynamicArray painterDynamicArray = new DynamicArray(5);

    Painter myPainter = new Painter(
      "Leonardo da Vinci",
      67,
      false,
      "Vinci, Italy"
    );
    Painter painter2 = new Painter(
      "Vincent van Gogh",
      37,
      false,
      "Zundert, Netherlands"
    );
    Painter painter3 = new Painter("Pablo Picasso", 91, false, "Málaga, Spain");
    Painter painter4 = new Painter("Claude Monet", 86, false, "Paris, France");
    Painter painter5 = new Painter(
      "Georgia O'Keeffe",
      98,
      false,
      "Sun Prairie, Wisconsin, U.S."
    );

    painterDynamicArray.add(myPainter);
    painterDynamicArray.add(painter2);
    painterDynamicArray.add(painter3);
    painterDynamicArray.add(painter4);
    painterDynamicArray.add(painter5);
    // myPainter.printPainterInfo();
  }
}
