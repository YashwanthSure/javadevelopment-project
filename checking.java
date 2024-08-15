import java.util.Scanner;
public class checking {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int yash=scanner.nextInt();
        if(yash % 2== 0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
        System.out.println("final outcome of number : "+yash);
        scanner.close();

    }
    
}
