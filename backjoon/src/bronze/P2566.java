package bronze;

import java.io.*;
import java.util.StringTokenizer;
/*
문제번호 : P2566
문제이름 : 최댓값
 */
public class P2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int max = 0;
        int x = 0, y = 0;
        int n = 9, m = 9;
        int[][] numbers = new int[n][m];
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                numbers[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(numbers[i][j]>=max){
                    max = numbers[i][j];
                    x = i+1;
                    y = j+1;
                }
            }
        }
        bw.write(max + "\n");
        bw.write(x+" "+y);
        bw.flush();

    }
}
