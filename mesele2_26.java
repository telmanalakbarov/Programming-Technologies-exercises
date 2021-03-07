import java.util.Scanner;


public class mesele2_26 {
     public static void main(String[] args) {
     
        Scanner input=new Scanner(System.in);
        int firstNum=0;
        int secondNum=0;
       
        //accept inputs from users
        System.out.println("Enter first number:");
        firstNum=input.nextInt();
       
        System.out.println("Enter second number:");
        secondNum=input.nextInt();
       
        if(number(firstNum, secondNum)){
        System.out.println(firstNum + " is a multiple of " + secondNum);
        }
        else{
        System.out.println(firstNum + " is  not a multiple of " + secondNum);
        }
       
     }
     public static boolean number(int num1, int num2){
     if((num1%num2)==0)
         return true;
                 else
         return false;
       
     }
   
}