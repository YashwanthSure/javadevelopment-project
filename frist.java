import java.util.Scanner;

public class frist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read 3 integers from stdin
        for (int i = 0; i < 3; i++) {
            int num = scanner.nextInt();
            System.out.println(num);
        }
        
        scanner.close();
    }
}
