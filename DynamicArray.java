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

  public int size() {
    return size;
  }

  public void remove() {
    size--;
    printArray();
  }

  public void remove(int index) {
    for (int i = index; i < size - 1; i++) {
      paintersArray[i] = paintersArray[i + 1];
    }
    size--;
    printArray();
  }

  public Painter get(int index) {
    if (index >= 0 && index < size) {
      Painter retrievedPainter = paintersArray[index];
      System.out.println("Retrieved Painter: " + retrievedPainter);
      return retrievedPainter;
    } else {
      System.out.println("No object on that index. Returning null.");
      return null;
    }
  }

  public void set(int index, Painter painter) {
    paintersArray[index] = painter;
    printArray();
  }

  public void clear() {
    size = 0;
    printArray();
  }

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
    DynamicArray painterDynamicArray = new DynamicArray(7);

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
    Painter painter6 = new Painter("teest", 99, true, "gg, dk");

    painterDynamicArray.add(myPainter);
    painterDynamicArray.add(painter2);
    painterDynamicArray.add(painter3);
    painterDynamicArray.add(painter4);
    painterDynamicArray.add(painter5);
    painterDynamicArray.add(painter6);

    // painterDynamicArray.remove();
    // painterDynamicArray.clear();
    painterDynamicArray.remove(3);
    painterDynamicArray.get(1);
    // myPainter.printPainterInfo();

    Painter updatedPainter = new Painter(
      "Updated Artist",
      30,
      true,
      "Updated Location"
    );
    painterDynamicArray.set(4, updatedPainter);
  }
}
