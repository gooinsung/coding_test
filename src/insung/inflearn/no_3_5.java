package insung.inflearn;

import java.util.Scanner;

public class no_3_5 {
  public int solution(int n){
    int answer = 0, cnt = 1;
    n--;
    while(n>0){
      cnt++;
      n=n-cnt;
      if(n%cnt == 0) answer++;
    }

    return answer;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n  = sc.nextInt();

    no_3_5 T = new no_3_5();

    System.out.println(T.solution(n));

  }

}
