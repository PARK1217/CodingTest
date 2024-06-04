import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if(!(input.length() <= 20)) {
            System.out.println("글자는 20자 이내로 입력해주세요");
            return;
        }
        StringBuilder output = new StringBuilder();

        for(int i = 0; i < input.length(); i ++) {
            char temp = input.charAt(i);
            if(temp >= 'A' && temp <= 'Z') {
                output.append(Character.toLowerCase(temp));

            }
            else if(temp >= 'a' && temp <= 'z') {
                output.append(Character.toUpperCase(temp));
            } else {
                output.append(temp);
            }
        }
        System.out.println(output);

    }
}