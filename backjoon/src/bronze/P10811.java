package bronze;

import java.io.*;
import java.util.StringTokenizer;
/*
문제번호 : P10811
문제이름 : 바구니 뒤집기
 */
public class P10811 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int tmp = 1;

        int[] bucket = new int[N];
        for(int i = 0; i < N; i++){
            bucket[i] = tmp;
            tmp++;
        }

        for(int i = 0;i < M ; i++){
            st= new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken())-1;
            int end = Integer.parseInt(st.nextToken())-1;
            while(start < end){
                tmp = bucket[start];
                bucket[start]=bucket[end];
                bucket[end]=tmp;
                start++;
                end--;
            }
        }

        for (int i : bucket) {
            bw.write(i+" ");
        }
        bw.flush();
    }
}
