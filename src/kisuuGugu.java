// 구구단의 홀수 단만 출력
// i를 2로 나누었을 떄 나머지가 1이 되는 경우 홀수 단이다.

public class kisuuGugu {
    public static void main(String[] args) {
        int i;
        int j;
        for (i = 2; i <= 9; i++) {
            if (i % 2 == 1) {
                for (j = 1; j <= 9; j++) {
                    System.out.println(i + " * " + j + " = " + i * j);
                }
            }
        }
    }
}