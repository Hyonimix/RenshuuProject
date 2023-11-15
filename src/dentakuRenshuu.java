// 사용자에게 두 수와 연산자를 입력받받아 결과값을 출력하는 계산기 프로그램을 작성하시오.

import java.util.Scanner;

public class dentakuRenshuu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두번째 수를 입력하세요: ");
        int num2 = scanner.nextInt();

        System.out.print("연산자를 입력하세요: ");
        String operator = scanner.next();

        int result = 0;

        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            result = num1 / num2;
        } else {
            System.out.println("연산자를 잘못 입력하셨습니다.");
        }

        System.out.println("결과값은 " + result + "입니다.");

        scanner.close();
    }
}

