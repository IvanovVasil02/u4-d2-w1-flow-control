import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci un numero: ");
        int number = input.nextInt();
        getSrtingNumber(number);
    }

    public static void getSrtingNumber(int number) {
        switch (number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;

            default:
                System.out.println("il numero deve essere compreso tra 0 e 3");
                break;
        }
    }
}
