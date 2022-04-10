import java.util.Scanner;

public class percentace_calculate {
    public static void main(String [] aStrings){
        //TAKING INPUT FROM USER
     Scanner marks=new  Scanner(System.in);
     System.out.println("Enter full marks:");
     float fullmarks=marks.nextFloat();
         System.out.println("Enter marks in first subject:");

     float sub1=marks.nextFloat();
     
     System.out.println("Enter marks in second subject:");
     float sub2=marks.nextFloat();
    
     System.out.println("Enter marks in third subject:");
     float sub3=marks.nextFloat();
    
     System.out.println("Enter marks in fourth subject:");
     float sub4=marks.nextFloat();
    
     System.out.println("Enter marks in fifth subject:");
     float sub5=marks.nextFloat();
     float total=sub1+sub2+sub3+sub4+sub5;
     
     double percentage=(total/fullmarks)*100;
     
     System.out.println("your percentage is: " );
     System.out.println(percentage);
    
    }
    
}
