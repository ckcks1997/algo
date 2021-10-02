package algo3_twopointersNslidingwindow;


import java.util.ArrayList;
import java.util.Scanner;

//1.두 배열 오름차순으로 합치기(two pointer)
//단순히 합쳐서 출력하는게 아닌 투-포인터를 이용해 O(n)의 시간복잡도를 구현하는 것
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[]arr1 = new int[a];
        for(int i=0; i<a; i++){
            arr1[i] = scanner.nextInt();
        }

        int b = scanner.nextInt();
        int[]arr2 = new int[b];
        for(int i=0; i<b; i++){
            arr2[i] = scanner.nextInt();
        }

        int p1 = 0, p2 = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        while(p1<a && p2<b){
            if(arr1[p1]<arr2[p2]){
                answer.add(arr1[p1++]);
            }else{
                answer.add(arr2[p2++]);
            }
        }
        while(p1<a){
            answer.add(arr1[p1++]);
        }
        while(p2<b){
            answer.add(arr2[p2++]);
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }

    }
}
