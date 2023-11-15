public class guusuuGugu2 {
    public static void main(String[] args) {
        int i;
        int j;
        for (i = 2; i <= 9; i++) {
            if (i % 2 == 0) {
                for (j = 2; j <= 9; j++) {
                    System.out.println(i + " * " + j + " = " + i * j);
                }
            }
        }
    }
}