// case문을 이용하여, 12,1,2,3이면 겨울, 4,5,6이면 봄, 7,8이면 여름, 9,10,11이면 가을을 출력하시오.
// scanner을 이용하여 사용자에게 변수 값을 입력받으시오.

import java.util.Scanner;

public class caseSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();
        if (month >= 1 && month <= 12) {
            switch (month) {
                case 12, 1, 2, 3:
                    System.out.println("겨울");
                    break;
                case 4, 5, 6:
                    System.out.println("봄");
                    break;
                case 7, 8:
                    System.out.println("여름");
                    break;
                case 9, 10, 11:
                    System.out.println("가을");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }
        } else {
            System.out.println("1에서 12 사이의 값을 입력하세요.");
        }
        scanner.close();
    }
}
