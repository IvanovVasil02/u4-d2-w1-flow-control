import java.util.Scanner;

public class es4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter start number: ");
    int start = input.nextInt();
    counter(start);
  }

  public static void counter(int start) {
    for (int i = start; i > 0; i--) {
      System.out.println(i);
    }
  }
}
