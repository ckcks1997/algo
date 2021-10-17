package algo6_sortNsearch;


import java.util.Scanner;

//3. 삽입정렬
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i=1; i<a; i++){
            int pointVal = arr[i];
            int place = i;
            for(int j=i-1; j>=0; j--){
                if(arr[j] > pointVal){
                    arr[j+1] = arr[j];
                    place--;
                }
            }
            arr[place] = pointVal;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
