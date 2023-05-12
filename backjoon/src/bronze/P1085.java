package bronze;

import java.io.*;
import java.util.StringTokenizer;

/*
문제 번호 : P1055
문제 이름 : 직사각형에서 탈출
 */
public class P1085 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int x_distance = (w - x) > x? x : w-x;
        int y_distance = (h - y) > y? y : h-y;

        bw.write(Math.min(x_distance, y_distance)+"");
        bw.flush();
    }
}
