import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        br.close();
        int i;

        StringBuilder output = new StringBuilder();
        if(input.length() > 1000000) {
            System.out.println("단어길이는 1,000,000자를 넘을수 없습니다");
        } else {
            // String input을 for문을 돌려서 대문자 소문자 구분없이 각 문자의 갯수를 세어준다
            for(i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if(ch >= 'A' && ch <= 'Z') {
                    output.append(Character.toLowerCase(ch));
                } else {
                    output.append(ch);
                }
            }

            // 각각의 문자의 갯수를 세어준다
            int[] count = new int[26];
            Map<Character, Integer> alphabetCount = new HashMap<>();
            for(i = 0; i < output.length(); i++) {
                char ch = output.charAt(i);
                if(ch >= 'a' && ch <= 'z') {
                    count[ch - 'a']++;

                    if(alphabetCount.containsKey(ch)) {
                        alphabetCount.put(ch, alphabetCount.get(ch) + 1);
                    } else {
                        alphabetCount.put(ch, 1);
                    }
                }

            }
            // 문자 갯수가 많은 문자를 출력한다
            int max = 0;
            char result = '?';
            for(i = 0; i < 26; i++) {
                if(count[i] > max) {
                    max = count[i];
                    result = (char)(i + 'A');
                } else if(count[i] == max) {
                    result = '?';
                }
            }

            System.out.println(result);
        }
    }
}