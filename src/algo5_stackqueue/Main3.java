package algo5_stackqueue;

import java.util.Scanner;
import java.util.Stack;

//3. 크레인 인형뽑기(카카오)
//https://programmers.co.kr/learn/courses/30/lessons/64061
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size =scanner.nextInt();

        int[][] board = new int[size][size];
        System.out.println("len "+board.length);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        Stack<Integer> stack = new Stack<>();

        int answer = 0;
        int moves = scanner.nextInt();
        for(int i = 0; i<moves; i++) {
            int pick = scanner.nextInt();
            for(int j=0; j<size; j++){
               if(board[j][pick-1] !=0){
                   int tmp = board[j][pick-1];
                   board[j][pick-1] = 0;
                   if(!stack.isEmpty() && stack.peek() == tmp) {
                   answer+=2;
                   stack.pop();
                   }
                  else stack.push(tmp);
                  break;
               }
            }
        }

        System.out.println(answer);
    }
}

