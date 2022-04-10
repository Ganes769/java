import java.util.Scanner;

public class pass_or_fail {

    public static void main(String[] args){
        //taking the marks of the student

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks in first subject:");
        float first=sc.nextInt();
        System.out.println("Enter the marks in second subject:");
        float second=sc.nextFloat();
        System.out.println("Enter the marks in third subject:");
        float third=sc.nextInt();
        System.out.println("Enter the marks in fourth subject:");
        float fourth=sc.nextInt();
        System.out.println("Enter the marks in fifth subject:");
        float fifth=sc.nextInt();
        float total=first+second+third+fifth+fourth;
        System.out.println(total);
        float percentage=(total/500)*100;
        System.out.println(percentage);
       
    //checking the pass and fail of the student
        if(percentage>=60 && percentage<100){
            System.out.println("Congrats you pass in  distinction:");
        }
        else if(percentage>=80){
            System.out.println("Congrats you have got the distinction:");
        }
        else if(percentage<33 && percentage>0){
            System.out.println("oops better luck next time");
        }
       else if(percentage>=33 && percentage<60){
           System.out.println("Second division:");
       }
       else{
           System.out.println("PLease attend the class");
       }



        


    }
    
}
