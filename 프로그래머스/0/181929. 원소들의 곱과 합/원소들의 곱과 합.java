class Solution {
    public int solution(int[] num_list) {
        int result = 0;
        for (int i = 0; i < num_list.length; i++) {
            int sum = 0;
            int mul = 1;
            for (int j = 0; j < num_list.length; j++) {
                    sum += num_list[j];
                    mul *= num_list[j];
                
            }
            sum = sum * sum;
            if (sum > mul) {
                result = 1;
                break;
            } else if (sum < mul) {
                result = 0;
                break;
            }
        }
        System.out.println(result);
        return result;
    }
}