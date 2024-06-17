class Solution {
    public int solution(int[] arr) {
        int x = 0;

        while (true) {  //무한루프 돌리기
            // 결과를 저장할 배열을 생성
            int[] temp = new int[arr.length];
            // arr의 각 원소에 대해 반복
            for (int i = 0; i < arr.length; i++) {
                // arr의 각 원소가 50보다 크거나 같은 짝수라면
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    // 2로 나눈 값을 result에 저장
                    temp[i] = arr[i] / 2;
                }
                // arr의 각 원소가 50보다 작은 홀수라면
                else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    // 2를 곱하고 1을 더한 값을 result에 저장
                    temp[i] = arr[i] * 2 + 1;
                }
                // 그 외의 경우
                else {
                    // arr의 각 원소를 result에 저장
                    temp[i] = arr[i];
                }
            }
            // arr와 temp가 같은지 확인
            boolean isSame = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != temp[i]) {
                    isSame = false;
                    break;
                }
            }
            // 같다면 x를 반환
            if (isSame) {
                break;
            }
            // 같지 않다면 arr에 temp를 저장하고 x를 증가
            arr = temp;
            x++;
        }
        return x;
    }

    //arr : 1,2,3,100,99,98
    //x = 0 : temp = 3,2,7,55,99,49
    //x = 1 : temp = 7,2,15,25,99,99
    //x = 2 : temp = 15,2,31,51,99,99
    //x = 3 : temp = 31,2,63,51,99,99
    //x = 4 : temp = 63,2,63,51,99,99
    //x = 5 : temp = 63,2,63,51,99,99
    //5에서 break
}