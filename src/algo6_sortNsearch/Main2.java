package algo6_sortNsearch;


import java.util.Scanner;

//2.버블정렬
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i=a-1; i>0; i--)
        for(int j=0; j<i; j++){
            if(arr[j] > arr[j+1]){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
