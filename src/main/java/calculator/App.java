package calculator;

import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
 // 헌굴이 계속 깨진다
        System.out.print("First number: ");
        int num1 = sc.nextInt();
        System.out.print("Second number: ");
        int num2 = sc.nextInt();

        System.out.println("the four fundamental arithmetic operations: "); //사칙연산 입력, +, -, *, /
        char operator = sc.next().charAt(0);

        int answer = 0;

        switch(operator) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                if(num2 != 0) {
                answer = num1 / num2;
                } else {
                    System.out.println("0이 입력될 수 없습니다");
                    return;
                }
                break; // break;를 쓰지 않으면 실행이 안된다...
            default:
                System.out.println("연산자를 입력하세요");
                return;
        }
        System.out.println("result: = " + answer);
    }
}