package additions;
import java.util.*;
public class anotherexample {
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a and b: 25");
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(a==b)
    {
        System.out.println("is equal");
    }
    else{
        if(a>b)
        {
            System.out.println("is garetest");
        }
        else
        {
            System.out.println("is smallest");
        }
        sc.close();
    }
    }
    
}
