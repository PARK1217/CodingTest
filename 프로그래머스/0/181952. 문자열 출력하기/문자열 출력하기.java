import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != ' ')
                result += a.charAt(i);
        }
        System.out.println(result);
    }
}