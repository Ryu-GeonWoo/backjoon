package bronze;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
/*
문제번호 : P10813
문제이름 : 공 바꾸기
 */
public class P10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //바구니 개수
        int M = Integer.parseInt(st.nextToken()); //공 넣는 횟수
        int[] bucket = new int[N];
        for(int i = 0; i<N;i++){
            bucket[i]= i+1;
        }

        for(int n = 0;n < M; n++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;
            int tmp;

            tmp = bucket[i];
            bucket[i]=bucket[j];
            bucket[j]= tmp;

        }
        for(int i =0; i<N; i++){
            bw.write(bucket[i] + " ");
        }
        bw.flush();
    }
}
