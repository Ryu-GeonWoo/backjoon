package bronze;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
/*
문제번호 : P10810
문제이름 : 공 넣기
 */
public class P10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //바구니 개수
        int M = Integer.parseInt(st.nextToken()); //공 넣는 횟수
        int[] bucket = new int[N];

        for(int n = 0;n < M; n++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for(int a = i-1;  a < j; a++) {
                bucket[a] = k;
            }
        }
        for(int i =0; i<N; i++){
            bw.write(bucket[i] + " ");
        }
        bw.flush();
    }
}
