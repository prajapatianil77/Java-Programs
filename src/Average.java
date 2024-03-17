import java.util.*;
class Average {
    // function
    public static void avgOfThreeNo(float a,int b,int c) {
        float avg = (a+b+c)/3;
        System.out.print("Average of given no. is = "+avg);

    }
    public static void main(String []arr){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter first no. = ");
        int a = ob.nextInt();
        System.out.print("Enter second no. = ");
        int b = ob.nextInt();
        System.out.print("Enter third no. = ");
        int c = ob.nextInt();

        // function call.
        avgOfThreeNo(a,b,c);
        }


    }

