import java.util.Scanner;

public class check_number {

    public static void main(String [] args){
        int a=80;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check:");
        int number=sc.nextInt();
      if(a>number){
          System.out.println("Number is greater");
      }
      else{
        System.out.println("Number is less then enter number:");
      }
    }
    
}
