package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] resultList = new int[10];
        int b = 0;
        // �迭�� 1~10����
        while (true) { // ���� ����
            System.out.print("First number: ");
            int num1 = sc.nextInt();
            System.out.print("Second number: ");
            int num2 = sc.nextInt();
            System.out.println("Please enter a symbol.(+, -, *, /): ");
            char operator = sc.next().charAt(0);

            int answer = 0;
// ��Ģ���� ����
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
                        System.out.println("0���� ���� �� �����ϴ�");
                        return;
                    }
                    break;
                default:
                    System.out.println("�ùٸ� �����ڸ� �Է��ϼ���");
                    return;

            }
            System.out.println("result: = " + answer);


//            int[] answers = new int[10];
//            // �迭�� 1~10����
//            for (int i = 0; i < 10; i++) {
//                answers [i] = i + 1;
//            }

            System.out.println("Input value:");
            for (int i = 0; i < 10; i++) {
                System.out.println(answers[i]);
            }

            // exit�� ����ؼ� �������� �� ���� ����
            System.out.println("If you type in anything, you'll continue? (Exit when you enter exit)");
            String input = sc.next();
            if (input.equals("exit")) {
                break; // ���� Ż��
            }
        }
        sc.close(); // Scanner �ݱ�
    }
}
