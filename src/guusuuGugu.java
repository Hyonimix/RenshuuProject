// 구구단의 짝수 단만 출력
// i를 2로 나눠서 나머지가 0이 되면 짝수 단이다.

public class guusuuGugu {
    public static void main(String[] args) {
        for (i = 2; i <= 9; i++) {
            if (i % 2 == 0) {
                for (j = 1; j <= 9; j++) {
                    System.out.println(i + " * " + j + " = " + i * j);
                }
            }
        }
    }
}