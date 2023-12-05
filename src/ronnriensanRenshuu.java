// AND, OR, NOT 연산자의 사용 예제 프로그램을 작성하시오.

public class ronnriensanRenshuu {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("a < b && b < c = " + (a < b && b < c));
        System.out.println("a < b && b > c = " + (a < b && b > c));
        System.out.println("a < b || b > c = " + (a < b || b > c));
        System.out.println("a > b || b > c = " + (a > b || b > c));
        System.out.println("!(a > b) = " + !(a > b));
        System.out.println("!(a < b) = " + !(a < b));
    }
}