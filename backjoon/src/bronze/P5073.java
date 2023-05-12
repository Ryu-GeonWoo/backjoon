package bronze;

import java.io.*;
import java.util.StringTokenizer;

/*
문제 번호 : P5073
문제 이름 : 삼각형과 세 변
 */
public class P5073 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while (true){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            if(x==0 && y==0 && z==0){
                break;
            } else if (isTriangle(x,y,z) != true) {
                bw.write("Invalid\n");
            } else if (x==y && y==z && z==x) {
                bw.write("Equilateral\n");
            } else if (x==y || y==z || z==x) {
                bw.write("Isosceles\n");
            } else {
                bw.write("Scalene\n");
            }
            bw.flush();

        }
    }

    private static boolean isTriangle(int x, int y, int z) {
        int max =Math.max(Math.max(x,y),z);
        if(max == x){
            if( max < (y+z)){
                return true;
            }
        } else if (max == y) {
            if( max < (x+z)){
                return true;
            }
        } else if (max == z) {
            if( max < (x+y)){
                return true;
            }
        }
        return false;
    }
}
