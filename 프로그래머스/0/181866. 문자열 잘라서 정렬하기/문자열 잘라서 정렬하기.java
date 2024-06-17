import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myString) {
        String[] result = myString.split("x");
        ArrayList<String> resultList = new ArrayList<>();
        //공백제거
        for(String str : result) {
            if(!str.isEmpty()) {
                resultList.add(str);
            }
        }
        
        String[] resultArray = resultList.toArray(new String[resultList.size()]);
        Arrays.sort(resultArray);
        
        return resultArray;
    }
}
    //     if("".equals(result[0])) {
    //         result = Arrays.copyOfRange(result, 1, result.length);
    //     }
    //     for (int i = 0; i < result.length; i++) {
    //         char[] temp = result[i].toCharArray();
    //         result[i] = new String(temp);
    //     }
    //         // 문자열을 정렬
    //     Arrays.sort(result);
    //     return result;
    // }
