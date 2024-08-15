import java.util.Scanner;
public class second {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the age");
        int age=scanner.nextInt();
        System.out.println("enter the name");
        String name=scanner.next();
        System.out.println("age :"+age);
        System.out.println("name :"+name);
        scanner.close();

    }
    
}
