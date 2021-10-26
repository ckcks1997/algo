package algo6_sortNsearch;
import java.util.Scanner;

// 4. 카카오 캐시 변형 - LRU문제
// 출처: https://jacobko.info/algorithm_advance/Algorithm_advance_37/

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cacheSize = scanner.nextInt();
        int inputSize = scanner.nextInt();

        int[] cache = new int[cacheSize];
        //값을 하나씩 받으며 캐시에 그 값이 있는지 비교
        for (int i=0; i<inputSize; i++){
            int in = scanner.nextInt();
            int point =  -1;
            for(int j = 0; j<cacheSize; j++){
                if(cache[j] == in) point = j;
            }
            //만약 캐시에 없으면 전부 한칸씩 뒤로 가야함
            if(point == -1) point = cacheSize - 1;
            for (int k = point; k > 0; k--) {
                cache[k] = cache[k - 1];
            }
            cache[0] = in;
        }

        for (int i : cache) {
            System.out.print(i+" ");
        }
    }
}
