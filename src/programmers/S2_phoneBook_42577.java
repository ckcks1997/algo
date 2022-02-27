package programmers;
import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/42577
public class S2_phoneBook_42577 {

    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"}; //<- input
        Arrays.sort(phone_book); //<- int가 아닌 String을 sort하는 것이다.
        boolean ans = true;
        System.out.println(Arrays.toString(phone_book));
        for (int i =1; i < phone_book.length ; i++) {
            if (phone_book[i].startsWith(phone_book[i-1])) { //<- 전체를 돌아가며 비교할 필요없이
                ans = false;                                // 바로 다음배열에 접두사가 포함되어있는지만 확인하면 됨
                break;
            }
        }
        System.out.println(ans);
    }

}
