package programmers;
import java.util.ArrayList;

//17분
// https://programmers.co.kr/learn/courses/30/lessons/42586?language=java

public class S2_stack_42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        int point = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        while (true) { //돌아가면서 speed의 값을 한번씩 더함
            if (point == progresses.length) break;
            for (int i = point; i < progresses.length; i++) {
                progresses[i] += speeds[i];
            }
            int cnt = 0;
            while (true) { // 맨 앞 값이 100을 넘으면 쭉 pull해서 count값을 올림
                if (point < progresses.length && progresses[point] >= 100) {
                    cnt++;
                    point++;
                } else break;
            }
            if (cnt != 0) answer.add(cnt);//값 저장
        }
        return answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    public static void main(String[] args) {
        S2_stack_42586 T = new S2_stack_42586();
        int[] a = {93, 30, 55};
        int[] b = {1, 30, 5};
        System.out.println(T.solution(a, b));
    }
}
