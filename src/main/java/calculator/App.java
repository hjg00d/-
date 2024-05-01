package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] resultList = new int[10];
        int b = 0;
        // 배열을 1~10까지
        while (true) { // 무한 루프
            System.out.print("First number: ");
            int num1 = sc.nextInt();
            System.out.print("Second number: ");
            int num2 = sc.nextInt();
            System.out.println("Please enter a symbol.(+, -, *, /): ");
            char operator = sc.next().charAt(0);

            int answer = 0;
// 사칙연산 지정
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
                        System.out.println("0으로 나눌 수 없습니다");
                        return;
                    }
                    break;
                default:
                    System.out.println("올바른 연산자를 입력하세요");
                    return;

            }
            System.out.println("result: = " + answer);


//            int[] answers = new int[10];
//            // 배열을 1~10까지
//            for (int i = 0; i < 10; i++) {
//                answers [i] = i + 1;
//            }

            System.out.println("Input value:");
            for (int i = 0; i < 10; i++) {
                System.out.println(answers[i]);
            }

            // exit를 사용해서 종료할지 안 할지 정함
            System.out.println("If you type in anything, you'll continue? (Exit when you enter exit)");
            String input = sc.next();
            if (input.equals("exit")) {
                break; // 루프 탈출
            }
        }
        sc.close(); // Scanner 닫기
    }
}
