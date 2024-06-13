class Solution {
    public String[] solution(String[] names) {
        int length = names.length / 5;
        if(names.length % 5 != 0) {
            length++;
        }

        // 5명씩 나누어 저장할 배열을 생성
        String[] result = new String[length];

        // 5명씩 나누어 저장
        for(int i = 0; i < length; i++) {
            String[] temp = new String[5];
            for(int j = 0; j < 5; j++) {
                int index = i * 5 + j;
                if(index < names.length) {
                    temp[j] = names[index];
                } else {
                    temp[j] = "";
                }
            }
            result[i] = String.join(" ", temp);
        }

        // 배열의 앞 사람만 이름을 출력
        for(int i = 0; i < result.length; i++) {
            String[] temp = result[i].split(" ");
            result[i] = temp[0];
        }
        return result;
    }
}