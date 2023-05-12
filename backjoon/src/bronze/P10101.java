package bronze;
/*
문제 번호 : P10101
문제 이름 : 삼각형 외우기
 */

import java.io.*;

public class P10101 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int z = Integer.parseInt(br.readLine());

        if(x+y+z != 180){
            bw.write("Error");
        } else if (x==y && y==z && z==x) {
            bw.write("Equilateral");
        } else if (x == y || y == z || z == x) {
            bw.write("Isosceles");
        } else {
            bw.write("Scalene");
        }
        bw.flush();
    }
}
