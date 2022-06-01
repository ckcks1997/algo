package algo6_sortNsearch;
import java.util.*;
//좌표정렬문제
//Comparable의 compareTo구현과 toString이 핵심
//compareTo가 음수를 리턴시 오름차순 정렬됨
class Point implements Comparable<Point>{
    public int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o){
        if(this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }

    @Override
    public String toString(){
        return this.x + " " +this.y;
    }
}
public class Main7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int total = sc.nextInt();
        ArrayList<Point> list = new ArrayList<>();
        for (int i = 0; i < total; i++) {
            list.add(new Point(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(list);
        for (Point point : list) {
            System.out.println(point);
        }
    }
}
