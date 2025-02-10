import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        Arrays.sort(num_list);
        for(int i = 0; i < num_list.length; i++) {
            if(i < num_list[5]) {
                answer = Arrays.copyOf(num_list, 5);
            }
        }
        return answer;
    }
}