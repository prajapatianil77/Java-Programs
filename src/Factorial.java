import java.util.*;
class Factorial{
    public static void main(String []arr){
        int i , fact=1;

        Scanner ob = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = ob.nextInt();
        if(a==0) {
            System.out.println("Factorial is = 1");
        }
        else if (a<0) {
            System.out.println("NO factorial of negitive no. ");
        }
        for(i=1;i<=a;i++) {
            fact = fact * i;

        }
        System.out.printf("Factorial of %d is = %d\n" ,a ,fact);


    }
}