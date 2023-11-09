// 사용자 에게 국어, 영어, 수학 점수 값을 입력받아 수, 우, 미, 양 가로 평점을 구하는 프로그램을 작성하시오.
// try-catch를 이용해, 0~100 이외의 값이 입력되면 "잘못된 점수가 입력되었습니다." 라고 출력하고, 그 값을 다시 입력할 수 있도록 하시오.

import java.util.Scanner;

public class renshuu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kor, eng, math;
        double avg;
        String grade = "";
        
        try (scanner) {
            while (true) {
                try {
                    System.out.print("국어 점수를 입력하세요: ");
                    kor = scanner.nextInt();
                    if (kor < 0 || kor > 100) {
                        throw new Exception();
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("잘못된 점수가 입력되었습니다.");
                }
            }

            while (true) {
                try {
                    System.out.print("영어 점수를 입력하세요: ");
                    eng = scanner.nextInt();
                    if (eng < 0 || eng > 100) {
                        throw new Exception();
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("잘못된 점수가 입력되었습니다.");
                }
            }

            while (true) {
                try {
                    System.out.print("수학 점수를 입력하세요: ");
                    math = scanner.nextInt();
                    if (math < 0 || math > 100) {
                        throw new Exception();
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("잘못된 점수가 입력되었습니다.");
                }
            }

            avg = (kor + eng + math) / 3.0;

            if (avg >= 90) {
                grade = "수";
            } else if (avg >= 80) {
                grade = "우";
            } else if (avg >= 70) {
                grade = "미";
            } else if (avg >= 60) {
                grade = "양";
            } else {
                grade = "가";
            }

            System.out.println("평균은 " + avg + "이고, 평점은 " + grade + "입니다.");
        }

        while (true) {
            try {
                System.out.print("국어 점수를 입력하세요: ");
                kor = scanner.nextInt();
                if (kor < 0 || kor > 100) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("잘못된 점수가 입력되었습니다.");
            }
        }

        while (true) {
            try {
                System.out.print("영어 점수를 입력하세요: ");
                eng = scanner.nextInt();
                if (eng < 0 || eng > 100) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("잘못된 점수가 입력되었습니다.");
            }
        }

        while (true) {
            try {
                System.out.print("수학 점수를 입력하세요: ");
                math = scanner.nextInt();
                if (math < 0 || math > 100) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("잘못된 점수가 입력되었습니다.");
            }
        }

        avg = (kor + eng + math) / 3.0;

        if (avg >= 90) {
            grade = "수";
        } else if (avg >= 80) {
            grade = "우";
        } else if (avg >= 70) {
            grade = "미";
        } else if (avg >= 60) {
            grade = "양";
        } else {
            grade = "가";
        }

        System.out.println("평균은 " + avg + "이고, 평점은 " + grade + "입니다.");
    }
}