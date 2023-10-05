package _20231005;

public class prac04_11 {

    public static void main(String[] args) {
        // Fibonnaci 1, 1 . 수열의 시작의 첫 두 숫자를 로 한다
        int num1 = 1;
        int num2 = 1;
        int num3 = 0; // 세번째 값
        System.out.print(num1 + " , " + num2);
        for (int i = 0; i < 8; i++) {
            num3 = num1 + num2;
            System.out.printf("%d ,", num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
