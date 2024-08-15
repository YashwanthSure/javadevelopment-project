import java.util.Scanner;
public class calculator {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int num1,num2,result;
        char operator;
        System.out.println("Enter the frist number");
        num1=scanner.nextInt();
        System.out.println("enter the operator '+','-','*',");
        operator=scanner.next().charAt(0);
        System.out.println("Enter the second number");
         num2=scanner.nextInt();
        if(operator=='+'){
            result=num1+num2;
            }
            else if(operator=='-'){
            result=num1-num2;
            }
            else if(operator=='*'){
            result=num1*num2;
            }
            else{
                System.out.println("Error:Invalid operator");
                return;
            }
            System.out.println(result);
            scanner.close();
        }
       
    }
