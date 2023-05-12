package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제번호 : P2903
문제이름 : 중앙 이동 알고리즘
 */
public class P2903 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        n = (int)Math.pow(2, n)+1;
        System.out.print(n*n);


    }
}
