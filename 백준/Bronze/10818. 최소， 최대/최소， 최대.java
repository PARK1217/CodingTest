import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        if(strArr.length != n) {
            System.out.println("입력한 숫자의 개수와 입력한 숫자의 개수가 일치하지 않습니다.");
            return;
        }

        if(n >= 1 && n <= 1000000) {
            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;
            for(int i = 0; i < n; i++) {
                long num = Long.parseLong(strArr[i]);
                if(num >= -1000000 && num <= 1000000) {
                    if(num < min) {
                        min = num;
                    }
                    if(num > max) {
                        max = num;
                    }
                } else {
                    System.out.println("숫자는 -1000000 이상 1000000 이하의 정수여야 합니다.");
                    return;
                }
            }
            System.out.println(min + " " + max);
        } else {
            System.out.println("n은 1이상 1000000이하의 정수여야 합니다.");
        }
    }
}