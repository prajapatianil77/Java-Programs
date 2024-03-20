import java.util.*;
public class Average2 {
    public static void main(String [] arr) {
        float sum=0;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter total no. your have to entered for average = ");
        int n = ob.nextInt();
        System.out.println("Enter your number = ");
        float [] num = new float[n];
        for(int i=0;i<n;i++){
            num[i] = ob.nextFloat();
        }
        for(int i=0;i<n;i++){
            sum = sum+num[i];
        }
        System.out.println("Average of given no. is = "+sum/n);
    }
}
