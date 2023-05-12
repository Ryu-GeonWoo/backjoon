package bronze;

import java.io.*;
/*
문제번호 : P27866
문제이름 : 문자와 문자열
 */

public class P27866 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());

        bw.write(str.charAt(n-1));
        bw.flush();

    }
}
