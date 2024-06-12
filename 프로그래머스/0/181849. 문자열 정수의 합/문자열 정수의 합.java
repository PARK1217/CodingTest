class Solution {
        public int solution(String num_str) {

        int answer = 0;
        // 문자열을 각각의 숫자로 나누어 배열에 저장
        String[] num_str_arr = num_str.split("");
        // 배열의 길이만큼 반복
        for (int i = 0; i < num_str_arr.length; i++) {
            // 배열의 각 요소를 정수로 변환하여 answer에 더함
            answer += Integer.parseInt(num_str_arr[i]);
        }
        return answer;
    }
}