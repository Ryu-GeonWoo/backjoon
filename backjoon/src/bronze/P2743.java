package bronze;

import java.io.*;
/*
문제번호 : P2743
문제이름 : 단어 길이 재기
 */
public class P2743 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        bw.write(str.length()+"");
        bw.flush();
    }
}
