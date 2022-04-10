import java.util.Scanner;

public class checkuserinput {

    public static void main(String [] args)
{
  System.out.println("calculating root:");

  Scanner sc=new Scanner(System.in);
  System.out.println("Enter value of a");
  float a=sc.nextFloat();
  System.out.println("Enter value of b");
  float b=sc.nextFloat();

  System.out.println("Enter value of c");
  float c=sc.nextFloat();
  double root= (b*b-4*a*c)/2*a;
  // root= (b*b-4*a*c)/2*a; is different  with  root= b*b-(4*a*c)/(2*a);

  System.out.println(root);




   

}    
}
