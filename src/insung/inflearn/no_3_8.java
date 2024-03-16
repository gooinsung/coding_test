package insung.inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Person{
  int id;
  int priority;
  public Person(int id, int priority){
    this.id = id;
    this.priority = priority;
  }
}

public class no_3_8 {
    public int solution(int n, int m, int[] arr){
      int answer = 0;

      Queue<Person> Q = new LinkedList<>();

      for(int i = 0; i < n ; i++)
        Q.offer(new Person(i,arr[i]));

      while(!Q.isEmpty()){
        Person person = Q.poll();
        for(Person x : Q){
          if(x.priority > person.priority){
            Q.offer(person);
            person = null;
            break;
          }

          if(person != null){
            answer++;
            if(person.id == m) return answer;
          }
        }
      }

      return answer;
    }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int []arr = new int[n];
    for(int i = 0 ; i < n ; i++){
      arr[i] = sc.nextInt();
    }

    no_3_8 T = new no_3_8();
    System.out.println(T.solution(n,m,arr));

  }

}
