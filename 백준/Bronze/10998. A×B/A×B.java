import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A < 0 || B < 0 || A > 10 || B > 10) {
            throw new IllegalArgumentException("A와 B는 0보다 크거나 같고 10보다 작거나 같은 정수여야 합니다.");
        }
        System.out.println(A * B);
    }
}