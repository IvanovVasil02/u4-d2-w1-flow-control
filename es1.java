import java.util.Scanner;

public class es1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci stringa: ");
        String stringa = input.nextLine();
        System.out.println(checkEqual(stringa));
    }

    public static boolean checkEqual(String stringa) {
        return stringa.length() % 2 == 0;
    }
}