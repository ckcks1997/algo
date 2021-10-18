package algo4_hashmapNtreeset;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//4.모든 아나그램 찾기
//설명
//S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요
//아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
//입력
//첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
//S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.

//출력
//S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.

//예시 입력 1
//bacaAacba
//abc
//예시 출력 1
//3

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String part = scanner.nextLine();
        //char배열로 변환
        char[] strChar = str.toCharArray();
        char[] partChar = part.toCharArray();

        //확인할 대상(고정)
        HashMap<Character, Integer> partMap = new HashMap<>();
        //비교대상(sliding window)
        HashMap<Character, Integer> validateMap = new HashMap<>();

        for(int i=0; i<partChar.length; i++){
            partMap.put(partChar[i], partMap.getOrDefault((partChar[i]),0)+1);
        }
        //sliding window적용
        int lt = 0;
        int ans = 0;
        //확인대상 문자열길이 -1만큼 비교대상에 추가
        for(int i=0; i<partChar.length-1; i++){
            validateMap.put(strChar[i], validateMap.getOrDefault((strChar[i]),0)+1);
        }
        //비교문자열을 한칸씩 나아가면서 비교(sliding window)
        for(int j=partChar.length-1; j<strChar.length; j++){
            validateMap.put(strChar[j], validateMap.getOrDefault((strChar[j]),0)+1);
            if(partMap.equals(validateMap)) ans++;

            validateMap.put(strChar[lt], validateMap.getOrDefault((strChar[lt]),0)-1);
            if(validateMap.get(strChar[lt]) <1) validateMap.remove(strChar[lt]);
            lt++;
        }

        System.out.println(ans);


    }
}
