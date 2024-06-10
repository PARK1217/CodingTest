class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int my_string_length = my_string.length();
        int is_suffix_length = is_suffix.length();
        
            if (is_suffix_length > my_string_length) {
                return 0;
            }
            if (my_string.substring(my_string_length - is_suffix_length).equals(is_suffix)) {
                return 1;
            }
        
        return answer;

    }
}