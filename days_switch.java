import java.util.Scanner;

public class days_switch {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter teh day");
        int day=sc.nextInt();
        switch(day){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("THursday");
            break;
            case 4:
            System.out.println("Friday");
            break;
            case 5:
            System.out.println("Saturday");
            break;
            case 6:
            System.out.println("Weedday");
            break;
            case 7:
            System.out.println("sunday");
            break;
            default :
            System.out.println("Invalid entry");
            break;
        }
    } 
    
}
