import java.util.Scanner;

public class es3 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("inserisci Stringa");
    String myString = input.nextLine();

    while (myString != ":q") {
      splitString(myString);
    }
  }

  public static String[] splitString(String myString) {

    return myString.split("");
  }
}
