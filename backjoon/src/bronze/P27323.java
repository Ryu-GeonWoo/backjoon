package bronze;

import java.io.*;
/*
문제번호 : P2732
문제이름 : 직사각형
 */

public class P27323 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        bw.write( A*B +" ");
        bw.flush();
    }
}
