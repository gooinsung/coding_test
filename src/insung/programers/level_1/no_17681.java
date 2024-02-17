package insung.programers.level_1;


public class no_17681 {

  static class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
      String[] answer = new String[n];
      String[] strArr1 = new String[n];
      String[] strArr2 = new String[n];

      // 배열 2진수로 초기화 세팅
      for(int i = 0; i < n; i++){
        strArr1[i] = radix(arr1[i],n);
        strArr2[i] = radix(arr2[i],n);
      }

      for(int i = 0; i < n; i++){
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < n; j++){
          if(strArr1[i].charAt(j) == '0' && strArr2[i].charAt(j) == '0'){
            sb.append(" ");
          }else if(strArr1[i].charAt(j) == '1' || strArr2[i].charAt(j) == '1'){
            sb.append("#");
          }
        }
        answer[i] = sb.toString();
      }


      return answer;
    }

    String radix(int n, int length){

      if(n == 0) return "0";


      StringBuilder sb = new StringBuilder();
      while (n>0){
        sb.insert(0,n%2);
        n/=2;
      }

      StringBuilder str = new StringBuilder(sb.toString());

      if(length - str.length() != 0){
        int a =length - str.length();
        for(int i = 0; i < a; i++)
          str.insert(0, "0");
      }

      return str.toString();
    }
  }
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] arr1 = {9, 20, 28, 18, 11};
    int[] arr2 = {30, 1, 21, 17, 28};
    int n = 5;

    for(String str : s.solution(n,arr1,arr2)){
      System.out.println(str);
    }


  }




}
