import java.util.*;
 class Voting {
     public static void main(String []arr){
         Scanner ob = new Scanner(System.in);
         System.out.print("Enter your age = ");
         int age = ob.nextInt();
         if(age<=0)
             System.out.println("Invalid age! ");
         else if (age<18)
             System.out.println("You can't vote!");
         else
             System.out.println("You can vote!");
     }
     }

