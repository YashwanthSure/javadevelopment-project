package additions;
import java.util.*;
public class switchrelated {
   public static void main(String args[])
   {
    try (Scanner yash = new Scanner(System.in)) {
        System.out.println("enter the month");
        int month=yash.nextInt();
        switch (month) {
            case 1:
                System.out.println("jan");
                break;
                case 2:
                System.out.println("feb");
                break;
                case 3:
                System.out.println("mar");
                break;
                case 4:
                System.out.println("aprl");
                break;
                case 5:
                System.out.println("may");
                break;
                case 6:
                System.out.println("june");
                break;
                case 7:
                System.out.println("july");
                break;
                case 8:
                System.out.println("aguest");
                break;
                case 9:
                System.out.println("sep");
                break;
                case 10:
                System.out.println("oct");
                break;
                case 11:
                System.out.println("nov");
                break;
                case 12:
                System.out.println("dec");
                break;
            default:
                break;
        }
    }

   } 
}
