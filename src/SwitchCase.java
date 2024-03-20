
import java.util.Scanner;
class Switchcase {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Press any given number (1,2,3) = ");
        int button = ob.nextInt();
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Ram Ram");
                break;
            case 3:
                System.out.println("Namaste");
                break;
            default:
                System.out.println("Invalid number bye bye");
        }

    }
}

