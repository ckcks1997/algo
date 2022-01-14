package baekjoon;

import java.io.*;
import java.util.*;

public class S2_alignxy_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = Integer.parseInt(br.readLine());

        List<Xy> list = new ArrayList<>();

        for (int j = 0; j < i; j++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Xy(x,y));
        }
        Collections.sort(list);

        for (Xy xy : list) {
            bw.write(xy + "\n");
        }
        bw.flush();
        bw.close();
    }
}

class Xy implements Comparable<Xy>{
    int x; int y;

    public Xy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Xy o) {
        if(this.x> o.x) return 1;
        else if(this.x<o.x) return -1;
        else if(this.y< o.y) return -1;
        else if(this.y> o.y) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}