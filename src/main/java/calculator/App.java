package calculator;

import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
 // �屼�� ��� ������
        System.out.print("First number: ");
        int num1 = sc.nextInt();
        System.out.print("Second number: ");
        int num2 = sc.nextInt();

        System.out.println("the four fundamental arithmetic operations: "); //��Ģ���� �Է�, +, -, *, /
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
                    System.out.println("0�� �Էµ� �� �����ϴ�");
                    return;
                }
                break; // break;�� ���� ������ ������ �ȵȴ�...
            default:
                System.out.println("�����ڸ� �Է��ϼ���");
                return;
        }
        System.out.println("result: = " + answer);
    }
}