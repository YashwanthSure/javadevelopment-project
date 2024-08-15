import java.util.Scanner;
public class addition {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=scanner.nextInt();
        System.out.println("Enter the number");
        int b=scanner.nextInt();
        int sum=a+b;
        System.out.println("addition of two numbers is "+sum);
        scanner.close();

    }
}
