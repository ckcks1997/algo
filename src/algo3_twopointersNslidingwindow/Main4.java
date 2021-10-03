package algo3_twopointersNslidingwindow;

//4.연속부분수열(3번 문제와 비슷)

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int target_value = scanner.nextInt();

        int []arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }

        int ptr1 = 0, ptr2 = 0, sum = 0, answer = 0;
        while(ptr2<size){
            if(target_value == sum){
                answer++;
                sum-=arr[ptr1];
                ptr1++;
            }
            else if(target_value>sum){
                sum+=arr[ptr2];
                ptr2++;
            }else {
                sum-=arr[ptr1];
                ptr1++;
            }
        }
        if(target_value == sum){
            answer++;
        }

        System.out.println(answer);

    }
}
