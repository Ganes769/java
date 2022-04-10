import java.util.Scanner;

public class findi_gpa {


    public static  void main (String[] args){
        System.out.println("Finding GPA of  three subjct :");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first subject number:");
        float subjct1=sc.nextFloat();
        System.out.println("Enter second subject number:");
        float subjct2=sc.nextFloat();
        System.out.println("Enter third subject number:");
        float subjct3=sc.nextFloat();
        float cgpa=(subjct1+subjct2+subjct3)/30;
        System.out.print("Your Gpa is:");
        System.out.println(cgpa);
        
    }
    
}
