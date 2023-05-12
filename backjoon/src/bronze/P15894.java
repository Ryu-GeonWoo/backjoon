package bronze;
/*
문제번호 : P15894
문제이름 : 수학은 체육과목 입니다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P15894 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.printf("%d",n*4L);
    }
}
