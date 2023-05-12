package bronze;

import java.io.*;
/*
문제번호 : P27866
문제이름 : 코딩은 체육과목 입니다
 */

public class P25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String a = "long";

        for(int i = 0; i < num/4; i++){
            bw.write(a+" ");
        }
        bw.write("int");

        bw.flush();
    }
}