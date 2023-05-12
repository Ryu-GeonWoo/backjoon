package bronze;

import java.io.*;
import java.util.StringTokenizer;
/*
문제번호 : P10812
문제이름 : 바구니 순서 바꾸기
 */
public class P10812 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken()); // 줄의 갯수

        int[] bucket = new int[N];
        for(int i = 1; i <= N; i++){
            bucket[i-1] = i;
        }

        for(int a = 0; a < M; a++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;
            int k = Integer.parseInt(st.nextToken())-1;
            int[] change = new int[j-i+1];
            int index = 0;
            int change_index =0;
            for(int x = k; x <= j; x++){
                change[index++] = bucket[x];
            }
            for(int x = i; x < k; x++){
                change[index++] = bucket[x];
            }
            for(int x = i; x <= j; x++,change_index++){
                bucket[x] = change[change_index];
            }
        }
        for(int i : bucket){
            bw.write(i+" ");
        }
        bw.flush();
    }
}
