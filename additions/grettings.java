package additions;
import java.util.*;
public class grettings {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int button=sc.nextInt();
    if(button==1)
    {
        System.out.println("hello");
    }
        else if(button==2)
        {
       System.out.println("prudvi");
        }
        else if(button==3)
        {
            System.out.println("Yashwanth");
        }
        else
        {
            System.out.println("default2");
        }
        sc.close();
    

}
}