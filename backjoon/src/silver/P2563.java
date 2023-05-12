package silver;

/*
문제번호 : P2563
문제이름 : 색종이
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P2563 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int surface = 0;
        int[][] background = new int[100][100];
        for(int i = 0; i <100; i++){
            for(int j = 0; j < 100; j++){
                background[i][j] = 0;
            }
        }

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++ ){
            st= new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for(int j = a; j < a+10; j ++){
                for(int k = b; k < b+10; k++){
                    background[j][k] = 1;
                }
            }
        }

        for(int i = 0; i <100; i++){
            for(int j = 0; j < 100; j++){
                if(background[i][j] == 1){
                    surface++;
                }
            }
        }
        bw.write(surface+"");
        bw.flush();

    }
}
