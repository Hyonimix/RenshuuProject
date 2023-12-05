// 11과 7의 최소공배수를 구하는 프로그램을 작성하시오.

public class saishoukoubaisuu {
    public static void main(String[] args) {
        int a = 11;
        int b = 7;
        int i = 1; // 최소공배수 출력을 위한 변수
        while (true) {
            if (i % a == 0 && i % b == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}