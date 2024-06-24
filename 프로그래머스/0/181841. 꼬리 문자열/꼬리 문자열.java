import java.util.Arrays;

public class Solution {
    public static String solution(String[] str_list, String ex) {
        // ex를 포함하지 않는 문자열들을 필터링하여 리스트로 만듦
        String result = String.join("", Arrays.stream(str_list)
                .filter(str -> !str.contains(ex))
                .toArray(String[]::new));

        return result;
    }
}