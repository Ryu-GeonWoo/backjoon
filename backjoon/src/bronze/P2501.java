package bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
/*
문제번호 : P2501
문제이름 : 약수 구하기
 */
public class P2501 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> prime = new ArrayList<>();
        for(int i = 1; i<= n; i++){
            if(n%i == 0){
                prime.add(i);
            }
        }

        if(prime.size() < k){
            bw.write("0");
        } else{
            bw.write(""+prime.get(k-1));
        }
        bw.flush();
    }
}
