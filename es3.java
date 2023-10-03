import java.util.Scanner;

public class es3 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string to split it: ");
    String myString = input.nextLine();

    int i = 0;
    int stringSize = splitString(myString).length;

    while (i < stringSize) {
      if (myString.equals(":q")) {
        break;
      }
      System.out.println(splitString(myString)[i] + ",");
      i++;


    }
  }

  public static String[] splitString(String myString) {
    return myString.split("");
  }
}
