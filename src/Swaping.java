

import java.util.Scanner;

class Swaping {
    Swaping() {
    }

    public static void main(String[] arr) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter a no. A : ");
        int a = ob.nextInt();
        System.out.print("Enter a no. B : ");
        int b = ob.nextInt();
        System.out.println("Before swaping A = " + a + " , B = " + b);
        a -= b;
        b += a;
        a = b - a;
        System.out.println("After swaping A = " + a + " , B = " + b);
    }
}
