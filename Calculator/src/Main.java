import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome, lets calculate!");

        System.out.println("Enter your first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter an operator:");
        char operator = sc.next().charAt(0);
        System.out.println("Enter your second number:");
        int num2 = sc.nextInt();

        int answer = 0;

        switch (operator) {
            case '+':
                answer = num1+num2;
                break;
            case '-':
                if(num1>num2) {
                    answer = num1-num2;
                } else {
                    answer = num2-num1;
                }
                break;
            case '*':
                answer = num1*num2;
                break;
            case '/':
                if(num1>num2) {
                    answer = num1/num2;
                } else {
                    answer = num2/num1;
                }
                break;
            default:
                System.out.println("Sorry but I have only 4 operators\n+-*/");
        }
        System.out.println("The answer is "+answer);
    }
}
