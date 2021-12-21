package algo5_stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//7.교육과정 설계

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        Queue<Character> q = new LinkedList<>();


        for (Character character : a.toCharArray()) {
            q.offer(character);
        }

        for (int i = 0; i < b.length(); i++) {
            if(q.size() == 0) break;
            if(b.charAt(i) == q.peek()) q.poll();
        }
        if(q.isEmpty()) System.out.println("YES");
        else System.out.println("NO");

    }
}
