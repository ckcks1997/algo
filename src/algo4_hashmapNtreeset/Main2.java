package algo4_hashmapNtreeset;


import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

//2. 아나그램(두 물자열의 char갯수 일치여부 확인 문제)
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char c1 : str1.toCharArray()) map1.put(c1, map1.getOrDefault(c1, 0) +1);
        for(char c2 : str2.toCharArray()) map2.put(c2, map2.getOrDefault(c2, 0) +1);

        Set<Character> characters = map1.keySet();

        for (Character character : characters) {
            if(map1.get(character) != map2.get(character)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

    }
}
