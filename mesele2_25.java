import java.util.Scanner;


public class mesele2_25 {
     public static void main(String[] args) {
     
        Scanner input=new Scanner(System.in);
        int number;
       
        //accept input from user
        System.out.println("Enter a number:");
        number=input.nextInt();
       
        if(number(number)){
        System.out.println(number + " is even");
       
        }
        else{
            System.out.println(number + " is odd");
        }
     }
     public static boolean number(int num){
     if((num%2)==0)
         return true;
     else
         return false;
     }
   
   
}